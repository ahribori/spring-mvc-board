package org.daniel.board.model;

import java.util.Date;

public class Article {

	private int no;
	private String category;
	private String title;
	private String contents;
	private String writer;
	private int good;
	private int bad;
	private int hits;
	private Date regdate;

	public Article() {
		super();
	}
	
	public Article(int no, String category, String title, String contents) {
		super();
		this.no = no;
		this.category = category;
		this.title = title;
		this.contents = contents;
	}

	public Article(String category, String title, String contents, String writer) {
		super();
		this.category = category;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}


	public Article(int no, String category, String title, String contents,
			String writer, int good, int bad, int hits, Date regdate) {
		super();
		this.no = no;
		this.category = category;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.good = good;
		this.bad = bad;
		this.hits = hits;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Article [no=" + no + ", category=" + category + ", title="
				+ title + ", contents=" + contents + ", writer=" + writer
				+ ", good=" + good + ", bad=" + bad + ", hits=" + hits
				+ ", regdate=" + regdate + "]";
	}

}
