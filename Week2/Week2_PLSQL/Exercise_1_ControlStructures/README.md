# PLSQLControlStructures

This exercise demonstrates how to use **PL/SQL Control Structures** in **Oracle 21c XE** to implement common banking operations such as updating interest rates, setting VIP status, and sending loan reminders.

## Features
- Applies control structures in **PL/SQL** using `FOR` loops and `IF` conditions.
- Demonstrates usage of:
  - Anonymous PL/SQL blocks
  - Conditional logic for updating interest rates
  - Flag setting for VIP customers
  - Date-based filtering using `SYSDATE`
  - Output logging using `DBMS_OUTPUT.PUT_LINE`

## Scenarios
- **Scenario 1**: Applies a 1% discount to loan interest rates for customers above 60 years old.
- **Scenario 2**: Flags customers as VIP if their balance exceeds $10,000.
- **Scenario 3**: Prints reminder messages for customers whose loans are due within the next 30 days.

## SQL Files
- `01_create_tables.sql` – Defines `customers` and `loans` tables.
- `02_insert_dummy_data.sql` – Populates tables with sample data.
- `03_discount_interest.sql` – Scenario 1 PL/SQL block.
- `04_set_vip_status.sql` – Scenario 2 PL/SQL block.
- `05_loan_reminders.sql` – Scenario 3 PL/SQL block using `DBMS_OUTPUT`.


## Output Images
- `output_02_insert_dummy_data.png` - Output after inserting dummy data into the tables.
- `output_03_discount_interest.png` – Output after running interest discount block.
- `output_04_set_vip_status.png` – Output after setting VIP status.
- `output_05_loan_reminders.png` – Screenshot showing reminder messages.


## Usage
1. Open **SQL\*Plus** or **SQL Developer**.
2. Connect as:
   ```bash
   sqlplus sys as sysdba
