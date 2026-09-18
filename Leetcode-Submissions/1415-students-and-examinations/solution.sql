# Write your MySQL query statement below
With cte as (select s.student_id,student_name,su.subject_name
from 
 Students s join Subjects su )

 select distinct cte.student_id,cte.student_name,cte.subject_name,
 count(e.subject_name) as attended_exams
  from cte left join Examinations e
 on cte.student_id = e.student_id and cte.subject_name = e.subject_name 
 group by cte.student_id,cte.subject_name,cte.student_name
 order by cte.student_id,cte.subject_name
 ;
 
 
