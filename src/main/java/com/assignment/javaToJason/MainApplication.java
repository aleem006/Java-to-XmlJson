package com.assignment.javaToJason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	@Autowired
//	private static JSON json;// = new JSON();
	//private static SaveImpl saveImpl;
	
	public static void main(String[] args) {
		 
		Teacher teacher = new Teacher();
		
		teacher.setName("Aleem");
		teacher.setAge(22);
		teacher.setSalary(10000);
		
		ApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
//		json = applicationContext.getBean(JSON.class);
//		json.save();
		SaveImpl saveImpl = applicationContext.getBean(SaveImpl.class);
		saveImpl.run(teacher);
	}
}
