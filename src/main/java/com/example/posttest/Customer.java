package com.example.posttest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cus_id")
	private int cusId;
	private String name;
	private String email;
	private String gender;
	private String password;
	
	public Customer() {

	}
	
	public Customer(String name, String email, String gender, String password) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}
	
	public Customer(int cusId, String name, String email, String gender, String password) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}
	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
