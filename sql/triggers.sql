# creating person table
CREATE TABLE person (name varchar(45), age int);

# data inserting into persons 

INSERT INTO person VALUES ('Bhargav', 25), ('Nazeer', 20);

CREATE TABLE average_age (average double);

INSERT INTO average_age SELECT AVG(age) FROM person;

SELECT * FROM average_age;


CREATE TABLE person_archive (
name varchar(45),
age int,
time timestamp DEFAULT NOW());

# before insert the trigger 
delimiter //
CREATE TRIGGER person_bi BEFORE INSERT
ON person
FOR EACH ROW
IF NEW.age < 18 THEN
SIGNAL SQLSTATE '50001' SET MESSAGE_TEXT = 'Person must be older than 18.';
END IF; //
delimiter ;

INSERT INTO person VALUES ('John', 14);

delimiter //
CREATE TRIGGER person_ai AFTER INSERT
ON person
FOR EACH ROW
UPDATE average_age SET average = (SELECT AVG(age) FROM person); //
delimiter ;

INSERT INTO person VALUES ('John', 19);
select * from average_age;

delimiter //
CREATE TRIGGER person_bu BEFORE UPDATE
ON person
FOR EACH ROW
IF NEW.age < 18 THEN
SIGNAL SQLSTATE '50002' SET MESSAGE_TEXT = 'Person must be older than 18.';
END IF; //
delimiter ;

UPDATE person SET age = 17 WHERE name = 'John';

delimiter //
CREATE TRIGGER person_au AFTER UPDATE
ON person
FOR EACH ROW
UPDATE average_age SET average = (SELECT AVG(age) FROM person); //
delimiter ;

UPDATE person SET age = 21 WHERE name = 'John';

select * from average_age;

delimiter //
CREATE TRIGGER person_bd BEFORE DELETE
ON person
FOR EACH ROW
INSERT INTO person_archive (name, age)
VALUES (OLD.name, OLD.age); //
delimiter ;

DELETE FROM person WHERE name = 'John';

select * from person_archive;

INSERT INTO person VALUES ('John', 21);

select * from person_archive;

delimiter //
CREATE TRIGGER person_ad AFTER DELETE
ON person
FOR EACH ROW
UPDATE average_age SET average = (SELECT AVG(person.age) FROM person); //
delimiter ;

delete from person where name='John';
select * from average_age;





