package com.springframeworkORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springframeworkORM.entities.Employee;

public class EmpDao {

	private HibernateTemplate hibernateTemplate;

	// Insert Employee into Database
	@Transactional
	public int insert(Employee employee) {
		return (Integer) this.hibernateTemplate.save(employee);
	}

	// get the single data(object)
	public Employee getEmployee(int employeeId) {
		Employee emp = this.hibernateTemplate.get(Employee.class, employeeId);
		return emp;
	}

	// get all records(object)
	public List<Employee> getAllEmployees() {
		List<Employee> emp = this.hibernateTemplate.loadAll(Employee.class);
		return emp;
	}
	
	//deleting the row and data
	@Transactional
	public void deleteEmployee(int employeeID) {
	Employee employee =	this.hibernateTemplate.get(Employee.class, employeeID);
	this.hibernateTemplate.delete(employee);
	}
	
	//updating data
	@Transactional
   public void updateEmployee(Employee employee) {
	 this.hibernateTemplate.update(employee);
   }
	
	public EmpDao() {
		super();
	}

	// Constructor Injection
	public EmpDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	// Getter and Setter
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
