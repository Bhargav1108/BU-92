create database ticket;
create table Train(number INT,name varchar(100),source varchar(50),destination varchar(50),fare double);
create table passenger(id INT,name varchar(100),contact varchar(50),gender varchar(50),age Int);
create table Ticket(id INT,train_id int,passenger_id int,travel_date date,pnr varchar(15),total_fare double);
show tables;
alter table train RENAME COLUMN number To train_id;
alter table ticket ADD foreign key(train_id) references train(train_id);