drop table articles
create table articles(
	no number primary key,
	category varchar2(50) not null,
	title varchar2(100) not null,
	contents clob not null,
	writer varchar2(50) not null,
	like number default 0,
	hate number default 0,
	hits number default 0,
	regdate date not null
)

drop sequence articles_seq
create sequence articles_seq