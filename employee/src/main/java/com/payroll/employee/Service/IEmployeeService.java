package com.payroll.employee.Service;

import java.util.List;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.dto.EmployeeDTO;

public interface IEmployeeService {

	public String getLastName();

	public EmployeeModel addBody(EmployeeDTO data);

	public EmployeeModel getEmpDetail(EmployeeDTO data);

	public List<EmployeeModel> DbDetail();

	public EmployeeModel DbDetailId(int id);

	public void deleteByid(int id);

	EmployeeModel updateId(EmployeeModel model, int id);

}
