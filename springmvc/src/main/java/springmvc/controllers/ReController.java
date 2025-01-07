package springmvc.controllers;

import java.net.ResponseCache;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	// this is redirect prefix
	@RequestMapping("/one")
	public String one() {
		return "redirect:/http://www.google.com";
	}
	
	
// this is redirect view
//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("this is one handler");
//		RedirectView redirectview = new RedirectView();
//		redirectview.setUrl("http://www.google.com");
//		return redirectview;
//	}
//	
	//httpServletResponse redirect
//	public String one(HttpServletResponse response) {
//		System.out.println("this is one handler");
//		return response.sendRedirect("");
//		
//	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two handler");
		return "content";
	}

}
