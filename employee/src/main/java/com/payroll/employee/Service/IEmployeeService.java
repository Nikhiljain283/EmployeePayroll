package com.payroll.employee.Service;

import java.util.List;

import com.payroll.employee.Model.EmployeeModel;

public interface IEmployeeService {

	public String getLastName();

	public String getBody(EmployeeModel data);

	public EmployeeModel getEmpDetail(EmployeeModel data);

	public List<EmployeeModel> DbDetail();

}
