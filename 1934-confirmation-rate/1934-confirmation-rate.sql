# Write your MySQL query statement below
Select s.user_id, Round(ifnull(SUM(c.action='confirmed')/SUM(c.action is not null),0),2) as confirmation_rate
from Signups s
left join Confirmations c
On s.user_id = c.user_id
group by s.user_id;