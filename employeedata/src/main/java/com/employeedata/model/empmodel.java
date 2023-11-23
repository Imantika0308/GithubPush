package com.employeedata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Employee_data")
public class empmodel {
			
	@Id
			private String empid;
			private String empaddress;
			private String empname;
			private String empdepartment;
			public String getEmpid() {
				return empid;
			}
			public void setEmpid(String empid) {
				this.empid = empid;
			}
			public String getEmpaddress() {
				return empaddress;
			}
			public void setEmpaddress(String empaddress) {
				this.empaddress = empaddress;
			}
			public String getEmpname() {
				return empname;
			}
			public void setEmpname(String empname) {
				this.empname = empname;
			}
			public String getEmpdepartment() {
				return empdepartment;
			}
			public void setEmpdepartment(String empdepartment) {
				this.empdepartment = empdepartment;
			}
			public empmodel() {
				super();
				// TODO Auto-generated constructor stub
			}
			public empmodel(String empid, String empaddress, String empname, String empdepartment) {
				super();
				this.empid = empid;
				this.empaddress = empaddress;
				this.empname = empname;
				this.empdepartment = empdepartment;
			}
			
			
			
}
