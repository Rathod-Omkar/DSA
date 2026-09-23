# Write your MySQL query statement below
with cte as (select  id,case
    when (id%2) = 0 then id-1
    when  id = (select max(id) from Seat) then id
    else id+1
    end
    as num
    from Seat)

    select c.id,s.student from Seat s, cte c
    where c.num = s.id order by c.id;
