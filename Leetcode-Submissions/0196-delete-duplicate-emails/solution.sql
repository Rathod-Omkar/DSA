# Write your MySQL query statement below
delete from Person 
where id in 
(select pp.id from 
(select d.id from Person p join Person d on p.email = d.email where p.id<d.id) as pp);
