package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class yoController {

    @GetMapping("/")

    public String index(){
        return "Get a life young man" +
                "you should work hard ";
    }

}
