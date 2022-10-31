package com.payroll.employee.dto;

import com.payroll.employee.Model.EmployeeModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDTO {
	
	private String message;
	private Object dataObject;
	
	public ResponseDTO(String msg, Object response) {
		this.message = msg;
		this.dataObject = response;
	}

	public ResponseDTO(String msg, String message2) {
		// TODO Auto-generated constructor stub
	}
}