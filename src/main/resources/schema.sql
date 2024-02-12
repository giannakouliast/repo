CREATE TABLE IF NOT EXISTS donor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    ssn VARCHAR(11), -- Assuming SSN format without dashes for simplicity
    email VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    sex VARCHAR(6) NOT NULL
);

--DROP TABLE IF EXISTS TBL_DONATION_RECORD;
--DROP TABLE IF EXISTS TBL_DONATION_APPLICATION;
--DROP TABLE IF EXISTS TBL_DONORS;
--DROP TABLE IF EXISTS TBL_EMPLOYEES;
--DROP TABLE IF EXISTS TBL_USERS;
--DROP TABLE IF EXISTS TBL_BLOOD_TYPE;
--DROP TABLE IF EXISTS TBL_ROLES;
--
--CREATE TABLE TBL_ROLES (
--  role_id INT AUTO_INCREMENT PRIMARY KEY,
--  type CHAR(1) NOT NULL,
--  role_desc VARCHAR(10) NULL
-- );
--
--CREATE TABLE TBL_BLOOD_TYPE (
--  blood_type_id INT AUTO_INCREMENT PRIMARY KEY,
--  blood_type VARCHAR(3) NOT NULL
--);
--
--CREATE TABLE TBL_USERS (
--	ssn INT PRIMARY KEY,
--	user_id INT AUTO_INCREMENT,
--	email VARCHAR(50) NOT NULL,
--	password VARCHAR(25) NOT NULL,
--	role_id INT
--);
--
--CREATE TABLE TBL_EMPLOYEES (
--  employee_id INT AUTO_INCREMENT  PRIMARY KEY,
--  ssn INT NOT NULL,
--  user_id INT NOT NULL,
--  first_name VARCHAR(36) NOT NULL,
--  last_name VARCHAR(36) NOT NULL,
--  email VARCHAR(50) NOT NULL,
--  password VARCHAR(25) NOT NULL,
--  role_id INT NOT NULL
--);
--ALTER TABLE TBL_EMPLOYEES
--	ADD FOREIGN KEY (role_id)
--	REFERENCES TBL_ROLES(role_id);
--ALTER TABLE TBL_EMPLOYEES
--	ADD FOREIGN KEY (user_id)
--	REFERENCES TBL_USERS(user_id);
--ALTER TABLE TBL_EMPLOYEES
--	ADD FOREIGN KEY (ssn)
--	REFERENCES TBL_USERS(ssn);
--
--
--CREATE TABLE TBL_DONORS (
--  donor_id INT AUTO_INCREMENT PRIMARY KEY,
--  ssn INT NOT NULL,
--  user_id INT NOT NULL,
--  first_name VARCHAR(36) NOT NULL,
--  last_name VARCHAR(36) NOT NULL,
--  email VARCHAR(50) NOT NULL,
--  password VARCHAR(25) NOT NULL,
--  phone VARCHAR(13) NOT NULL,
--  blood_type_id INT NOT NULL,
--  role_id INT NOT NULL
--);
--ALTER TABLE TBL_DONORS
--	ADD FOREIGN KEY (role_id)
--	REFERENCES TBL_ROLES(role_id);
--
--ALTER TABLE TBL_DONORS
--	ADD FOREIGN KEY (user_id)
--	REFERENCES TBL_USERS(user_id);
--
--ALTER TABLE TBL_DONORS
--	ADD FOREIGN KEY (blood_type_id)
--	REFERENCES TBL_BLOOD_TYPE(blood_type_id);
--	
--ALTER TABLE TBL_DONORS
--	ADD FOREIGN KEY (ssn)
--	REFERENCES TBL_USERS(ssn);
--	
--	
--CREATE TABLE TBL_DONATION_APPLICATION (
--  don_app_rec_id INT AUTO_INCREMENT PRIMARY KEY,
--  ssn INT NOT NULL,
--  last_name VARCHAR(36) NOT NULL,
--  blood_type_id INT NOT NULL,
--  status CHAR(1) DEFAULT 'S' NOT NULL
--);
--ALTER TABLE TBL_DONATION_APPLICATION
--	ADD FOREIGN KEY (ssn)
--	REFERENCES TBL_DONORS(ssn);
--
--ALTER TABLE TBL_DONATION_APPLICATION
--	ADD FOREIGN KEY (blood_type_id)
--	REFERENCES TBL_BLOOD_TYPE(blood_type_id);
--
--
--CREATE TABLE TBL_DONATION_RECORD (
--  don_rec_id INT AUTO_INCREMENT PRIMARY KEY,
--  ssn INT NOT NULL,
--  last_name VARCHAR(36) NOT NULL,
--  blood_type_id INT NOT NULL
--);
--ALTER TABLE TBL_DONATION_APPLICATION
--	ADD FOREIGN KEY (ssn)
--	REFERENCES TBL_DONORS(ssn);
--
--ALTER TABLE TBL_DONATION_APPLICATION
--	ADD FOREIGN KEY (blood_type_id)
--	REFERENCES TBL_BLOOD_TYPE(blood_type_id);
--
--  
--/**
--CREATE TABLE IF NOT EXISTS TBL_EMPLOYEES (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  first_name VARCHAR(250) NOT NULL,
--  last_name VARCHAR(250) NOT NULL,
--  email VARCHAR(250) DEFAULT NULL
--);
--
--**/
