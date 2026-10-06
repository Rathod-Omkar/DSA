# Write your MySQL query statement below
select name,sum(t.amount) as balance from Users u,Transactions t where u.account = t.account
 group by t.account having sum(t.amount) > 10000
