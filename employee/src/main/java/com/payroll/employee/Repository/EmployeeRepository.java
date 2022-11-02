package com.payroll.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.payroll.employee.Model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

	@Query(value = "select * from employee_model, employee_department where department = :department", nativeQuery = true)
		List<EmployeeModel> findByDepartment(String department);

}
