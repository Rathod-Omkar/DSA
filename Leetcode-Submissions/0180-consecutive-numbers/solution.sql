# Write your MySQL query statement below
select distinct x.num as ConsecutiveNums
from
(select if(lag(num) over(order by id) = num and lead(num) over(order by id) = num,num,null) as num from Logs) as x
where x.num is not null;
