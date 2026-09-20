# Write your MySQL query statement below
-- select id,case
--             when p_id is null then 'Root'
--             when p_id = (select max(p_id) from Tree) then 'Leaf'
--             else 'Inner'
--             end as type

-- from 
-- Tree;

select id,case
            when p_id is null then 'Root'
            when id in (select p_id from tree ) then 'Inner'
            else 'Leaf'
            end as type

from 
Tree;
