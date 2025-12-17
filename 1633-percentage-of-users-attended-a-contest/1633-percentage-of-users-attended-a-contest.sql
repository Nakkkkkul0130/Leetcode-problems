# Write your MySQL query statement below
Select r.contest_id, Round(Count(Distinct r.user_id) / (Select Count(*) from Users)*100,2) 
as percentage
from Register r
Group by r.contest_id
Order by percentage Desc, r.contest_id ASC;