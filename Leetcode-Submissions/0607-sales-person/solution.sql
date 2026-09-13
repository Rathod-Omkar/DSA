# Write your MySQL query statement below
select Distinct e.name from SalesPerson e left join Orders o on 
e.sales_id = o.sales_id and o.com_id = (select com_id from Company where name = 'RED') where com_id is null;
