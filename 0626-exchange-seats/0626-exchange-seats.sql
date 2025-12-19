# Write your MySQL query statement below
Select CASE 
    when id%2=1 and id != (Select MAX(id) from seat) then id+1
    when id%2=0 then id-1
    else id
    end as id, Student
from seat
Order by id ASC;