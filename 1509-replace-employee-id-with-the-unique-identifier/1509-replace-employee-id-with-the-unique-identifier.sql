# Write your MySQL query statement below
Select uni.unique_id, e.name
from Employees e
Left Join EmployeeUNI uni
On uni.id = e.id;