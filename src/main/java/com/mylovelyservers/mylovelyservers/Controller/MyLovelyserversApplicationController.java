package com.mylovelyservers.mylovelyservers.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLovelyserversApplicationController {
    @GetMapping("/test1")
    public String index(){
        return "Hello World!";
    }

    @GetMapping("/test2")
    public int getInt(){
        return 696969;
    }
}
