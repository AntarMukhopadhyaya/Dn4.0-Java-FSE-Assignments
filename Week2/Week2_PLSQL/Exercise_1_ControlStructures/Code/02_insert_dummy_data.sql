-- Insert Customers
INSERT INTO customers VALUES (1, 'Ravi', 65, 8000, 10, 'N');
INSERT INTO customers VALUES (2, 'Sneha', 45, 12000, 11, 'N');
INSERT INTO customers values(3,'Antar',30,5000,7.8,'N');
INSERT INTO customers VALUES (4, 'Arjun', 70, 15000, 9.5, 'N');


-- Insert Loans
INSERT INTO loans VALUES (101, 1, SYSDATE + 10, 5000);
INSERT INTO loans VALUES (102, 2, SYSDATE + 40, 8000);
INSERT INTO loans VALUES (103, 3, SYSDATE + 20, 12000);

COMMIT;