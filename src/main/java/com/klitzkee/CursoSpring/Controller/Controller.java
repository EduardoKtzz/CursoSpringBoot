package com.klitzkee.CursoSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")  //http://localhost:8080/controller
public class Controller {

    //Metodo http que ele recebe, pode set GET, POST, DELETE, PUT, etc...
    @GetMapping
    public String helloController() {
        return "Hello";
    }
    
}

