# Write your MySQL query statement below
Select Product.product_name, Sales.year, Sales.price 
from Product 
Right join Sales
On Product.product_id = Sales.product_id;