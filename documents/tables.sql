create database yjyks;

use yjyks;

create table user(
	id int auto_increment,
    real_name varchar(30),
    account varchar(30),
    password varchar(30),
    email varchar(30),
    primary key(id)
)

