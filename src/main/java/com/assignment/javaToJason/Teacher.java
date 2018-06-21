package com.assignment.javaToJason;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlRootElement
public class Teacher {

	public String name;
	public int age;
	public int salary;
	
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}	
	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	@XmlElement
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
