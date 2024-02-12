package com.h2.db.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String ssn; // Consider encryption for real applications
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String sex;

    // No-argument constructor
    public Donor() {
    }

    // All-arguments constructor
    public Donor(Long id, String firstName, String lastName, String ssn, String email, Date dateOfBirth, String sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}


//package com.h2.db.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="TBL_DONORS")
//public class Donor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long donor_id;
//    
//    @Column(name="first_name", nullable=false)
//    private String firstName;
//    
//    @Column(name="last_name", nullable=false)
//    private String lastName;
//    
//    @Column(name="email", nullable=false, length=200)
//    private String email;
//    
//    @Column(name="ssn", nullable=false)
//    private int ssn;
//    
//	@Column(name="blood_type", nullable=false, length=3)
//    private String bloodType;
//    
//	public Long getId() {
//		return donor_id;
//	}
//
//	public void setId(Long donor_id) {
//		this.donor_id = donor_id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//    public int getSsn() {
//		return ssn;
//	}
//
//	public void setSsn(int ssn) {
//		this.ssn = ssn;
//	}
//
//    @Override
//    public String toString() {
//        return "DonorEntity [id=" + donor_id + ", firstName=" + firstName + 
//                ", lastName=" + lastName + ", email=" + email   + "]";
//    }
//
//	public String getBloodType() {
//		return bloodType;
//	}
//
//	public void setBloodType(String bloodType) {
//		this.bloodType = bloodType;
//	}
//}