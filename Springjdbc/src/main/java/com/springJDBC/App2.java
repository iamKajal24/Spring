package com.springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entites.Student;

public class App2 {
	public static void main(String[] args) {
		System.out.println("my project started...");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		// insert query
//		Student student = new Student();
//		student.setId(467);
//		student.setName("Hardeep singh saini");
//		student.setCity("Laldhang");
//		int res = studentDao.insert(student);
//		System.out.println("number of records inserted" + res);

		// get all student
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}

	}
}
