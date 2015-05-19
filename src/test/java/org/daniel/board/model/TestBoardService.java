package org.daniel.board.model;

import static org.junit.Assert.*;

import org.daniel.board.service.BoardService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBoardService {
	
	private ApplicationContext ctx;
	private BoardService boardService;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("test.xml");
		assertNotNull(ctx);
		boardService = (BoardService) ctx.getBean("boardService");
		assertNotNull(boardService);
	}

	@Test
	public void test() {
		System.out.println("good!");
	}

}
