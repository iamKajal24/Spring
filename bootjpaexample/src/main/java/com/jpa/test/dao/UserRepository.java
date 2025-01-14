package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;


//spring data support by keywords

public interface UserRepository extends CrudRepository<User, Integer>  {

	//public List<User> findByName(String name);
	//public List<User> findByCity(String city);
	
//	public List<User> findByNameAndCity(String name, String city);
	
//	public List<User> findByFirstnameStartingWith(String prefix);
	
	@Query("select u FROM User u")
	public List<User> getAllUsers();
	
	@Query("select u From User u WHERE u.name= :n and u.city= :c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);
	
	
	@Query(value="select * from user", nativeQuery = true)
	public List<User> getUsers();
	
}
