drop database if exists coha;

create database if not exists coha;
use coha;

drop table if exists work_info;

create table work_info(
id int not null primary key auto_increment,
work_name varchar(32) unique,
work_description varchar(1024),
upload_date varchar(16),
image_file_path varchar(32),
image_file_name varchar(32),
music_file_path varchar(32)
);

drop table if exists blog_info;

create table blog_info(
id int not null primary key auto_increment,
insert_date varchar(16),
update_date varchar(16),
title varchar(32) unique,
category int,
news varchar(10000)
);



INSERT INTO work_info(work_name,work_description,upload_date,image_file_path,image_file_name,music_file_path) VALUES("降りやまぬ雨に", "", "2017/12/29", "/img/pic1.ipg", "降りやまぬ雨に", "/music/降りやまぬ雨に.wav");
INSERT INTO work_info(work_name,work_description,upload_date,image_file_path,image_file_name,music_file_path) VALUES("微睡みの森は祈り溢れて", "", "2018/04/07", "/img/pic2.ipg", "微睡みの森は祈り溢れて", "/music/微睡みの森は祈り溢れて.wav");


INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/01/01","null","あいうえお",1,"あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/02/02","null","かきくけこ",2,"かきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこかきくけこ");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/03/03","null","さしすせそ",1,"さしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそさしすせそ");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/04/04","null","たちつてと",2,"たちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてとたちつてと");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/05/05","null","なにぬねの",1,"なにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねのなにぬねの");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/06/06","null","はひふへほ",2,"はひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほはひふへほ");
INSERT INTO blog_info(insert_date,update_date,title,category,news) VALUES("2018/07/07","null","まみむめも",1,"まみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめもまみむめも");
