package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private ComponentRepository componentRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewCity (@RequestParam String name
            , @RequestParam String pwd) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User user = new User();
        user.setName(name);
        user.setPassword(pwd);
        userRepository.save(user);
        return "Saved";
    }
//
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
//
//    @GetMapping(path="/all-languages")
//    public @ResponseBody Iterable<CountryLanguage> getAllCountryLanguages() {
//        return countryLanguageRepository.findAll();
//    }
}