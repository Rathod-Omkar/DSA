# Write your MySQL query statement below
select u.user_id as buyer_id,u.join_date,
count(if(user_id = o.buyer_id and order_date >= '2019-01-01' and order_date<= '2019-12-31',1,null)) as orders_in_2019
from 
Users u left join Orders o
on u.user_id = o.buyer_id
group by u.user_id,u.join_date
