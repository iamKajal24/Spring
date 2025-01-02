package com.spring.orm1.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm1.entities.Students;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional // Allowing write operations
	public int insert(Students student) {
	    Integer i = (Integer) this.hibernateTemplate.save(student);
	    return i;
	}



	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
