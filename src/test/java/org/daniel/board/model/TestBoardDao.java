package org.daniel.board.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBoardDao {
	
	private ApplicationContext ctx;
	private BoardDao boardDao;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("test.xml");
		assertNotNull(ctx);
		boardDao = (BoardDao) ctx.getBean("boardDao");
		assertNotNull(boardDao);
	}

	@Test
	public void test() {
		System.out.println("good!");
	}

}
