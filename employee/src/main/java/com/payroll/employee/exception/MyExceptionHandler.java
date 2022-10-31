package com.payroll.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.dto.ResponseDTO;

@ControllerAdvice
public class MyExceptionHandler {
	   @ExceptionHandler(CustomException.class)
	    public ResponseEntity<ResponseDTO> handlerNonExistingId(CustomException customException){
	        ResponseDTO responseDto = new ResponseDTO("Exception while parsing Rest Request", customException.getMessage());
	        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);

	
	   }
}
