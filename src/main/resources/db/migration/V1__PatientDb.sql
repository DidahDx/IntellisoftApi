CREATE TABLE patient_detail(patient_number_id INTEGER NOT NULL PRIMARY KEY,
first_name VARCHAR(100) NOT NULL,last_name VARCHAR(100) NOT NULL,
 gender VARCHAR(10) NOT NULL, registration_date DATE NOT NULL,date_of_birth DATE NOT NULL);

 CREATE TABLE patient_vitals(patient_number_id INTEGER NOT NULL PRIMARY KEY,
  visit_date DATE NOT NULL, height NUMERIC NOT NULL, weight NUMERIC NOT NULL, bmi NUMERIC NOT NULL);
