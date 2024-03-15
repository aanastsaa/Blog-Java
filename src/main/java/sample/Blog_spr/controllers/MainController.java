package sample.Blog_spr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping("/")
    // Call the page (home.html) and we use this page as main page of our site
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }

    @GetMapping("/about")
    // Call the page (home.html) and we use this page as main page of our site
    public String about(Model model) {
        model.addAttribute("title", "About us");
        return "about";
    }

}