CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_id IN NUMBER,
    bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;

    COMMIT;
END;
/
