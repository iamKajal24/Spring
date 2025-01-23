package com.practical.Controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler...");
		// putting data is model
		model.addAttribute("name", "kajal");
		model.addAttribute("currentDate", LocalDate.now());
		return "about";
	}

	// handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		// send
		// set any collection -> list,map,set,array,single value as list
		List<String> names = List.of("Kajal", "Riya", "Khushi", "Priya", "Rupam");
		model.addAttribute("names", names);
		return "iterate";
	}

	// handler for conditional statement
	@GetMapping("/condition")
	public String continalHandler(Model model) {
		System.out.println("Conditional handler execute");
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");
		List<Integer> numbers = List.of(23, 4, 5, 67, 8);
		model.addAttribute("numbers", numbers);
		return "condition";
	}
	
	//handler for including fragment
	@GetMapping("/service")
	public String servicesHandler(Model model) {
		//processing
		model.addAttribute("title", "I like to eat samosa");
		model.addAttribute("sub_title",LocalDateTime.now().toString());
		return "service";
	}
	
	// for new About handler
	
	@GetMapping("/newabout")
	public String about() {
		return "aboutnew";
	}
	
	@GetMapping("/content")
	public String content() {
		return "content";
	}

}
