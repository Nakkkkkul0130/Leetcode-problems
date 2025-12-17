# Write your MySQL query statement below
Select p.project_id, ROUND (AVG(e.experience_years),2) as average_years
from Project p
Left Join Employee e
On p.employee_id = e.employee_id
group by p.project_id;