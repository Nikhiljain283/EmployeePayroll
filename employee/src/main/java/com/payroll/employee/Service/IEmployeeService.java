package com.payroll.employee.Service;

import java.util.List;

import com.payroll.employee.Model.EmployeeModel;
import com.payroll.employee.dto.EmployeeDTO;

public interface IEmployeeService {

	public String getLastName();

	public String getBody(EmployeeModel data);

	public EmployeeModel getEmpDetail(EmployeeDTO data);

	public List<EmployeeModel> DbDetail();

	public EmployeeModel DbDetailId(int id);

	public void deleteByid(int id);

	public EmployeeModel updateId(EmployeeModel model, int id);

}
