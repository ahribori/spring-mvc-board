package org.daniel.board.web;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.daniel.board.model.Article;
import org.daniel.board.model.Page;
import org.daniel.board.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Resource
	private BoardService boardService;
	
	@RequestMapping(value="/")
	public ModelAndView getArticles() {
		ModelAndView mv = new ModelAndView("board");
		Page page = new Page(boardService.getTotalCount());
		mv.addObject("articles", boardService.getArticles(page));
		mv.addObject("page",page);
		return mv;
	}
	
	@RequestMapping(value="/{no}")
	public ModelAndView getArticles(@PathVariable int no) {
		ModelAndView mv = new ModelAndView("board");
		Page page = new Page(no, boardService.getTotalCount());
		mv.addObject("articles", boardService.getArticles(page));
		mv.addObject("page",page);
		return mv;
	}
	
	@RequestMapping(value = "/article/{no}")
	public ModelAndView getArticle(@PathVariable int no,
			@CookieValue(value="upHitsHistory", required=false) Cookie cookie, HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("article", "article", boardService.getArticle(no, cookie, request, response));
	}
	
	@RequestMapping(value="/auth_registerForm")
	public String registerForm() {
		return "redirect:/register.jsp";
	}
	
	@RequestMapping(value="/register")
	public ModelAndView register(Article article) {
		ModelAndView mv = new ModelAndView("redirect:/");
		boardService.insertArticle(article);
		return mv;
	}
	
	@RequestMapping(value="/infinityScroll")
	public String infinityScrollView() {
		return "ajax_board";
	}
	
	@RequestMapping(value="/board.json")
	@ResponseBody
	public Object ajaxBoard(HttpServletRequest req) {
		String currentPage = req.getParameter("currentPage");
		System.out.println(currentPage);
		Page p = new Page(boardService.getTotalCount());
		p.setCurrentPage(1);
		p.setPageSize(30);
		return boardService.getArticles(p);
	}
	
}
