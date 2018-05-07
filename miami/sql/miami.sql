drop database if exists miami;

create database if not exists miami;
use miami;

drop table if exists product_info;

create table product_info(
id int not null primary key auto_increment,
product_id int unique,
product_name varchar(100) unique,
product_name_kana varchar(100) unique,
product_discription varchar(255) unique,
category_id int,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime,
status tinyint DEFAULT '0',
regist_date datetime,
updated_date datetime
);

INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(1, "ハンバーガー", "はんばーがー", "discription1discription1discription1discription1discription1", 1, 500, "/img/pic1.jpg", "humberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(2, "チーズバーガー", "ちーずばーがー", "discription2discription2discription2discription2discription2", 2, 600, "/img/pic2.jpg", "cheeseberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(3, "product3", "３", "description3description3description3description3description3description3", 1, 500, "/img/pic1.jpg", "humberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(4, "product4", "４", "44444444444444444444444444444444444444444444", 3, 200, "/img/pic3.jpg", "fliedpotato");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(5, "product5", "５", "555555555555555555555555555555555555555555555555", 2, 600, "/img/pic2.jpg", "cheeseberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(6, "product6", "６", "6666666666666666666666666666666666666666666666", 3, 200, "/img/pic3.jpg", "fliedpotato");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(7, "product7", "７", "777777777777777777777777777777777777777777777", 1, 500, "/img/pic1.jpg", "humberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(8, "product8", "８", "888888888888888888888888888888888888888888", 2, 600, "/img/pic2.jpg", "cheeseberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(9, "product9", "９", "999999999999999999999999999999999999999999999999", 3, 200, "/img/pic3.jpg", "fliedpotato");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(10, "product10", "１０", "10101010101010101010101010101010101010101010101010", 1, 500, "/img/pic1.jpg", "humberger");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_discription, category_id, price, image_file_path, image_file_name) VALUES(11, "product11", "１１", "111111111111111111111111111111111111111111111111", 2, 600, "/img/pic2.jpg", "cheeseberger");