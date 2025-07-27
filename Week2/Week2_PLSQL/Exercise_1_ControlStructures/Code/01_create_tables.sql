-- Create Customers table
CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    age NUMBER,
    balance NUMBER(10, 2),
    interest_rate NUMBER(5, 2),
    is_vip CHAR(1)
);

-- Create Loans table
CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER REFERENCES customers(customer_id),
    due_date DATE,
    amount NUMBER(10,2)
);