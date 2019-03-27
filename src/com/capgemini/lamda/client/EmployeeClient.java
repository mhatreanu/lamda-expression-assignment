package com.capgemini.lamda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lamda.model.Employee;

public class EmployeeClient {
	
	public static void main(String[]args) {
		
		/*Comparator<Employee> c=new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
			return Integer.compare(e1.getId(),e2.getId());
		}*/
		Comparator<Employee> c=(e1,e2)->Integer.compare(e1.getId(), e2.getId());
		
		
		TreeSet<Employee>employee=new TreeSet<Employee>(c);
		employee.add(new Employee(101,"Alex",340,"HR"));
		employee.add(new Employee(102,"Grant",120,"HR"));
		employee.add(new Employee(103,"Bob",560,"HR"));
		employee.add(new Employee(104,"Taylor",120,"HR"));
		
		for(Employee employee1:employee) {
			System.out.println(employee1);
			
		}
}
}
