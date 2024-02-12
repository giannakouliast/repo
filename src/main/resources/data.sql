--Insert roles
-- Admin
--INSERT INTO	TBL_ROLES (type) VALUES ('A');
-- Donor
--INSERT INTO	TBL_ROLES (type) VALUES ('D');
-- Employee
--INSERT INTO	TBL_ROLES (type) VALUES ('E');
--
--Insert Blood Types
--O− 	O+ 	A− 	A+ 	B− 	B+ 	AB− 	AB+ 
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('O−');
--INSERT INTO TBL_BLOOD_TYPE (blood_type) VALUES ('O+');
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('A−');
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('A+');
--INSERT INTO TBL_BLOOD_TYPE (blood_type) VALUES ('B-');
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('B+');
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('AB+');
--INSERT INTO	TBL_BLOOD_TYPE (blood_type) VALUES ('AB-');
--
--
--INSERT INTO TBL_USERS (ssn, email, password) VALUES (22224444,'admin@admin.com', 'admin');
--INSERT INTO TBL_USERS (ssn, email, password) VALUES (132451115,'spring.h2db@gmail.com', 'h2db');
--INSERT INTO TBL_USERS (ssn, email, password) VALUES (453125151,'donorship@donor.com', 'donor');
--
--
--
--INSERT INTO 
--	TBL_EMPLOYEES (ssn, user_id, first_name, last_name, email, password, role_id) 
--VALUES
--  	(22224444,(SELECT user_id FROM TBL_USERS u WHERE u.ssn = 22224444),'administrator', 'administrator', 'admin@admin.com',(SELECT password FROM TBL_USERS WHERE email = 'admin@admin.com'),(SELECT  role_id FROM TBL_ROLES r WHERE type = 'A')),
--  	(132451115,(SELECT user_id FROM TBL_USERS u WHERE u.ssn = 132451115),'spring', 'h2db', 'spring.h2db@gmail.com',(SELECT password FROM TBL_USERS WHERE email = 'spring.h2db@gmail.com'),(SELECT  role_id FROM TBL_ROLES r WHERE type = 'E')),
--  	(453125151,(SELECT user_id FROM TBL_USERS u WHERE u.ssn = 453125151),'Donor', 'Donoropoulos', 'donorship@donor.com',(SELECT password FROM TBL_USERS WHERE email = 'donorship@donor.com'), (SELECT  role_id FROM TBL_ROLES r WHERE type = 'D'));
--  	

INSERT INTO donor (first_name, last_name, ssn, email, date_of_birth, sex) VALUES
('John', 'Doe', '123456789', 'john.doe@example.com', '1980-01-01', 'Male'),
('Jane', 'Doe', '987654321', 'jane.doe@example.com', '1985-02-02', 'Female');
