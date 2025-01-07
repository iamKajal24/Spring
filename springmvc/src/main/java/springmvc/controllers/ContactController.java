package springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    // Add common attributes to the model
    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("Header", "LearnCodeWith Kajal");
        model.addAttribute("Description", "Home for programmers");
        System.out.println("adding common data to modal");
    }


    // Show form page
    @RequestMapping("/content")
    public String showForm() {
    	System.out.println("creating form");
        return "content";
    }

    // Handle form submission
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        this.userService.createUser(user);
        
        //redirect page
        if(user.getUsername().isBlank()) {
        	return "redirect:/content";
        }
        
        //success.jsp
        int createdUser = this.userService.createUser(user);
        model.addAttribute("message", " user Created with id " + createdUser);
        
        System.out.println("submitted from");
        System.out.println(user);
        return "success";
    }
}





/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleform(
 * 
 * @RequestParam("email") String useremail,
 * 
 * @RequestParam("username") String username,
 * 
 * @RequestParam("password") String userpassword, Model model) {
 * 
 * // System.out.println("user email : " + useremail); //
 * System.out.println("name : " + username); // System.out.println("password : "
 * + userpassword);
 * 
 * //or
 * 
 * User user = new User(); user.setEmail(useremail); user.setUsername(username);
 * user.setPassword(userpassword);
 * 
 * System.out.println(user);
 * 
 * //process // model.addAttribute("name", username); //
 * model.addAttribute("email", useremail); // model.addAttribute("password",
 * userpassword);
 * 
 * // or
 * 
 * model.addAttribute("user", user);
 * 
 * 
 * return "success"; // Replace with a valid view name if required }
 */




//or 

/*
@Controller
public class ContactController {
	
	@ModelAttribute
	public void CommonDataForModel(Model model) {
		model.addAttribute("Header", "LearnCodeWith Kajal");
		model.addAttribute("Description", "Home for programmer");
		System.out.println("adding common data to model");
		
	}
	

	@RequestMapping("/content")
	public String ShowForm(Model model) {
//		model.addAttribute("Header", "LearnCodeWith Kajal");
//		model.addAttribute("Description", "Home for programmer");
		System.out.println("showing form");
		return "content";
	}

//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String handlefrom(HttpServletRequest request) {
//		String email = request.getParameter("useremail");
//		System.out.println("user email is :" + email);
//		return "";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(@ModelAttribute User user, Model model) {
		// System.out.println(user);
		// model.addAttribute("user", user);
		
//		model.addAttribute("Header", "LearnCodeWith Kajal");
//		model.addAttribute("Description", "Home for programmer");
		
		System.out.println("submitted form");
		return "success"; // Replace with a valid view name if required
	}
}

*/

