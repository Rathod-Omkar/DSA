# Write your MySQL query statement below
select c.id as Id from Weather p join Weather c on p.recordDate = date_sub(c.recordDate ,INTERVAL 1 day)
 where c.temperature > p.temperature;
