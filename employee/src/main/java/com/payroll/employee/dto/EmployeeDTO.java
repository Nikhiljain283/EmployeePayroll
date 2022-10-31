package com.payroll.employee.dto;

import java.time.LocalDate;

import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {
	

	@Pattern(regexp = "^[A-z]{1}[a-z]{3,}[ ][a-z]{3,}$", message = "Invalid data")
	private String fullName;
	private String gender;
	private String department;
	private String salary;
	private String profilePic;
	private LocalDate date;

	
}


