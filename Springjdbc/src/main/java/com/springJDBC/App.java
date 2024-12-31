package com.springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program Started...");

		// spring jdbc=> jdbc template

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springJDBC/Config.xml....");//.... error hai

//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		// insert query
//		String query = "insert into student(id, name,city) values(?,?,?)";
//		// fire query
//		int result = template.update(query, 246, "Priya Kumai", "Delhi");
//		System.out.println("number of record insertedd : "+ result);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// insert query
		Student student = new Student();
		student.setId(511);
		student.setName("Lakshmi Bhagwati");
		student.setCity("Gujraat");
		int res = studentDao.insert(student);
		System.out.println("number of records inserted" + res);

		// update query
//		Student student1 = new Student();
//		student1.setId(242);
//		student1.setName("Rajdeep Singh");
//		student1.setCity("Gujraat");
//		int res1 = studentDao.change(student1);
//		System.out.println("number of records updated" + res1);

//delete 
//		int res = studentDao.delete(642);
//		System.out.println("deleted : " + res);

		// Example: Get a student by ID
//		Student student = studentDao.getStudent(222);
//		System.out.println(student);

//		// get all student
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
