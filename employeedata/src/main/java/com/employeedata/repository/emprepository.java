package com.employeedata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employeedata.model.empmodel;

public interface emprepository extends MongoRepository<empmodel, String>{

	empmodel findbydept(String empdepartment);

	empmodel findAllById(String empid);
	
	
}