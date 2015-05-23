package org.daniel.board.web;

import javax.annotation.Resource;

import org.daniel.board.model.Article;
import org.daniel.board.model.Page;
import org.daniel.board.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping(value="/article/{no}")
	public ModelAndView getArticle(@PathVariable int no) {
		ModelAndView mv = new ModelAndView("article");
		mv.addObject("article", boardService.getArticle(no));
		return mv;
	}
	
	@RequestMapping(value="/register")
	public ModelAndView getArticle(Article article) {
		ModelAndView mv = new ModelAndView("redirect:/");
		boardService.insertArticle(article);
		return mv;
	}
}
