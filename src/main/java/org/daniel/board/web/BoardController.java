package org.daniel.board.web;

import org.daniel.board.model.Page;
import org.daniel.board.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/articles")
	public ModelAndView getArticles() {
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("page", new Page(1378));
		mv.addObject("articles", "Object");
		return mv;
	}
	
}
