package com.example.springbootquiz;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String homePage (Model model) {
        model.addAttribute("myvar", "This is a variable");
        return "hometemplate";
    }
}
