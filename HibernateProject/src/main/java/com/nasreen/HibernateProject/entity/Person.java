package com.nasreen.HibernateProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	public Person(int id, String name, int age, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	private String designation;
	private int salary;
	
	public Person() {
		
	}
	public Person( String name,int age, String designation, int salary) {
		super();
		
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return ("Person [name=" + name + ", age=" + age + ", designation=" + designation + ", salary=" + salary + "]");
	}
	
	

}
