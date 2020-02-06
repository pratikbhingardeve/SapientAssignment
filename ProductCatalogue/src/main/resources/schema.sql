DROP TABLE IF EXISTS PRODUCTS;
 
CREATE TABLE PRODUCTS (
  id varchar(50) PRIMARY KEY,
  category VARCHAR(50) NOT NULL,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(200),
  brand VARCHAR(100),
  size VARCHAR(200),
  colour VARCHAR(200),
  price INT,
  qty INT
);