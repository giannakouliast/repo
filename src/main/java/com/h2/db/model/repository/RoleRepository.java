package com.h2.db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.db.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByType(char type);
}