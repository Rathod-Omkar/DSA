# Write your MySQL query statement below
With cte as (select requester_id as id from RequestAccepted
union all
select accepter_id as id from RequestAccepted)

select x.id,x.num 
from (select id, row_number() over(partition by id) as num from cte) as x
where x.num = (select max(x.num) 
from (select id, row_number() over(partition by id) as num from cte) as x)
;
