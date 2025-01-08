package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormController {

	@RequestMapping(path = "/complex")
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
	  // error form
		if(result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		return "success";
	}

}

/*
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@RequestParam("name") String name, @RequestParam("id") Long id) {
		System.out.println(name);
		System.out.println(id);
		return "success";
	}
*/
