package com.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	private String employee_id;
	private String password;
	private String fName;
	private String lName;
	private Set<Shifts> shifts = new HashSet<>(0);
	
	public Employee() {
		
	}
	public Employee(String employee_id, String fName, String lName) {
		this.employee_id = employee_id;
		this.fName = fName;
		this.lName = lName;
		createPassword();
	}
	
	@Id
	@Column(name = "employee_id")
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "fName")
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Column(name = "lName")
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@OneToMany(mappedBy = "employee")
	public Set<Shifts> getShifts() {
		return shifts;
	}
	public void setShifts(Set<Shifts> shifts) {
		this.shifts = shifts;
	}
	public void createPassword() {
		String password = fName + lName.charAt(0) + "102030";
		setPassword(password);
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", password=" + password + ", fName=" + fName + ", lName="
				+ lName + "]";
	}
	
	
}
