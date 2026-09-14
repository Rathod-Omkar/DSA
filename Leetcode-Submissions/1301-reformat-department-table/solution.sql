# Write your MySQL query statement below
select id,
            max(case
            When month='Jan' then revenue
            ELSE null
            END ) as Jan_Revenue,
            max(case
            When month='Feb' then revenue
            ELSE null
            END ) as Feb_Revenue,
            max(case
            When month='Mar' then revenue
            ELSE null
            END ) as Mar_Revenue,
            max(case
            When month='Apr' then revenue
            ELSE null
            END ) as Apr_Revenue,
            max(case
            When month='May' then revenue
            ELSE null
            END ) as May_Revenue,
            max(case
            When month='Jun' then revenue
            ELSE null
            END ) as Jun_Revenue,
            max(case
            When month='Jul' then revenue
            ELSE null
            END ) as Jul_Revenue,
            max(case
            When month='Aug' then revenue
            ELSE null
            END ) as Aug_Revenue,
            max(case
            When month='Sep' then revenue
            ELSE null
            END ) as Sep_Revenue,
            max(case
            When month='Oct' then revenue
            ELSE null
            END ) as Oct_Revenue,
            max(case
            When month='Nov' then revenue
            ELSE null
            END ) as Nov_Revenue,
            max(case
            When month='Dec' then revenue
            ELSE null
            END ) as Dec_Revenue
 from Department group by id;
