package com.springframeworkORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframeworkORM.dao.EmpDao;
import com.springframeworkORM.entities.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("My project started...");

		// Load Spring Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframeworkORM/Config.xml");

		// Get EmpDao Bean
		EmpDao empDao = context.getBean("employeeDao", EmpDao.class);

		// Create Employee Object
//        Employee employee = new Employee();
//        employee.setId(55);
//        employee.setName("Archana Bharti");
//        employee.setDepartment("Jagjeetpur");
//
//        // Insert Employee
//        int result = empDao.insert(employee);
//
//        // Print Result
//        System.out.println("Employee inserted with ID: " + result);

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		 while (go) {
	            System.out.println("\n==========================");
	            System.out.println("PRESS 1: Add New Employee");
	            System.out.println("PRESS 2: Display All Employees");
	            System.out.println("PRESS 3: Get Details of a Single Employee");
	            System.out.println("PRESS 4: Delete Employee");
	            System.out.println("PRESS 5: Update Employee");
	            System.out.println("PRESS 6: Exit");
	            System.out.println("==========================");

	            try {
	                System.out.print("Enter your choice: ");
	                int input = Integer.parseInt(bReader.readLine());

	                switch (input) {
	                    case 1:
	                        // Add new Employee
	                        System.out.print("Enter Employee ID: ");
	                        int id = Integer.parseInt(bReader.readLine());
	                        System.out.print("Enter Employee Name: ");
	                        String name = bReader.readLine();
	                        System.out.print("Enter Employee Department: ");
	                        String department = bReader.readLine();

	                        Employee newEmployee = new Employee();
	                        newEmployee.setId(id);
	                        newEmployee.setName(name);
	                        newEmployee.setDepartment(department);

	                        int insertResult = empDao.insert(newEmployee);
	                        System.out.println("Employee inserted with ID: " + insertResult);
	                        break;

	                    case 2:
	                        // Display all Employees
	                        System.out.println("Fetching all employees...");
	                        empDao.getAllEmployees().forEach(employee -> {
	                            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
	                                    ", Department: " + employee.getDepartment());
	                        });
	                        break;

	                    case 3:
	                        // Get details of a single Employee
	                        System.out.print("Enter Employee ID: ");
	                        int empId = Integer.parseInt(bReader.readLine());
	                        Employee employee = empDao.getEmployee(empId);
	                        if (employee != null) {
	                            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
	                                    ", Department: " + employee.getDepartment());
	                        } else {
	                            System.out.println("Employee not found with ID: " + empId);
	                        }
	                        break;

	                    case 4:
	                        // Delete Employee
	                        System.out.print("Enter Employee ID to delete: ");
	                        int deleteId = Integer.parseInt(bReader.readLine());
	                        empDao.deleteEmployee(deleteId);
	                        System.out.println("Employee deleted with ID: " + deleteId);
	                        break;

	                    case 5:
	                        // Update Employee
	                        System.out.print("Enter Employee ID to update: ");
	                        int updateId = Integer.parseInt(bReader.readLine());
	                        Employee existingEmployee = empDao.getEmployee(updateId);
	                        if (existingEmployee != null) {
	                            System.out.print("Enter new Name: ");
	                            existingEmployee.setName(bReader.readLine());
	                            System.out.print("Enter new Department: ");
	                            existingEmployee.setDepartment(bReader.readLine());
	                            empDao.updateEmployee(existingEmployee);
	                            System.out.println("Employee updated with ID: " + updateId);
	                        } else {
	                            System.out.println("Employee not found with ID: " + updateId);
	                        }
	                        break;

	                    case 6:
	                        // Exit
	                        go = false;
	                        System.out.println("Exiting the application...");
	                        break;

	                    default:
	                        System.out.println("Invalid option. Please try again.");
	                        break;
	                }
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }

	        System.out.println("Thank you for using the application!");
	        System.out.println("See you soon!");
	}
}
