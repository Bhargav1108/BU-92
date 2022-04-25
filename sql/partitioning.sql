create schema partitioning;
use partitioning;

CREATE TABLE employees (
    id INT NOT NULL,
    fname VARCHAR(30),
    lname VARCHAR(30),
    hired DATE NOT NULL DEFAULT '1970-01-01',
    separated DATE NOT NULL DEFAULT '9999-12-31',
    job_code INT,
    store_id INT
)
PARTITION BY HASH(id)
(
PARTITION p1,
PARTITION p2,
PARTITION p3,
PARTITION p4
);

insert into employees values(1,'Bhargav','Mandadi','2000-01-01','2022-02-12',123,1);
insert into employees values(2,'Durga','Phukan','2010-01-01','2018-02-12',125,2);
insert into employees values(3,'Vasu','Jain','2012-01-01','2017-08-12',126,1);
 select * from employees partition(p4);