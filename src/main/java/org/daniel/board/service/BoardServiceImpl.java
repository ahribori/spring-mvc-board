package org.daniel.board.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.daniel.board.dao.BoardDao;
import org.daniel.board.model.Article;
import org.daniel.board.model.Page;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource
	private BoardDao boardDao;

	public BoardServiceImpl() {
		super();
	}

	public BoardServiceImpl(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public int getTotalCount() {
		return boardDao.getTotalCount();
	}

	@Override
	public Article insertArticle(Article article) {
		return boardDao.insertArticle(article);
	}

	@Override
	public Article getArticle(int no, Cookie cookie, HttpServletRequest request, HttpServletResponse response) {
		String history = "[" + no + "]";
		if(cookie!=null && cookie.getName().equals("upHitsHistory")) {
			history = cookie.getValue();
			if(!history.contains("["+no+"]")) {
				history += "[" + no + "]";
				cookie.setValue(history);
				cookie.setMaxAge(60*60*24);
				response.addCookie(cookie);
				this.upHits(no);
			}
		} else {
			Cookie c = new Cookie("upHitsHistory", history);
			c.setMaxAge(60*60*24);
			response.addCookie(c);
			this.upHits(no);
		}
		return boardDao.getArticle(no);
	}

	@Override
	public List<Article> getArticles(Page page) {
		return boardDao.getArticles(page);
	}

	@Override
	public List<Article> getArticlesByCategory(Page page, String category) {
		return boardDao.getArticlesByCategory(page, category);
	}

	@Override
	public List<Article> getArticlesByWriter(Page page, String writer) {
		return boardDao.getArticlesByWriter(page, writer);
	}

	@Override
	public void updateArticle(Article article) {
		boardDao.updateArticle(article);
	}

	@Override
	public void upGood(int no) {
		boardDao.upGood(no);
	}

	@Override
	public void upBad(int no) {
		boardDao.upBad(no);
	}

	@Override
	public void upHits(int no) {
		boardDao.upHits(no);
	}
	
}
