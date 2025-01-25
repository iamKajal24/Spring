package com.smart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import com.smart.helper.Message;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}

	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Signup - Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
	}

	@PostMapping("/do_register")
	public String registerUser(@Validated @ModelAttribute("user") User user,
			@RequestParam(defaultValue = "false") boolean agreement, Model model, BindingResult result,
			HttpSession session) {
		try {
			// Check if the user agreed to the terms and conditions
			if (!agreement) {
				throw new Exception("You have not agreed to the terms and conditions.");
			}

			// Check for validation errors
			if (result.hasErrors()) {
				model.addAttribute("user", user);
				session.setAttribute("message",
						new Message("Validation errors occurred. Please try again.", "alert-danger"));
				return "signup";
			}

			// Set user default values
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImageUrl("default.png");
			user.setPassword(passwordEncoder.encode(user.getPassword())); // Encrypt the password

			// Save the user to the database
			this.userRepository.save(user);

			// Display success message
			session.setAttribute("message", new Message("Successfully Registered!", "alert-success"));
			return "redirect:/signup"; // Redirect to the signup page to avoid form resubmission

		} catch (Exception e) {
			// Handle errors and display error message
			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("Something went wrong! " + e.getMessage(), "alert-danger"));
			return "signup";
		}
	}

	//handler for custom login
	@GetMapping("/login")
    public String login() {
    	return "login";
    }

}
