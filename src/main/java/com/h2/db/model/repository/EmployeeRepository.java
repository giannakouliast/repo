package com.h2.db.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2.db.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	Employee findBySsn(String ssn);
}
