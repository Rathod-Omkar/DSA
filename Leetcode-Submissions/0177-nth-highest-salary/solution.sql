CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

  RETURN (
            select distinct x.salary from
            (select distinct Dense_RANK() over(order by salary desc)as nums,salary from Employee)
            as x where nums = N

  );
END
