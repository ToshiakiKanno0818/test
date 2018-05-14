drop database if exists coha;

create database if not exists coha;
use coha;

drop table if exists work_info;

create table work_info(
id int not null primary key auto_increment,
work_name varchar(32) unique,
work_description varchar(1024),
update_year int,
update_month int,
update_date int,
image_file_path varchar(32),
image_file_name varchar(32),
music_file_path varchar(32)
);

INSERT INTO work_info(work_name,work_description,update_year,update_month,update_date,image_file_path,image_file_name,music_file_path) VALUES("降りやまぬ雨に", "", 2017, 12, 29, "/img/pic1.ipg", "降りやまぬ雨に", "/music/降りやまぬ雨に.wav");