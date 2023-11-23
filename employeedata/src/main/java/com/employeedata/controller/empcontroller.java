package com.employeedata.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employeedata.model.empmodel;
import com.employeedata.repository.emprepository;


@RestController
@RequestMapping("/employee")

public class empcontroller {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private emprepository repo;
	
	@PostMapping("/Createdata")
	public empmodel addData(@RequestBody empmodel employee) {
			return repo.save(employee);
	}

	@PutMapping("/update")
	public empmodel updateData(@PathVariable String empid, @RequestBody empmodel employee){
		@SuppressWarnings("unused")
		empmodel existingData= repo.findAllById(empid);
		return employee;
		}
	
	@GetMapping("/fetch")
	  public List<empmodel> employees(){
        return repo.findAll();
   
	  }
    @GetMapping("/filterbydept/{department}")
        public List<empmodel> employeesbydept(@PathVariable String department){
            return repo.findAll().stream().filter(x -> x.getEmpdepartment().contains(department)).collect(Collectors.toList());
		
       
	}
	
	
	
}
