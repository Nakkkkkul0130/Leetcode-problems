# Write your MySQL query statement below
Select n.name , b.bonus
from Employee n
Left join bonus b
On n.empid = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;

