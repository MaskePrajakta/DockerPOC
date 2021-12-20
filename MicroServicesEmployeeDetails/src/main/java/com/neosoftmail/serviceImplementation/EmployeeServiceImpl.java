package com.neosoftmail.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoftmail.model.Employee;
import com.neosoftmail.repository.EmpRepo;
import com.neosoftmail.serviceInterface.EmpService;

@Service
public class EmployeeServiceImpl implements EmpService{

	@Autowired
	EmpRepo empRepo;
	
	
	@Override
	public Employee createEmpDetails(Employee employee) {
		
		return empRepo.save(employee);
	}


	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

}
