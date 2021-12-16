use boot_camp;
create table orders(id int,order_date date, status varchar(50),customer_id int);
insert into orders values(10100,'2003-01-06',"Placed",363);
insert into orders values(10101,'2003-01-06',"Placed",128);
insert into orders values(10102,'2003-01-06',"In Transit",181);
insert into orders values(10103,'2003-01-06',"Delivered",121);
insert into orders values(10104,'2003-01-07',"Delivered",114);
insert into orders values(10106,'2003-01-07',"In Transit",278);
insert into orders values(10120,'2003-01-07',"Placed",114);
insert into orders values(10122,'2003-05-05',"In Transit",350);
insert into orders values(10123,'2003-05-05',"Delivered",103);

select * from orders;

select id,order_date,status,customer_id from orders where status <> "Delivered" order by id ASC Limit 6;