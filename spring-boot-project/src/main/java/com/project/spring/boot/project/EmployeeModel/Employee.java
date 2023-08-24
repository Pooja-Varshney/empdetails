package com.project.spring.boot.project.EmployeeModel;


import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "department")
	private String department;
	@Column(name = "designation")
	private String designation;
	@Column(name = "grade")
	private String grade;
	@Column(name = "contactDetails")
	private int contactDetails;
	@Column(name = "skillSet")
	private String skillSet;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(int contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	
	

}
