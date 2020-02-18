create schema market;
create table market.category
(
    category_id int(11) unsigned auto_increment primary key ,
    name varchar(45) not null
);
create table market.product
(
    product_id int(11) unsigned auto_increment primary key ,
    name varchar(45) not null ,
    desription varchar(512) not null ,
    price float ,
    category_id int(11) unsigned ,
    foreign key (category_id) references market.category(category_id)
);
create table  market.orders
(
    order_id int(11) unsigned auto_increment primary key,
    product_id int(11) unsigned ,
    purchase_date date ,
    customer_name varchar(50) not null ,
    amount float ,
    foreign key (product_id) references market.product(product_id)
);