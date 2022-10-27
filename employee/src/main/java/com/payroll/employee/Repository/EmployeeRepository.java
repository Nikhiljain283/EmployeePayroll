package com.payroll.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payroll.employee.Model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
