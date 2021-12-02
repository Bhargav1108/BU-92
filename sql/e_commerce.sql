create database e_commerce;

create table products(P_Id INT AUTO_INCREMENT, P_Name varchar(50), P_Category varchar(50),Price float,primary key(P_Id));

insert into products(P_Name,P_Category,Price)values("Trousers","Fashion",2000.0);
insert into products(P_Name,P_Category,Price)values("ASUS TUF Gaming","Electronics",50000.0);
insert into products(P_Name,P_Category,Price)values("Refrigirator","Electronics",25000.0);
insert into products(P_Name,P_Category,Price)values("Chocolates","Chocolates",200.0);
insert into products(P_Name,P_Category,Price)values("Cool Drinks","Soft Drinks",500.0);

create table customer(C_Id INT , C_Name Varchar(30),C_Contact varchar(10),C_Address varchar(50),C_Fare double, P_Id INT);
alter table customer ADD FOREIGN KEY(P_Id) references products(P_Id);
alter table customer ADD PRIMARY KEY(C_Id);
insert into customer values(1,"Durga",'9966775603','Assam',50000.0,1);
insert into customer values(2,"Raja",'6789056456','Mumbai',200.0,3);
insert into customer values(3,"Tony",'8097654324','Bangalore',25000.0,2);
insert into customer values(4,"John",'9875432678','Noida',500.0,5);
insert into customer values(5,"Tyrion",'8099674456','Chennai',2000.0,4);

create table Purchased(Payment_Id Int Not Null UNIQUE, P_Id int ,Payment_Mode varchar(20),Purchased_items int , C_Id Int);
alter table Purchased ADD FOREIGN KEY(C_Id) references customer(C_Id);
alter table Purchased ADD PRIMARY KEY(Payment_Id);
alter table Purchased ADD COLUMN Puchased_Date date;
alter table Purchased ADD COLUMN fare double;

insert into Purchased values(1234,3,"Liquid cash",4,2,curdate()-20);
insert into Purchased values(1235,1,"Debit card",1,1,curdate()-1,25000.0);

insert into Purchased values(1237,4,"Credit card",10,5,curdate()-18,50000.0);
insert into Purchased values(1238,5,"Liquid cash",2,4,curdate()-8,2000.0);

select * from products;

select p1.P_Id,p2.C_Id ,c1.C_Name,c1.C_Fare,p1.P_Name,p2.fare,p2.Payment_Id,p2.Payment_Mode 
from products p1, purchased p2 ,customer c1
where p1.P_Id = p2.P_Id;


