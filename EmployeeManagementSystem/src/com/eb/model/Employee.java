package com.eb.model;

import javax.persistence.*;

@Entity
@Table(name="employeeInfo")
public class Employee {

	//specify primary key
	@Id   
	@Column(name="EmployeeID")
	private int id;
	
	@Column(name="FirstName")
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
