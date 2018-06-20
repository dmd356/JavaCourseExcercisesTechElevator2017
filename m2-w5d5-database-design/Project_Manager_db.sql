BEGIN;

CREATE TABLE departments
(
	department_number serial,
	name varchar(64) not null,
	CONSTRAINT pk_department_number PRIMARY KEY(department_number),
	--CONSTRAINT fk_employees_department_number FOREIGN KEY (employees) REFERENCES employees(dept_number)
);

CREATE TABLE projects
(
	project_number serial,
	name varchar(32) not null,
	startdate varchar(10) not null,
	dept_number integer not null,
	CONSTRAINT pk_project_serial PRIMARY KEY(project_number),
	CONSTRAINT fk_dept_number_department_number FOREIGN KEY(dept_number) REFERENCES departments(department_number)
);

CREATE TABLE employees
(
	employee_number serial,
	job_title varchar(32) not null,
	last_name varchar(32) not null,
	first_name varchar(32) not null,
	gender varchar(1) not null,
	birthday varchar(10) not null,
	hire_date varchar(10) not null,
	dept_number integer not null,
	proj_number integer not null,
	CONSTRAINT pk_employee_number PRIMARY KEY(employee_number),
	CONSTRAINT fk_dept_number_department_number FOREIGN KEY (dept_number) REFERENCES departments(department_number),
	CONSTRAINT fk_proj_number_prjects_project_number FOREIGN KEY (proj_number) REFERENCES projects(project_number)
	
	
);


--Employee Creation
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Manager', 'Hague', 'Mark', 'M', '04/30/1957', '04/04/2000', 1, 1);
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Manager', 'Lisa', 'Denver', 'F', '12/09/1972', '04/08/2005', 2, 2 );
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Programmer', 'Heisenberg', 'Walter', 'M', '05/02/1984', '07/06/2007', 3, 3 );
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Programmer', 'Chan', 'Matt', 'M', '04/30/1976', '06/07/2005', 3, 3);
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Manager', 'Bond', 'James', 'M', '04/30/1948', '04/04/1980', 4, 4);
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Writer', 'Twayne', 'Mark', 'M', '04/30/1957', '04/04/2000', 2, 2 );
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('ICON', 'Bunny', 'Bugs', 'R', '07/27/1940', '99/99/9999', 4, 4 );
INSERT INTO employees(job_title, last_name, first_name, gender, birthday, hire_date, dept_number, proj_number) VALUES ('Designated Smoker', 'Chainz', '2', 'M', '09/12/1977', '09/12/1977', 1, 1);


--Department Creation
INSERT INTO department(name) VALUES ('Human Resources');
INSERT INTO department(name) VALUES ('Finances');
INSERT INTO department(name) VALUES ('IT Department');
INSERT INTO department(name) VALUES ('Secret Service');

--Project Creation
INSERT INTO project(name, startdate, dept_number) VALUES ('Restoring the Rec Room', '10/08/2017', 1);
INSERT INTO project(name, startdate, dept_number) VALUES ('2018 Tax Plan', '10/10/2017', 2);
INSERT INTO project(name, startdate, dept_number) VALUES ('Project Stuff and Things', '10/09/2017', 3);
INSERT INTO project(name, startdate, dept_number) VALUES ('Finding Goldfinger', '10/08/2017', 4);

COMMIT;
