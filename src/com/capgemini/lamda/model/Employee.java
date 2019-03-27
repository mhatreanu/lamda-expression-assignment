package com.capgemini.lamda.model;

import java.util.Objects;

public class Employee {
private int id; 
private String name;
private double salary;
private String department;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, double salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

@Override
public boolean equals(Object obj)
{
	if(this==obj)
		return true;
	if(obj==null)
		return false;
	if(obj instanceof Employee) 
		return false;
	Employee employee=(Employee)obj;
	if(this.id==employee.id && this.name==employee.name)
		return true;
	else
		return false;
	}
@Override
public int hashCode() {
	return Objects.hash(id,name);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}

	/*
	 * @Override public String toString() { return this.name=name; }
	 */
}

