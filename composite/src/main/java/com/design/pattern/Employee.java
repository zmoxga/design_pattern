package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 15/4/27.
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	//构造函数
	public Employee(String name,String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates(){
		return subordinates;
	}

	public String toString(){
		return ("com.design.pattern.Employee :[ Name : "+ name
				+", dept : "+ dept + ", salary :"
				+ salary+" ]");
	}
}
