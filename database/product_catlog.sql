-- Create Database
CREATE DATABASE IF NOT EXISTS product_catalog;
USE product_catalog;

-- Create Table
CREATE TABLE products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10,2) NOT NULL,
    stock_quantity INT DEFAULT 0
);

-- Insert Sample Data
INSERT INTO products (product_name, category, price, stock_quantity) VALUES
('Laptop', 'Electronics', 55000.00, 10),
('Smartphone', 'Electronics', 30000.00, 25),
('Headphones', 'Accessories', 2000.00, 50),
('Office Chair', 'Furniture', 7500.00, 5);