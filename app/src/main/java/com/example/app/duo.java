package com.example.app;


import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class duo {

    @GetMapping( "/duo")

    public String index(){
        return "deb is coollllll";

    }

    @GetMapping("/http")

    public String Name(){
        return "My name is Debjyoti Das";
    }
}
