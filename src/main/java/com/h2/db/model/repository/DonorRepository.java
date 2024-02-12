package com.h2.db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2.db.model.Donor;
import com.h2.db.model.Employee;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}

//@Repository
//public interface DonorRepository extends CrudRepository<Donor, Long> {
//	Donor findBySsn(String ssn);
//	Donor findByEmail(String email);
//}
