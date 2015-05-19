package org.daniel.board.service;

import org.daniel.board.dao.BoardDao;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao;

	public BoardServiceImpl(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}
	
}
