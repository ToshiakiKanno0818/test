drop database if exists ecsite2;

create database if not exists ecsite2;
use ecsite2;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,		/* ログインID */
login_pass varchar(16),				/* ログインパスワード */
user_name varchar(50),				/* ユーザーネーム */
user_namefirst varchar(50),			/* 姓 */
user_namelast varchar(50),			/* 名 */
user_canafirst varchar(50),			/* セイ */
user_canalast varchar(50),			/* メイ */
user_postcode varchar(50),			/* 郵便番号 */
user_prefecture varchar(50),		/* 都道府県 */
user_city varchar(50),				/* 市区町村 */
user_address varchar(50),			/* 番地 */
user_tel varchar(50),				/* 電話番号 */
user_mail varchar(50),				/* メールアドレス */
gender varchar(16),					/* 性別 */
insert_date datetime,
updated_date datetime
);



drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);


INSERT INTO item_info_transaction(item_name, item_price, item_stock) VALUES("NoteBook", 100, 50);
INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01", "test");