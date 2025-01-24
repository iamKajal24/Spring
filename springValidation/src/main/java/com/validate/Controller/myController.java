package com.validate.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validate.entites.LoginData;

import jakarta.validation.Valid;

@Controller
public class myController {

	@GetMapping("/form")
	public String openForm(Model model) {
		System.out.println("Openning form ");
		model.addAttribute("loginData", new LoginData());
		return "form";
	}

	// handler for process form
	 @PostMapping("/process")
	    public String processForm(@Validated @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
	        if (result.hasErrors()) {
	            System.out.println("Validation errors: " + result);
	            return "form"; // Redirect back to the form on error
	        }
	        System.out.println("Login Data: " + loginData);
	        return "success"; // Navigate to success page on success
	    }

}
