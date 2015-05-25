package org.daniel.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String requestMappingValue = request.getRequestURI().split("/")[2];
		HttpSession session = request.getSession(false);
		if(session==null || session.getAttribute("auth_info")==null) {
			request.setAttribute("path", requestMappingValue);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return false;
		}
		return true;
	}
}
