select * from tab;
select * from seq;

create table board0( 
		         num number primary key,
                 writer varchar2(20) not null,
	    	     email varchar2(30),
                 subject varchar2(50) not null,
                 passwd varchar2(20) not null,
		         reg_date timestamp not null,
		         readcount number default 0,			
		         content varchar2(2000) not null,
		         ip varchar2(20) not null );

   create sequence board0_seq
	start with 1
	increment by 1
	nocache;
	
select * from board0;
