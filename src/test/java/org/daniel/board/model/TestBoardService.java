package org.daniel.board.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBoardService {
	
	private ApplicationContext ctx;
	private BoardService boardService;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("test.xml");
		assertNotNull(ctx);
		boardService = (BoardService) ctx.getBean("boardService");
		assertNotNull(boardService);
	}

	@Test
	public void test() {
		System.out.println("good");
	}

}
