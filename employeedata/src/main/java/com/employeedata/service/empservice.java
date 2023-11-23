package com.employeedata.service;
import java.util.List;

import com.employeedata.model.empmodel;

	public interface empservice {
		public List<empmodel> getAllEmp();
		public empmodel updateEmp(empmodel employee);
		public empmodel getByDt(String department);
		public empmodel addEmp(empmodel employee);
		
	}

