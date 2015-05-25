package org.daniel.board.service;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.daniel.board.model.Article;
import org.daniel.board.model.Page;

public interface BoardService {
	
	public int getTotalCount();

	public Article insertArticle(Article article);

	public Article getArticle(int no, Cookie cookie, HttpServletRequest request, HttpServletResponse response);

	public List<Article> getArticles(Page page);

	public List<Article> getArticlesByCategory(Page page, String category);

	public List<Article> getArticlesByWriter(Page page, String writer);

	public void updateArticle(Article article);

	public void upGood(int no);

	public void upBad(int no);

	public void upHits(int no);

}
