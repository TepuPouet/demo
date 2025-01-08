package com.example.demo.controllers;

import com.example.demo.entities.Page;
import com.example.demo.entities.User;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping(path="/all-users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path="/all-users") // Map ONLY POST Requests
    public @ResponseBody ResponseEntity<Object> addNewUser (@RequestBody User user) {
        User savedUser = userRepository.findByName(user.getName());
        if(savedUser == null){
            userRepository.save(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>("Username incorrect", HttpStatus.BAD_REQUEST);
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