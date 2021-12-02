insert into student(Name,Address,Phone,Age)values("Harsh","Delhi",1234567895,18);
insert into student(Name,Address,Phone,Age)values("Pratik","Bihar",9963543276,19);
insert into student(Name,Address,Phone,Age)values("Priyanka","Bangalore",8097567320,120);
insert into student(Name,Address,Phone,Age)values("Deep","Mumbai",6056789043,28);
insert into student(Name,Address,Phone,Age)values("Durga","Noida",8045678901,38);
insert into student(Name,Address,Phone,Age)values("Pritam","Puri",6347890235,18);
insert into student(Name,Address,Phone,Age)values("Amit","Lucknow",9912746293,22);
insert into student(Name,Address,Phone,Age)values("Naveen","Pune",8097456240,27);
insert into student(Name,Address,Phone,Age)values("Bhargav","Visakhapatnam",9078905672,32);

select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id from studentcourse INNER JOIN student where student.Age>=25;

select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id from studentcourse LEFT JOIN  student ON student.Roll_No=studentcourse.Roll_No

select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id from student RIGHT JOIN  studentcourse ON studentcourse.Roll_No=student.Roll_No;

select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id from studentcourse LEFT JOIN  student ON student.Roll_No=studentcourse.Roll_No
Union all 
select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id from student RIGHT JOIN  studentcourse ON studentcourse.Roll_No=student.Roll_No;

select student.Roll_No,student.Name,student.Address,studentcourse.Course_Id,student.Age from student CROSS JOIN studentcourse;

select s1.Name,s2.Address, s2.Age, s1.Course_Id from student s1, student s2 where s1.Roll_No=s2.Roll_No;
