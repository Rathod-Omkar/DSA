# Write your MySQL query statement below
-- select s.product_id,product_name from Sales s left join Product p
-- on p.product_id = s.product_id 
-- WHERE s.sale_date<='2019-01-01' AND s.sale_date>='2019-03-31'
-- ;
select distinct s.product_id,product_name from Product p join Sales s
on p.product_id = s.product_id
where
not 
s.product_id
in
(select product_id from Sales where not sale_date between '2019-01-01' and '2019-03-31')
;
