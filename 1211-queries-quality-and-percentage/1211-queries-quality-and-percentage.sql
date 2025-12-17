# Write your MySQL query statement below
Select query_name, Round(Sum(rating / position) / (Count(*)),2) as quality, 
Round(SUM(rating<3)/(Count(*))*100,2) as poor_query_percentage
from Queries
Group by query_name;
