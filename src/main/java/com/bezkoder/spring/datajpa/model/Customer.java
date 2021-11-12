package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "password")
	private String password;

	@Column(name = "Role")
	private String Role;

	public Customer() {

	}

	public Customer(long id, String name, String address, String password) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.password = password;
		System.out.println(this.Role);

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPassword(String password){ this.password = password; }

	public String getPassword(){ return password; }


	public String getRole() {
		return Role;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}
}
