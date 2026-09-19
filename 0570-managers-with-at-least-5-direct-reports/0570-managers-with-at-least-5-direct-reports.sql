# Write your MySQL query statement below

select n.name from employee n join employee e on n.id = e.managerID group by n.id,n.name Having count(e.id) >= 5; 