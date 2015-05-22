package org.daniel.board.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestPaging {

	Page page;
	
	@Before
	public void setUp() throws Exception {
		page = new Page(1389);
	}


	@Test
	public void test() {
		page.setCurrentPage(1);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(page);
		System.out.println(page.preview());
	}
}
