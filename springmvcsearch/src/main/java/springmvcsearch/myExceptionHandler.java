package springmvcsearch;

import org.springframework.http.HttpStatus;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//centralized Exception Handler

@ControllerAdvice
public class myExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionhandlernumber(Model model) {
		model.addAttribute("msg", "number format exception has occured");
		return "null_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionhandlerNull(Model model) {
		model.addAttribute("msg", "null pointer exception has occured");
		return "null_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionhandlerGenric(Model model) {
		model.addAttribute("msg", "exception has occured");
		return "null_page";
	}

}
