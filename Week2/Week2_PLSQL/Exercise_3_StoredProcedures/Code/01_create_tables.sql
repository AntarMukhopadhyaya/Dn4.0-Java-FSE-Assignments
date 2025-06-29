-- Create Accounts table
CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    account_type VARCHAR2(20),
    balance NUMBER(10,2)
);
-- Create Employees table
CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    department_id NUMBER,
    salary NUMBER(10,2),
    performance_rating NUMBER(3,1)
);
