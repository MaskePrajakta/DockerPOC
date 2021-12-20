package com.neosoftmail.serviceInterface;

import java.util.List;

import com.neosoftmail.model.Employee;

public interface EmpService {

	
	 Employee createEmpDetails(Employee employee);
	 List <Employee> getAllEmployee();
}
