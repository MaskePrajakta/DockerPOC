package com.neosoftmail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoftmail.model.Employee;

@Repository
public interface EmpRepo extends MongoRepository<Employee, String>{

}
