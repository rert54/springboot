create table if no exists todo
( id int auto_increment,
	userid varchar(255) not null,
	description varchar(255) not null,
	tatget_date date not null,
	done boolean,
	primary key(id)
);

create table if no exists member
( userid varchar(255),
	passward varchar(255) not null,
	username date not null,
	roll varchar(255) default 'USER' non null,
	primary key(userid)
);