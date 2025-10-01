# Write your MySQL query statement below
Select pro.product_name, sal.year, sal.price
from Product pro
Right Join Sales sal
On pro.product_id = sal.product_id;