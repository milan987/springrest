package com.m2.controllers;

import com.m2.dao.CityDao;
import com.m2.dao.CityDaoImpl;
import com.m2.persistence.City;
import com.m2.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        City city = cityService.findById(1);
        model.addAttribute("city", city);
        model.addAttribute("msg", "JCG Hello World!");
        return "helloWorld";
    }

    @RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
    public String displayMessage(@PathVariable String msg, ModelMap model, @RequestParam (required = false) String mesec ) {
        model.addAttribute("msg", msg);
        model.addAttribute("mesec", mesec);
        return "helloWorld";
    }

}