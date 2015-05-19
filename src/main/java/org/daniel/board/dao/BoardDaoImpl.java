package org.daniel.board.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class BoardDaoImpl implements BoardDao {
	
	private SqlSessionTemplate sqlSessionTemplate;

	public BoardDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
}
