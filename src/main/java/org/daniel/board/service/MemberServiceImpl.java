package org.daniel.board.service;

import javax.annotation.Resource;

import org.daniel.board.dao.MemberDao;
import org.daniel.board.exception.IdNotFoundException;
import org.daniel.board.model.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Resource
	private MemberDao memberDao;
	
	@Override
	public Member LoginCheck(String id, String password) throws IdNotFoundException {
		return memberDao.LoginCheck(id, password);
	}

}
