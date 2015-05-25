package org.daniel.board.dao;

import org.daniel.board.exception.IdNotFoundException;
import org.daniel.board.model.Member;

public interface MemberDao {
	public Member LoginCheck(String id, String password) throws IdNotFoundException;
}
