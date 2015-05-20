package org.daniel.board.model;

import static org.junit.Assert.assertNotNull;

import org.daniel.board.dao.BoardDao;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBoardDao {
	
	private ApplicationContext ctx;
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
		
		logger.debug("testGetTotalCount() ended...");
	}
	
	@Test
	public void testInsertArticle() {
		logger.debug("testInsertArticle() started...");
		
		logger.debug("testInsertArticle() ended...");
	}
	
	@Test
	public void testGetArticle() {
		logger.debug("testGetArticle() started...");
		
		logger.debug("testGetArticle() ended...");
	}

	@Test
	public void testGetAllArticles() {
		logger.debug("testGetAllArticles() started...");
		
		logger.debug("testGetAllArticles() ended...");
	}
	
	@Test
	public void testGetArticlesByCategory() {
		logger.debug("testGetArticlesByCategory() started...");
		
		logger.debug("testGetArticlesByCategory() ended...");
	}
	
	@Test
	public void testGetArticlesByWriter() {
		logger.debug("testGetArticlesByWriter() started...");
		
		logger.debug("testGetArticlesByWriter() ended...");
	}

}
