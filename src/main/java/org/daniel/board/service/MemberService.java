package org.daniel.board.service;

import org.daniel.board.exception.IdNotFoundException;
import org.daniel.board.model.Member;

public interface MemberService {
	public Member LoginCheck(String id, String password) throws IdNotFoundException;
}
