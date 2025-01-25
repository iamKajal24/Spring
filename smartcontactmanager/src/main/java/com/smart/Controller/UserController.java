package com.smart.Controller;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.dao.UserRepository;
import com.smart.dao.ContactRepository;
import com.smart.entities.Contact;
import com.smart.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ContactRepository contactRepository;

    // method for adding common data to response
    @ModelAttribute
    public void addCommonData(Model model, Principal principal) {
        model.addAttribute("title", "User Dashboard - Smart Contact Manager");
        String userEmail = principal.getName(); // Use email here since principal's name is usually the email
        System.out.println("USER EMAIL: " + userEmail);

        // Fetch user by email (previously was using getUserByUserName)
        User user = userRepository.getUserbyUserName(userEmail);
        System.out.println("User: " + user);

        model.addAttribute("user", user);
    }

    // dashboard home
    @RequestMapping("/index")
    public String dashboard(Model model) {
        model.addAttribute("title", "Home Page - Smart Contact Manager");
        return "normal/user_dashboard"; // This maps to templates/normal/user_dashboard.html
    }

    // open add form handler
    @GetMapping("/add-contact")
    public String openAddContactForm(Model model) {
        model.addAttribute("title", "Add Contact - Smart Contact Manager");
        model.addAttribute("contact", new Contact());
        return "normal/add_contact_form";
    }

    // processing add contact form
    @PostMapping("/process-contact")
    public String processContact(@ModelAttribute Contact contact, Principal principal) {
        System.out.println("Contact Data: " + contact);

        // Fetch the user by email
        String userEmail = principal.getName();
        User user = userRepository.getUserbyUserName(userEmail);
        System.out.println("User Associated: " + user);

        // Associate the user with the contact
        contact.setUser(user);

        // Save the contact
        contactRepository.save(contact);
        System.out.println("Contact Saved: " + contact);

        // Redirect to a different page after saving
        return "redirect:/user/index";
    }
}
