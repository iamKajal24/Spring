package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("kajal");
//		user.setCity("Haridwar");
//		user.setStatus("I am successful java developer");
//		
//	    User user1=userRepository.save(user);

		// Insert
		// create object of the user
//		User user = new User();
//		user.setName("Uttam");
//		user.setCity("Delhi");
//		user.setStatus("Python developer");
//
//		User user1 = new User();
//		user1.setName("Riya Pandit");
//		user1.setCity("Dehradun");
//		user1.setStatus("I am cyber security");

		// saving single user
		// User res = userRepository.save(user1);

		// Create a list of users
		// List<User> users = List.of(user, user1);

		// Save all users
		// Iterable<User> result = userRepository.saveAll(users);

		// Print each saved user
		// result.forEach(savedUser -> System.out.println(savedUser));

		// .out.println("done");

		// update the user of id 52
//	     Optional<User> optional = userRepository.findById(52);
//	     User user =optional.get();
//	     user.setName("Raman tyagi");
//	     userRepository.save(user);
//	     System.out.println(user);

		// how to get the data
		// findByID(id)->return optinal containing your data

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}

		// or
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

		// or
//		itr.forEach(savedUser -> System.out.println(savedUser));

		// deleting the user element

//		userRepository.deleteById(52);
//		System.out.println("deleted");

//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user -> System.out.println(user));
//		userRepository.deleteAll(allusers);

		// using method by userRepository
//	   List<User> users=userRepository.findByName("kajal");
//	   users.forEach(e->System.out.println(e));

//		List<User> users = userRepository.findByNameAndCity("kajal", "haridwar");
//		users.forEach(e->System.out.println(e));

//		 List<User> users = userRepository.findByFirstnameStartingWith("Ka");
//	     users.forEach(e->System.out.println(e));

		List<User> allUser = userRepository.getAllUsers();
		allUser.forEach(e -> System.out.println(e));
		
		System.out.println("*****************************************************");
		
		List<User> users = userRepository.getUserByName("Riya","Dehradun");
	    users.forEach(e->System.out.println(e));
	    
	    System.out.println("****************************************************");
	    
	    userRepository.getUsers().forEach(e->System.out.println(e));

		System.out.println("application context end....");

	}
}
