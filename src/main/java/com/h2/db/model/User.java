package com.h2.db.model;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table(name = "TBL_USERS")
public class User {

    @Id
    private Long ssn;
    
    @Column(name="user_id", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    
    @Column(name="email", nullable=false)
    private String email;
    
    @Column(name="password", nullable=false)
    private String password;
    
	public Long getId() {
		return user_id;
	}

	public void setId(Long user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    // Getters and setters

	public Long getSsn() {
		// TODO Auto-generated method stub
		return ssn;
	}
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_ROLES",
        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;

	public Collection<GrantedAuthority> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRoles(Set<Role> singleton) {
		// TODO Auto-generated method stub
		
	}

	public void setUsername(Object username) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name) {
		// TODO Auto-generated method stub
		
	}

}