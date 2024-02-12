package com.h2.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ROLES")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    
    @Column(name="type", nullable=false, length=1)
    private char type;
    
	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

    @Override
    public String toString() {
        return "RoleEntity [role_id=" + role_id + ", type =" + type   + "]";
    }

	public Role get() {
		// TODO Auto-generated method stub
		return this;
	}

}