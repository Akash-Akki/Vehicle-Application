DROP TABLE IF EXISTS Vehicle;
  
CREATE TABLE Vehicle(
  id INT AUTO_INCREMENT PRIMARY KEY,
  year INT,
  make VARCHAR(250),
  model VARCHAR(250) 
);