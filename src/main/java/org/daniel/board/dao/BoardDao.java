package org.daniel.board.dao;

import java.util.List;

import org.daniel.board.model.Article;
import org.daniel.board.model.Page;

public interface BoardDao {

	public int getTotalCount();

	public Article insertArticle(Article article);

	public Article getArticle(int no);

	public List<Article> getArticles(Page page);

	public List<Article> getArticlesByCategory(Page page, String category);

	public List<Article> getArticlesByWriter(Page page, String writer);

	public void updateArticle(Article article);

	public void upGood(int no);

	public void upBad(int no);

	public void upHits(int no);

}
