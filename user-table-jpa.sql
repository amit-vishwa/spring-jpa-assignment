SELECT * FROM springboot.user;

update user set user_name='amit' and roles='user' where id=1;

alter table user drop column active;
insert into user values ('1',1,'amit','ROLE_USER','amit');
insert into user values ('2',1,'rakesh','ROLE_ADMIN','rakesh');

drop table user;

create table user(
id int primary key not null,
active BIT default 1 not null,
password varchar(20) not null,
roles varchar(20) not null,
user_name varchar(20) not null
);