## Requirements

- Java JDK 8 or above
- MySQL Server
- MySQL Connector/J (JDBC driver)
- VS Code or any IDE for Java

## Setup Instructions

1. *Set up the database:*

   - Open database/product_catalog.sql in VS Code or MySQL Workbench.
   - Run the SQL script to create the database and products table.

2. *Add MySQL Connector:*

   - Download [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) and place it in a lib/ folder.
   - Make sure your Java program can access it in classpath.

3. *Compile and Run Java Program:*

```bash
# Compile
javac -cp ".;lib/mysql-connector-j-8.4.0.jar" src/Main.java

# Run
java -cp ".;lib/mysql-connector-j-8.4.0.jar;src" Main
