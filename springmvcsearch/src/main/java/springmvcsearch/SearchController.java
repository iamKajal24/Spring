package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping(path = "/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
	    System.out.println(userId);
	    System.out.println(userName);
	    Integer.parseInt(userName);
	    return "home";
	}

	
    @RequestMapping("/home")
    public String home() {
        System.out.println("Going to home view");
        //processing area
//        String str =null;
//        System.out.println(str.length());
        
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query) {
        if (query.isBlank()) {
            // Redirect to home page if the query is empty
            RedirectView redirectView = new RedirectView();
            redirectView.setUrl("home");
            return redirectView;
        }

        // Construct the Google search URL
        String url = "https://www.google.com/search?q=" + query.replace(" ", "+");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }
    
    // handling exception in our spring mvc
    
//    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value=NumberFormatException.class)
//    public String exceptionhandlernumber(Model model) {
//    	model.addAttribute("msg","number format exception has occured");
//    	return "null_page";
//    }
//    
//    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value=NullPointerException.class)
//    public String exceptionhandlerNull(Model model) {
//    	model.addAttribute("msg","null pointer exception has occured");
//    	return "null_page";
//    }
//    
//    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value=Exception.class)
//    public String exceptionhandlerGenric(Model model) {
//    	model.addAttribute("msg","exception has occured");
//    	return "null_page";
//    }
    
    
}
