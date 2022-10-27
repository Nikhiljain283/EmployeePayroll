package com.payroll.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.Service.EmployeeService;
import com.payroll.employee.Service.IEmployeeService;

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
		return "hii.. "+firstName+" "+lastName;
	}
	
	@PostMapping("/addBody")
	public String addingBody(@RequestBody EmployeeModel data ) {
		String response = service.getBody(data);
		return response;
	}
	
	@PostMapping("addDb")
	public EmployeeModel empDetail(@RequestBody EmployeeModel data) {
		EmployeeModel response =  service.getEmpDetail(data);
		return response;
	}

	@GetMapping("/getDb")
	public List<EmployeeModel> getempDetailDb(){
		List<EmployeeModel> res = service.DbDetail();
		return res;
		
	}
	

}
