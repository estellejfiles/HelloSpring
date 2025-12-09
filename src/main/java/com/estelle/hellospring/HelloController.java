package com.estelle.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// tells Spring this is a class with methods that can respond to user requests
@Controller
public class HelloController {

    // forwards slash represents home page
    @GetMapping("/")
    // method that runs when user goes to homepage
    public String greeting(Model model){
        // create variable for example data
        String name = "Estelle";
        // add variable as attribute to model
        model.addAttribute("name", name);
        // returns this string; represents mustache html template
        return "hello";
    }

    // represents an "about" web page
    @GetMapping("/about")
    // runs when user goes to about
    public String about(){
        // returns string representing html template
        return "about";
    }

}
