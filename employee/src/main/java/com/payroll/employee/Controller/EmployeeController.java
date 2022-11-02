package com.payroll.employee.Controller;
import org.springframework.http.ResponseEntity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.Service.EmployeeService;
import com.payroll.employee.Service.IEmployeeService;
import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.dto.ResponseDTO;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService service;

	@GetMapping("/")
	public String lastname() {
		String response = service.getLastName();
		return response;
	}

	@PostMapping("/add")
	public String name(@RequestHeader String firstName, @RequestHeader String lastName) {
		return "hii.. " + firstName + " " + lastName;
	}

	@PostMapping("/addBody")
	public ResponseEntity<ResponseDTO> addingBody(@RequestBody EmployeeDTO data) {
		EmployeeModel response = service.addBody(data);
		ResponseDTO responsedto = new ResponseDTO("data is added", response);
		return new ResponseEntity<>(responsedto, HttpStatus.CREATED);
	}

	@PostMapping("addDb")
	public ResponseEntity<ResponseDTO> empDetail(@RequestBody @Valid EmployeeDTO data) {
		EmployeeModel response = service.getEmpDetail(data);
		ResponseDTO responsedto = new ResponseDTO("added data", "response");
		return new ResponseEntity(responsedto, HttpStatus.CREATED);
	}

	@GetMapping("/getDb")
	public List<EmployeeModel> getempDetailDb() {
		List<EmployeeModel> res = service.DbDetail();
		return res;
	}

	@GetMapping("/getDb/{id}")
	public ResponseEntity<EmployeeDTO> getempDetailDbId(@PathVariable int id) {
		EmployeeModel res = service.DbDetailId(id);
		ResponseDTO responsedto = new ResponseDTO("Id found", "res");
		return new ResponseEntity(responsedto, HttpStatus.OK);
		
	}
	
	@GetMapping("/department/{department}")
	public ResponseEntity<EmployeeDTO> getempDetailDbDpartment(@PathVariable String department) {
		List<EmployeeModel> res = service.getEmployeeByDepartment(department);
		ResponseDTO responsedto = new ResponseDTO("Get call is successfull", "res");
		return new ResponseEntity(responsedto, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("deleteEmp/{id}")
	public void delByid(@PathVariable int id) {
		service.deleteByid(id);
	}

	@PutMapping("update/{id}")
	public EmployeeModel updateByid(@RequestBody EmployeeModel model, @PathVariable int id) {
		EmployeeModel response = service.updateId(model, id);
		return response;
	}

}
