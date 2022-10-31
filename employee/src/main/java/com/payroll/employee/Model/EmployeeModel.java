package com.payroll.employee.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.payroll.employee.dto.EmployeeDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String fullName;
	private String gender;
	private String department;
	private String salary;
	private String profilePic;
	private LocalDate date;
	

//	public EmployeeModel(int empId, String fullName, String gender, String department, String salary, String profilePic,
//			LocalDate date) {
//		this.empId = empId;
//		this.fullName = fullName;
//		this.gender = gender;
//		this.department = department;
//		this.salary = salary;
//		this.profilePic = profilePic;
//		this.date = date;
//	}

	public EmployeeModel(EmployeeDTO data) {
	
	//	this.empId = data.addEmpId();
		this.fullName = data.getFullName();
		this.gender = data.getGender();
		this.department = data.getDepartment();
		this.salary = data.getSalary();
		this.profilePic = data.getProfilePic();
		this.date = data.getDate();
		
		
	}

}
