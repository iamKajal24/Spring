package springmvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is a url");
		model.addAttribute("name", "priya kumari");
		model.addAttribute("phone number", 96340587);

		List<String> friends = new ArrayList();
		friends.add("Kajal");
		friends.add("priya");
		friends.add("rahul");

		model.addAttribute("friends", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller ");
		return "about";
	}

	// service

	// help
	@RequestMapping("/help")
	public ModelAndView help() {
		
		//creating model and view object
		ModelAndView m = new ModelAndView();
		//setting the data
		m.addObject("name", "Uttam shukla");
		m.addObject("Rollno", 9765456);
		
		LocalDateTime now = LocalDateTime.now();
		m.addObject("DateAndTime", now);
		
		// marks 
		List<Integer> marks = new ArrayList();
		marks.add(67);
		marks.add(92);
		marks.add(59);
		marks.add(87);
		
		m.addObject("marks", marks);
		
		//setting the view name
		m.setViewName("help");		
		return m;
	}
}
