package com.neosoftmail.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neosoftmail.model.Employee;
import com.neosoftmail.serviceImplementation.EmployeeServiceImpl;
import com.neosoftmail.serviceInterface.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	 @PostMapping("/employees")
	    public  Employee  createEmployee(@RequestBody Employee employee) {
	        return empService.createEmpDetails(employee);
	    }
	 

	 @GetMapping("/getEmp")
	 public List<Employee> getEmployee() {
		String url1="http://localhost:8086/getAdd";
		List<Employee> e =empService.getAllEmployee();
		//List<Address> list = restTemplate.getForObject(url1, List<Object>.class, e);
		return e;
	 }
	 
}
