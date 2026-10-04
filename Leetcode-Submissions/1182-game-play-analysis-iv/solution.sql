select round(count(distinct a.player_id)/(select count(distinct player_id) from Activity),2)
 as fraction
from 
Activity a join Activity b
on a.player_id = b.player_id
 AND b.event_date = a.event_date + INTERVAL 1 DAY
where
a.event_date = (
    SELECT MIN(event_date)
    FROM Activity
    WHERE player_id = a.player_id
)


