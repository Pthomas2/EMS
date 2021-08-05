package com.cognixia.jump.intermediateJava.javaFinalProject;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeManagementSystem {
	static ArrayList <Employee> employees = new ArrayList<Employee>();
	static ArrayList <String> departments = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);
	static int x  = 0;
	public static void main(String[] args) {
		
			System.out.println("Hello Welcome to the Employee Management System. What would you like to do?");
			
			taskLists();
			
			x = scanner.nextInt();
			
			while(x != 0) {
try {
	BufferedWriter bw = new BufferedWriter(new FileWriter("./Resources/employees.txt"));
	BufferedReader br = new BufferedReader(new FileReader("./Resources/employees.txt"));
	for(Employee e: employees) {
		bw.write(e.getName() + ',' + e.getSalary() +','+ e.getDepartment() + "\n");
	}
	String s;
	while((s = br.readLine()) != null) {
		String[] tokens = s.split(",");
		int i=Integer.parseInt(tokens[1]); 
		Employee employee = new Employee(tokens[0],i,tokens[2]);
		employees.add(employee);
	};
	
}catch(Exception e) {
	return;
}
				
				switch(x) {
				case 1: addEmployee();
					break;
				case 2: updateEmployee();
					break;
				case 3: readEmployee();
					break;
				case 4: deleteEmployee();
					break;
				case 5: listDepartments();
					break;
				case 6: listEmployeesFromASpecificDepartment();
					break;
				case 7: taskLists();
					break;
				default:
					System.out.println("You did not enter an option thats available");
					break;
				}
				setNextTask();
			}
			System.out.println("Have a nice day!");
			scanner.close();
		}
	
	
	public static void taskLists() {
		System.out.println("If you would like to create an employee. Please enter the int 1.");
		System.out.println("If you would like to update an employee. Please enter the int 2.");
		System.out.println("If you would like to read out current employees. Please enter the int 3.");
		System.out.println("If you would like to delete a current employee. Please enter the int 4.");
		System.out.println("If you would like to read out current departments. Please enter the int 5.");
		System.out.println("If you would like to list employees from a specific. Please enter the int 6.");
		System.out.println("If you would like to end this interaction. Please enter 0.");
	}
	
	public static void setNextTask() {
		System.out.println("Would you like to do anything else? Enter int 7 to repeat possible actions or 0 to exit.");
		x = scanner.nextInt();
	}
	
	public static void addEmployee() {
		System.out.println("Enter an input for an Employee Name");
		Employee employee = new Employee(null, 0, null);
		String input = scanner.next();
		employee.setName(input);
		System.out.println("Enter an input for Employee Salary");
		int input2 = scanner.nextInt();
		employee.setSalary(input2);
		System.out.println("Enter an input for Employee Department");
		String input3 = scanner.next();
		employee.setDepartment(input3);
		departments.add(input3);
		System.out.println("Employee " + employee.getName() +" was created!");
		employees.add(employee);
		
	}
	
	public static void deleteEmployee() {
		System.err.println("Please enter the ID of the employee you are trying to delete");
		try {
			for(Employee e: employees) {
				if(e.getId() == scanner.nextInt()) {
					System.out.println("Employee "+ e.getName() + " has been deleted");
					employees.remove(e);
				}
			}
		}
		catch(Exception e) {
			System.out.println("An error has occured");
		}
	}
	
	public static void updateEmployee() {
		System.out.println("Please enter the ID of the employee you are trying to update");
		
		int q = scanner.nextInt();
		
		Employee currentEmployee = null;
		
		for(Employee e: employees) {
			if(e.getId() == q) {
				currentEmployee = e;
			}
		}
		if(currentEmployee == null) {
			System.err.println("Not a valid Employee");
			return;
		}
		
		System.out.println("What would you like to update. Enter 1 for name, 2 for department or 3 for salary.");
		int y = scanner.nextInt();
		if(y==1) {
			System.out.println("Please enter the new name");
			String newName = scanner.next();
			if(currentEmployee != null) {
				currentEmployee.setName(newName);
				}
		}
		else if(y==2) {
			System.out.println("Please enter the new department");
			String newDepartment = scanner.next();
			if(currentEmployee != null) {
				currentEmployee.setDepartment(newDepartment);
				}
		}
		else if(y==3) {
			System.out.println("Please enter the new salary");
			int newSalary = scanner.nextInt();
			if(currentEmployee != null) {
				currentEmployee.setSalary(newSalary);
				}
		}
		else {
			System.err.println("You didn't enter a valid option. Please start over!");
		}
		
	}
	
	public static void readEmployee() {
		System.out.println(employees);
	}
	
	public static void listDepartments() {
			System.out.println(departments);
		}
	public static void listEmployeesFromASpecificDepartment() {
		System.out.println("Enter the department you would like to list");
		String d = scanner.next();
		employees.stream().filter(e -> e.getDepartment()==d).forEach(System.out::println);;

	}
