package org.daniel.board.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.daniel.board.exception.IdNotFoundException;
import org.daniel.board.model.Member;
import org.daniel.board.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Resource
	private MemberService memberService;
	
	@RequestMapping(value="/login")
	public String login(String id, String password, String path, HttpServletRequest request) {
		String url = "redirect:login.jsp";
		try {
			Member member = memberService.LoginCheck(id, password);
			if(member != null) {
				HttpSession session = request.getSession(false);
				session.setAttribute("auth_info", member);
				url="/"+path;
			} else {
				log.info(id + "의 비밀번호가 틀렸습니다.");
			}
		} catch (IdNotFoundException e) {
			log.info(e.getMessage());
		}
		return "redirect:" + url ;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "redirect:/";
	}

}
