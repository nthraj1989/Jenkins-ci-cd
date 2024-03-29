package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller1{

    @GetMapping("/greeting/{name}")
    public String displayName(@PathVariable String name){
        System.out.println(name);
       return "Hello" + name + "Congratulation you have successfully completed Jenkins CI/CD";
    }

    @GetMapping("/users")
    public String listAllUser(){
        List<String> name = Arrays.asList("Rajnish", "Shyam," ,"Mangal");
        return  name.get(0);
    }


}
