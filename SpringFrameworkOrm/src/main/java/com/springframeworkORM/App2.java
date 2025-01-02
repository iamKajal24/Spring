package com.springframeworkORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.springframeworkORM.dao.EmpDao;
import com.springframeworkORM.entities.Employee;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Project started...");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframeworkORM/Config.xml");
		EmpDao empDao = context.getBean("employeeDao", EmpDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// Add new employee

					System.out.println("enter user id :");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("enter user name: ");
					String userName = br.readLine();

					System.out.println("enter user address");
					String uAdd = br.readLine();

					Employee emp = new Employee();
					emp.setId(uId);
					emp.setName(userName);
					emp.setDepartment(uAdd);

					int result = empDao.insert(emp);
					System.out.println(result);
					System.out.println("inserted successfully");

					break;

				case 2:
					// Display all employees
					List<Employee> allEmployees = empDao.getAllEmployees();
					for (Employee em : allEmployees) {
						System.out.println("ID :" + em.getId());
						System.out.println("Name : " + em.getName());
						System.out.println("Address: " + em.getDepartment());
					}
					System.out.println("Get all Employee...");
					break;

				case 3:
					// Get details of a single employee
					System.out.println("enter user id :");
					int userId = Integer.parseInt(br.readLine());
					Employee em = empDao.getEmployee(userId);
					System.out.println("Id : " + em.getId());
					System.out.println("Name :" + em.getName());
					System.out.println("Address :" + em.getDepartment());
					System.out.println("get single employee details..");
					break;

				case 4:
					// Delete employee
					System.out.println("enter user id :");
					int usernameId = Integer.parseInt(br.readLine());
					empDao.deleteEmployee(usernameId);
					System.out.println("deleted data");
					break;

				case 5:
					// Update employee
					System.out.print("Enter Employee ID to update: ");
                    int updateId = Integer.parseInt(br.readLine());
                    Employee existingEmployee = empDao.getEmployee(updateId);
                    if (existingEmployee != null) {
                        System.out.print("Enter new Name: ");
                        existingEmployee.setName(br.readLine());
                        System.out.print("Enter new Department: ");
                        existingEmployee.setDepartment(br.readLine());
                        empDao.updateEmployee(existingEmployee);
                        System.out.println("Employee updated with ID: " + updateId);
                    } else {
                        System.out.println("Employee not found with ID: " + updateId);
                    }

					break;

				case 6:
					// Exit
					go = false;
					break;

				default:
					System.out.println("Invalid choice, please try again.");
				}

			} catch (Exception e) {
				System.out.println("An error occurred: " + e.getMessage());
			}
		}

		System.out.println("Thank you for using the application!");
		System.out.println("See you soon!!");
	}
}
