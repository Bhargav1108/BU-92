use boot_camp;
create table student (
roll_no int not null, 
name char(200),
mob_no varchar(35), 
primary key(roll_no)
);
insert into student values(1,'Rohit','9868475732 , 9489285980');
insert into student values(2,'Ajay','7890567365');
insert into student values(3,'Raj','7893532232');
insert into student values(4,'Durga','6309876543');
insert into student values(5,'Neha','1234567845');
insert into student values(6,'Madhu','9986743210');
insert into student values(7,'Bhargav','9868475732 , 9489285980');
select * from student ;
delete from student where roll_no=1;

# to execute the procedure 

set @var=0;
call boot_camp.new_procedure(@var);
select @var;
 use boot_camp;
 
 select boot_camp.newfunction(@var);
 use ticket;
 select * from ticket;


