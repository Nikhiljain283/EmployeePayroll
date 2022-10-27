package com.payroll.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {

	private int empId;
	private String fullName;
	private String gender;
	private String department;
	private String salary;
	String profilePic;
	LocalDate date;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int empId, String fullName, String gender, String department, String salary, String profilePic,
			LocalDate date) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.profilePic = profilePic;
		this.date = date;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
