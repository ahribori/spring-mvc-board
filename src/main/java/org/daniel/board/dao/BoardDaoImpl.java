package org.daniel.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.daniel.board.model.Article;
import org.daniel.board.model.Page;
import org.mybatis.spring.SqlSessionTemplate;

public class BoardDaoImpl implements BoardDao {
	
	private SqlSessionTemplate sqlSessionTemplate;

	public BoardDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int getTotalCount() {
		return sqlSessionTemplate.selectOne("getTotalCount");
	}

	@Override
	public Article insertArticle(Article article) {
		System.out.println(article);
		sqlSessionTemplate.insert("insertArticle", article);
		return article;
	}

	@Override
	public Article getArticle(int no) {
		return sqlSessionTemplate.selectOne("getArticle",no);
	}

	@Override
	public List<Article> getArticles(Page page) {
		return sqlSessionTemplate.selectList("getArticles", page);
	}

	@Override
	public List<Article> getArticlesByCategory(Page page, String category) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("page", page);
		model.put("category", category);
		return sqlSessionTemplate.selectList("getArticlesByCategory", model);
	}

	@Override
	public List<Article> getArticlesByWriter(Page page, String writer) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("page", page);
		model.put("writer", writer);
		return sqlSessionTemplate.selectList("getArticlesByWriter", model);
	}

	@Override
	public void updateArticle(Article article) {
		sqlSessionTemplate.update("updateArticle", article);
	}

	@Override
	public void upGood(int no) {
		sqlSessionTemplate.update("upGood", no);
	}

	@Override
	public void upBad(int no) {
		sqlSessionTemplate.update("upBad", no);
	}

	@Override
	public void upHits(int no) {
		sqlSessionTemplate.update("upHits", no);
	}
	
}
