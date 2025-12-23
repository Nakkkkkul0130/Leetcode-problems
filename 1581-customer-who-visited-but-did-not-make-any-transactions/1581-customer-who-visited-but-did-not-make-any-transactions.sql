# Write your MySQL query statement below
Select v.customer_id, count(v.visit_id) as count_no_trans
from Visits v
Left join Transactions t
On v.visit_id = t.visit_id
where t.visit_id is null
Group by v.customer_id;



