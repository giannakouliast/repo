package com.h2.db.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.db.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findBySsn(String ssn);	
    Optional<User> findByEmail(String email);
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(Object object);
    Boolean existsByEmail(String email);
}