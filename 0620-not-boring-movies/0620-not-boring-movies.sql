# Write your MySQL query statement below
Select id, movie, description, rating from Cinema 
Where id % 2 = 1 and description != 'boring'
Order by rating DESC;