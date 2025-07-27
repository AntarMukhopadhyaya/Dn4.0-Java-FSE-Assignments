# FactoryMethodPatternExample 

This is a simple implementation of the **Factory Method design pattern** for a Document Management System.

## Features
- Demonstrates how different document types are created using a common interface.
- Includes a test class called `TestFactory` to verify the factory behavior.
- Supportss the creation of:
    - Word documents
    - PDF documents
    - Excel Documents
- Factory classes used are (`WordFactory`,`PdfFactory`,`ExcelFactory`).

## Usage
Compile and run `TestFactory.java` to see the factory method in action.
It will create, open and close different document types using the appropriate factory classes.