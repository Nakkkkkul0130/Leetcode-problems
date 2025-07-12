# Write your MySQL query statement below
SELECT emp.name AS Employee
from Employee emp
JOIN Employee mgr ON emp.managerId = mgr.id
where emp.salary > mgr.salary;
