package com.cognixia.jump.intermediateJava.javaFinalProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Comparator;


public class EmployeeJavaStreams {

	public static void main(String[] args) {
			
		List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Orquidia", 100, "Developer"));
        employees.add(new Employee("Crles", 1000000, "Developer"));
        employees.add(new Employee("Charles", 100000, "Developer"));
        employees.add(new Employee("Ranika", 1000000, "Engineer"));
        employees.add(new Employee("Saniora", 200000, "Front End"));
        employees.add(new Employee("Sa", 20000, "Front End"));
        employees.add(new Employee("Jihun", 100001, "Database Arch"));
        employees.add(new Employee("Rich", 60000, "Management"));
        employees.add(new Employee("Keanu", 260000, "Database Arch"));
        employees.add(new Employee("Isabelle", 570000, "Secretary"));
        employees.add(new Employee("Spike", 20000, "Intern"));
        employees.add(new Employee("Dio", 100, "Database Arch"));
        employees.add(new Employee("Jason", Integer.MAX_VALUE, "Intern"));
        employees.add(new Employee("Demetri", 0, "Intern"));
        employees.add(new Employee("Kyle", Integer.MIN_VALUE, "CEO"));
        
        
	}
	static List<Employee> employeesFromDepartment = new ArrayList<Employee>();
	public static void getADepartmentList(List<Employee> x, String department) {
	//	List<Employee> employeesFromDepartment = new ArrayList<Employee>();
		for(int i = 0; i< x.size();i++) {
			if(x.get(i).getDepartment() == department) {
				employeesFromDepartment.add(x.get(i));
			}
		}
	}
	
//	public static void lowestEarningEmployee(List<Employee> x, String department) {
//		getADepartmentList(x, department);
//		
//		Employee lowestSalaryEmployee = employeesFromDepartment.stream()	
//				.reduce((e1,e2)-> e1.getSalary() < e2.getSalary() ? e1 : e2)
//				.get();
//System.out.println(lowestSalaryEmployee);
//	employeesFromDepartment.clear();
//	}
//	
//	public static void highestEarningEmployee(List<Employee> x, String department) {
//		getADepartmentList(x, department);
//		
//		Employee highestSalaryEmployee = employeesFromDepartment.stream()	
//				.reduce((e1,e2)-> e1.getSalary() > e2.getSalary() ? e1 : e2)
//				.get();
//System.out.println(highestSalaryEmployee);
//	employeesFromDepartment.clear();
//	}
//	
//	public static void above90(List<Employee> x) {
//		for(int i = 0; i< x.size();i++) {
//			if(x.get(i).getSalary() > 90000) {
//				System.out.println(x.get(i));
//			}
//		}
//	}
//	
//	public static void sortedListName(List<Employee> x) {
//		
//		List<Employee> sortedEmployees = x.stream().sorted(Comparator.comparing(Employee::getName))
//						.collect(Collectors.toList());
//		System.out.println(sortedEmployees);
//	
//	}
//	
//	public static void sortedListDepartment(List<Employee> x) {
//		
//		List<Employee> sortedEmployees = x.stream().sorted(Comparator.comparing(Employee::getDepartment))
//						.collect(Collectors.toList());
//		System.out.println(sortedEmployees);
//			
//	}
//	
//	
//	public static void sumSalaries(List<Employee> x) {
//		
//		int sumOfSalaries = x.stream()
//				.mapToInt(Employee::getSalary)
//				.sum();
//				System.out.println(sumOfSalaries);
//			
//	}
//	
//	public static void avgSalaries(List<Employee> x) {		
//				double avgSalaries = x.stream()
//						.mapToInt(Employee::getSalary)
//						.average()
//						.getAsDouble();
//				System.out.println(avgSalaries);
//			
//	}
//	public static void avgSalariesDepart(List<Employee> x, String depart) {	
//		getADepartmentList(x, depart);
//		double avgSalaries = employeesFromDepartment.stream()
//				.mapToInt(Employee::getSalary)
//				.average()
//				.getAsDouble();
//		System.out.println(avgSalaries);
//		employeesFromDepartment.clear();
//	
//}

}
