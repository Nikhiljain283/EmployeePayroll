package com.payroll.employee.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

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
	private String salary;
	private String profilePic;
	private LocalDate date;
	
	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "empId"))
	@Column(name = "department")
	private List<String> department;

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
