package com.payroll.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.payroll.employee.dto.EmployeeDTO;

@ControllerAdvice
public class MyExceptionHandler {
	   @ExceptionHandler(CustomException.class)
	    public ResponseEntity<EmployeeDTO> handlerNonExistingId(CustomException customException){
	        EmployeeDTO employeeDto = new EmployeeDTO("Exception while parsing Rest Request", customException.getMessage());
	        return new ResponseEntity<>(employeeDto, HttpStatus.BAD_REQUEST);

	
	   }
}
