package com.cognixia.jump.intermediateJava.javaFinalProject;


import java.util.ArrayList;
import java.util.Scanner;


//import com.cognixia.jump.intermediateJava.javaFinalProject.WriteFile;


public class EmployeeManagementSystem {
	static ArrayList <Employee> employees = new ArrayList<Employee>();
	static Scanner scanner = new Scanner(System.in);
	static int x  = 0;
	public static void main(String[] args) {
		
			System.out.println("Hello Welcome to the Employee Management System. What would you like to do?");
			
			taskLists();
			
			x = scanner.nextInt();
			
			while(x != 0) {
				
				switch(x) {
				case 1: addEmployee();
					break;
				case 2: updateEmployee();
					break;
				case 3: readEmployee();
					break;
				case 4: deleteEmployee();
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
	}
	
	
	public static void taskLists() {
		System.out.println("If you would like to create an employee. Please enter the int 1.");
		System.out.println("If you would like to update an employee. Please enter the int 2.");
		System.out.println("If you would like to read out current employees. Please enter the int 3.");
		System.out.println("If you would like to delete a current employee. Please enter the int 4.");
		System.out.println("If you would like to read out current departments. Please enter the int 5.");
		System.out.println("If you would like to list employees from a specific. Please enter the int 4.");
		System.out.println("If you would like to end this interaction. Please enter 0.");
	}
	
	public static void setNextTask() {
		System.out.println("Would you like to do anything else? Enter int 7 to repeat possible actions or 0 to exit.");
		x = scanner.nextInt();
	}
	
	public static void addEmployee() {
		System.out.println("Enter an input for an Employee Name");
		Employee employee = new Employee(null, 0, null);
		String input = scanner.nextLine();
		employee.setName(input);
		System.out.println("Enter an input for Employee Salary");
		int input2 = scanner.nextInt();
		employee.setSalary(input2);
		System.out.println("Enter an input for Employee Department");
		String input3 = scanner.nextLine();
		employee.setDepartment(input3);
		System.out.println("Employee " + employee.getName() +" was created!");
		employees.add(employee);
	}
	
	public static void deleteEmployee() {
		System.err.println("Please enter the ID of the employee you are trying to delete");
		try {
			for(Employee e: employees) {
				if(e.getId() == scanner.nextInt()) {
					employees.remove(e);
				}
			}
		}
		catch(Exception e) {
			System.out.println("An error has occured");
		}
	}
	
	public static void updateEmployee() {
		System.err.println("Please enter the ID of the employee you are trying to update");
		
		int q = scanner.nextInt();
		
		Employee currentEmployee = null;
		
		for(Employee e: employees) {
			if(e.getId() == q) {
				currentEmployee = e;
			}
		}
		
		System.out.println("What would you like to update. Enter 1 for name, 2 for department or 3 for salary.");
		int y = scanner.nextInt();
		if(y==1) {
			System.out.println("Please enter the new name");
			if(currentEmployee != null) {
				currentEmployee.setName(scanner.next());
				}
		}
		else if(y==2) {
			System.out.println("Please enter the new department");
			if(currentEmployee != null) {
				currentEmployee.setDepartment(scanner.next());
				}
		}
		else if(y==3) {
			System.out.println("Please enter the new salary");
			if(currentEmployee != null) {
				currentEmployee.setSalary(scanner.nextInt());
				}
		}
		else {
			System.out.println("You didn't enter a valid option. Please start over!");
		}
		
		
		
	}
	
	public static void readEmployee() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
