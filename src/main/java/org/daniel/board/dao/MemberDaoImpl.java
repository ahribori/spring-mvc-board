package org.daniel.board.dao;

import javax.annotation.Resource;

import org.daniel.board.exception.IdNotFoundException;
import org.daniel.board.model.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public Member LoginCheck(String id, String password) throws IdNotFoundException {
		Member member = null;
		member = sqlSessionTemplate.selectOne("loginCheck", id);
		if(member == null) {
			throw new IdNotFoundException(id + "은(는) 존재하지 않는 id 입니다.");
		} else {
			member = member.getPassword().equals(password) ? member : null;
		}
		return member;
	}
}
