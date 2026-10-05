# Write your MySQL query statement below
Select a.name from Employee a join employee b
on a.id = b.managerId 
group by a.id,b.managerId 
having count(b.managerId) >= 5
