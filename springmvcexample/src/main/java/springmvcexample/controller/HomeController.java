package springmvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(path="/home")
    public String home() {
        System.out.println("going to view");
        return "home"; // This should map to a home.jsp file
    }

    @RequestMapping(path="/welcome", method = RequestMethod.POST)
    public String welcome(@RequestParam("user") String name, Model model) {
        System.out.println(name); // For debugging
        model.addAttribute("name", name);
        return "welcome"; // This should map to a welcome.jsp file
    }
}
