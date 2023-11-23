package com.example.employeedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;
;



@SpringBootApplication
	public class EmployeedataApplication{
		@Bean
		public RestTemplate getRestTemplate(){
			return new RestTemplate();
		}
		public static void main(String[] args) throws Exception {
			SpringApplication.run(EmployeedataApplication.class, args);
//			FileReader reader=new FileReader("db.properties");
			//
//					Properties p=new Properties();
//					p.load(reader);
			//
//						URL st = (URL)p.getProperty("spring.data.mongodb.uri");
//					HttpUrlConnection conn = (HttpURLConnection) st.openConnection();
			//
			////set the timeout in milliseconds
//					conn.setConnectTimeout(7000);
}
}