package dev.nikhil.smartmessagingsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("name","I AM COMING");
        model.addAttribute("Github","https://github.com/nikhilpandey02");

        System.out.println("Hello");
        return "home";
    }
}
