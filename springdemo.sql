CREATE DATABASE springdemos;
USE springdemos;
CREATE TABLE user(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name CHAR(64), username CHAR(32), date TIMESTAMP);

CREATE USER 'springdemos'@'%' IDENTIFIED BY 'password';
ALTER USER 'springdemos'@'%' IDENTIFIED BY 'newPass';
GRANT ALL PRIVILEGES ON springdemos . * TO 'springdemos'@'%';
FLUSH PRIVILEGES;