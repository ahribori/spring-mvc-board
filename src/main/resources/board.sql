drop table articles
create table articles(
	article_no number primary key,
	category varchar2(50) not null,
	title varchar2(100) not null,
	contents clob not null,
	writer varchar2(50) not null,
	good number default 0,
	bad number default 0,
	hits number default 0,
	regdate date default sysdate
)

drop sequence articles_seq
create sequence articles_seq

select * from articles



select * from (select rownum as rnum,a.* from (select * from articles order by article_no desc) a where rownum<=20) where rnum>=1