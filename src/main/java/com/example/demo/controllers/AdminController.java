package com.example.demo.controllers;

import com.example.demo.entities.Page;
import com.example.demo.entities.User;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/admin-page")
public class AdminController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private ComponentRepository componentRepository;

    @GetMapping(path="/")
    public @ResponseBody String showLoginComponent() {
        //check with cookies or session if logged in
        // or make identification

        return """
    <h1>POIESJFBJ</h1>
    """;
    }

    @GetMapping(path="/all-pages")
    public @ResponseBody Iterable<Page> getAllPages() {
        return pageRepository.findAll();
    }

    @PostMapping(path="/login") // Map ONLY POST Requests
    public @ResponseBody String addNewCity (@RequestParam String name
            , @RequestParam String pwd) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        if(name == null || pwd == null){
            return "Wrong identification";
        }

        User savedUser = userRepository.findByName(name);
        // decrypt password
        if(savedUser.getPassword().equals(pwd)){
            return "Logged in";
            // give session, cookie and or token
        }

        return "Saved";
    }


}