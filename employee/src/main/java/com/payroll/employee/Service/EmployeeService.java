package com.payroll.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.Repository.EmployeeRepository;
import com.payroll.employee.dto.EmployeeDTO;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	public String getLastName() {
		return "jain";
	}

	public EmployeeModel addBody(EmployeeDTO empdata) {
		EmployeeModel response1 = new EmployeeModel(empdata);
		repo.save(response1);
		return response1;
	}

	public EmployeeModel getEmpDetail(EmployeeDTO data) {
		EmployeeModel model = new EmployeeModel(data);
		repo.save(model);
		return model;
	}

	public List<EmployeeModel> DbDetail() {
		return repo.findAll();
	}

	@Override
	public EmployeeModel DbDetailId(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteByid(int id) {

		repo.deleteById(id);

	}

	public EmployeeModel updateId(EmployeeModel model, int id) {
		EmployeeModel existingData = repo.findById(id).get();
		existingData.setFullName(model.getFullName());
		// EmployeeModel abc = new EmployeeModel();
		EmployeeModel res = repo.save(existingData);
		return res;
	}

	public List<EmployeeModel> getEmployeeByDepartment(String department) {
		return repo.findByDepartment(department);

	}

}
