package com.employeedata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeedata.model.empmodel;
import com.employeedata.repository.emprepository;

public class empserviceimpl {

	@Autowired
	emprepository repo;

	public List<empmodel> getAllEmp(){
	return repo.findAll();
	};

	public empmodel addEmp(empmodel employee){
	return repo.save(employee);
	}
	
	public empmodel updateEmp(empmodel employee) {
	return repo.save(employee);
	}
	
	public empmodel getByDt(String department) {
		return repo.findbydept(department);
	}
}
