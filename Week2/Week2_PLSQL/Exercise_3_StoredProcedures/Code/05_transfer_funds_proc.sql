CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_balance EXCEPTION;
    bal NUMBER;
BEGIN
    -- Get current balance
    SELECT balance INTO bal FROM accounts WHERE account_id = from_account;

    -- Check if sufficient
    IF bal < amount THEN
        RAISE insufficient_balance;
    END IF;

    -- Deduct from source
    UPDATE accounts
    SET balance = balance - amount
    WHERE account_id = from_account;

    -- Add to target
    UPDATE accounts
    SET balance = balance + amount
    WHERE account_id = to_account;

    COMMIT;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END;
/
