# Write your MySQL query statement below
select c.name from Customer c join Customer r on c.id = r.id 
where
 c.referee_id != 2 and r.referee_id != 2 or c.referee_id is null;
