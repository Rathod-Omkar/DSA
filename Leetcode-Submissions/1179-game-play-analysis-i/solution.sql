# Write your MySQL query statement below
-- select min(player_id),min(event_date) as first_login from Activity 
-- where
-- player_id = 
select player_id,min(event_date) as first_login from Activity group by player_id ;
