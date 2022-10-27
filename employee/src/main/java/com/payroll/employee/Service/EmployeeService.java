package com.payroll.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.Repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	public String getLastName() {
		return "jain";
	}

	public String getBody(EmployeeModel data) {
		String response1 = data.getFullName() + " gender is " + data.getGender() + " salary is " + data.getSalary();
		return response1;
	}

	public EmployeeModel getEmpDetail(EmployeeModel data) {
		EmployeeModel model = new EmployeeModel(data);
		repo.save(model);
		return model;
	}

	public List<EmployeeModel> DbDetail() {
		return repo.findAll();
	}

}
