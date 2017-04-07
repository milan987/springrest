package com.m2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("msg", "JCG Hello World!");
        return "helloWorld";
    }

    @RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
    public String displayMessage(@PathVariable String msg, ModelMap model, @RequestParam String mesec) {
        model.addAttribute("msg", msg);
        model.addAttribute("mesec", mesec);
        return "helloWorld";
    }

}