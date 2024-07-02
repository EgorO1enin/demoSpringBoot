package com.example.demo;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    //@RequestMapping(value = "/users" , method = RequestMethod.GET)
    @GetMapping("/users")
    public ModelAndView getUsers(){
        UserService userService = new UserService();
        ModelAndView model = new ModelAndView("users");
        model.addObject("users", userService.getAllUsers());
        return model;
    }
}
