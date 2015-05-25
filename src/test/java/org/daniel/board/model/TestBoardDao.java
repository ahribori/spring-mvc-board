package org.daniel.board.model;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.daniel.board.dao.BoardDao;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBoardDao {
	
	private ApplicationContext ctx;
	@Resource(name="boardDaoImpl")
	private BoardDao boardDao;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("test.xml");
		assertNotNull(ctx);
		boardDao = (BoardDao) ctx.getBean("boardDao");
		assertNotNull(boardDao);
	}
	
	@Test
	public void testGetTotalCount() {
		logger.debug("testGetTotalCount() started...");
		int totalCount = boardDao.getTotalCount();
		logger.debug(totalCount+"");
		logger.debug("testGetTotalCount() ended...");
	}
	
	@Test
	public void testInsertArticle() {
		logger.debug("testInsertArticle() started...");
		String categoryList[] = {"free","qna","test"};
		String writerList[] = {"hs9923","admin","java","hello"};
		Random random = new Random();
		for(int i = 0 ; i < 100; i ++) {
			String category = categoryList[random.nextInt(3)];
			String title = "randomTitle : " + random.nextInt(99999);
			String contents = "randomContents : " + random.nextInt(99999);
			String writer = writerList[random.nextInt(4)];
			boardDao.insertArticle(new Article(category,title,contents,writer));
		}
		logger.debug("testInsertArticle() ended...");
	}
	
	@Test
	public void testGetArticle() {
		logger.debug("testGetArticle() started...");
		Article article = boardDao.getArticle(2);
		logger.debug(article.toString());
		logger.debug("testGetArticle() ended...");
	}

	@Test
	public void testGetArticles() {
		logger.debug("testGetArticles() started...");
		List<Article> list = boardDao.getArticles(new Page(2,boardDao.getTotalCount()));
		for (Article article : list) {
			logger.debug(article+"");
			System.out.println(article+"ㅇㄹㄴㄹㅇㄴㄹ");
		}
		logger.debug("testGetArticles() ended...");
	}
	
	@Test
	public void testGetArticlesByCategory() {
		logger.debug("testGetArticlesByCategory() started...");
		List<Article> list = boardDao.getArticlesByCategory(new Page(3, boardDao.getTotalCount()), "test");
		for (Article article : list) {
			logger.debug(article+"");
		}
		logger.debug("testGetArticlesByCategory() ended...");
	}
	
	@Test
	public void testGetArticlesByWriter() {
		logger.debug("testGetArticlesByWriter() started...");
		List<Article> list = boardDao.getArticlesByWriter(new Page(boardDao.getTotalCount()), "admin");
		for (Article article : list) {
			logger.debug(article+"");
		}
		logger.debug("testGetArticlesByWriter() ended...");
	}
	
	@Test
	public void testUpdateArticle() {
		logger.debug("testUpdateArticle() started...");
		boardDao.updateArticle(new Article(100, "test", "updated title", "업데이트 완료"));
		System.out.println(boardDao.getArticle(100));
		logger.debug("testUpdateArticle() ended...");
	}
	
	@Test
	public void testUpGood() {
		boardDao.upGood(100);
		System.out.println(boardDao.getArticle(100));
	}
	
	@Test
	public void testUpBad() {
		boardDao.upBad(100);
		System.out.println(boardDao.getArticle(100));
	}
	
	@Test
	public void testUpHits() {
		boardDao.upHits(100);
		System.out.println(boardDao.getArticle(100));
	}

}
