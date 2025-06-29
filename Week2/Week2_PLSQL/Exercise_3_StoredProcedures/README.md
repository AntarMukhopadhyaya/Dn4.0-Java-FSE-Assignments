# StoredProcedures

This exercise demonstrates how to use **PL/SQL stored procedures** in **Oracle 21c XE** to implement real-world banking operations such as applying interest, updating employee bonuses, and transferring funds securely.

## Features
- Implements three key stored procedures:
  - `ProcessMonthlyInterest` – Applies monthly 1% interest to all savings accounts.
  - `UpdateEmployeeBonus` – Adds a department-specific bonus to employee salaries.
  - `TransferFunds` – Transfers funds between two accounts with balance check and rollback.
- Demonstrates:
  - IN parameters
  - Exception handling (`RAISE`, `ROLLBACK`)
  - DML operations (UPDATE)
  - Output using `DBMS_OUTPUT`

## Scenarios
- **Scenario 1**: Apply 1% monthly interest to all savings accounts.
- **Scenario 2**: Add a percentage-based bonus to salaries in a given department.
- **Scenario 3**: Transfer funds between two accounts, ensuring the source has enough balance.

## SQL Files
- `01_create_accounts_table.sql` – Creates the `accounts` and `employees` table.
- `02_insert_dummy_data.sql` – Adds sample data to `accounts` and `employees`.
- `03_monthly_interest_proc.sql` – Procedure: `ProcessMonthlyInterest`.
- `04_update_bonus_proc.sql` – Procedure: `UpdateEmployeeBonus`.
- `05_transfer_funds_proc.sql` – Procedure: `TransferFunds`.


## Output Images
- `output_01_create_tables.png` – Screenshot after creating `employees` and `accounts` tables.
- `output_02_insert_dummy_data.png` – Screenshot after inserting dummy data into the tables.
- `output_03_monthly_interest_proc.png` – Screenshot after applying monthly interest.
- `output_update_bonus_proc.png` – Screenshot after updating employee bonuses.
- `output_transfer_fund_proc.png` – Screenshot showing successful or failed fund transfer.
