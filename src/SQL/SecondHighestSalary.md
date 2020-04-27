#RDBMS:MySQL
# Write your MySQL query statement below
SElECT (SELECT DISTINCt Salary  
from Employee
order by Employee.Salary DESC
limit 1, 1) as SecondHighestSalary;