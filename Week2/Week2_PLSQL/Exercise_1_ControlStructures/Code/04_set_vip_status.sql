BEGIN
    FOR rec IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
        UPDATE customers
        SET is_vip = 'Y'
        WHERE customer_id = rec.customer_id;
    END LOOP;
    COMMIT;
END;
/