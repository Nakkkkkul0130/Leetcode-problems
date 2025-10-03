# Write your MySQL query statement below
Select e.name 
from Employee e
join Employee r On e.id = r.managerId
Group by e.id, e.name
HAVING COUNT(r.id) >= 5

