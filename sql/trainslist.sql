create database ticketreservation;
use ticketreservation;
create table Trains(Train_no int(5),Train_Name varchar(40),Source varchar(20),Destination varchar(20),Ticket_fare int(7),primary key(Train_no));
select * from Trains;
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1001,'Shatabdi Express','Bangalore','Delhi',2500);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1002,'Shatabdi Express','Delhi','Bangalore',2500);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1003,'Udyan Express','Bangalore','Mumbai',1500);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1004,'Brindavan Express','Bangalore','Chennai',1000);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1005,'LTT Super Fast Express','Delhi','Mumbai',2800);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1006,'Guwahati Express','Guwahati','Chennai',1700);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1007,'Patna Super Fact Express','Patna','Bangalore',1900);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1008,'Secundrabad Express','Secundrabad','Visakhapatnam',800);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1009,'Howrah Amritsar Express','Howrah','Amritsar',2200);
insert into Trains(Train_no,Train_name,Source,Destination,Ticket_fare) values (1010,'Yesvantapur Tatanagr SuperFast Express','Yesvantapur','Tatanage',1800);empemp