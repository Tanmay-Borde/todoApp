package com.practice.todo_app.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {

//    @GetMapping(path = "/hello-world")
//    public String helloWorld(){
//        return "Hello Tanmay";
//    }

    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean(){
        return new AuthenticationBean("You are Authenticated....");
    }

//    @GetMapping(path = "/hello-world/path-variable/{name}")
//    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
//        // throw new RuntimeException("Something went Wrong....");
//        return new HelloWorldBean(String.format("Namaskaram, %s", name));
//    }

}