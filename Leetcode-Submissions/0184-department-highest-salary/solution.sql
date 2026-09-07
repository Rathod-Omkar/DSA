SELECT Department, Employee, Salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        MAX(e.salary) OVER (PARTITION BY e.departmentId) AS maxSalary
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
) AS x
WHERE Salary = maxSalary;
