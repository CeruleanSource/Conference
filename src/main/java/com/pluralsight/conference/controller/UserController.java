package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// Every call that goes in and out
// looks at content type and header to see
// what it would retunr

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue="Abdullah") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Mohmaed") String lastname,
                        @RequestParam(value = "age", defaultValue = "19") int age){

        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstname: " + user.getFirstname());
        return user;
    }
}
