# Write your MySQL query statement below
with order_table as 
(select customer_number, count(*) as order_count from Orders group by customer_number)

select customer_number from order_table o where order_count = (select max(order_count) from order_table);
