package com.spring.orm1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_details")
public class Students {

	@Id
	@Column(name = "ID")
	private int studentId;

	@Column(name = "Name")
	private String studentName;

	@Column(name = "City")
	private String studentCity;

	public Students(int studentId, String studentName, String studentCity) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Students() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}

}
