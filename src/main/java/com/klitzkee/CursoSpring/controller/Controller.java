package com.klitzkee.CursoSpring.controller;

import com.klitzkee.CursoSpring.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")  //http://localhost:8080/controller
public class Controller {

    //Atributos

    //Associações
    @Autowired
    private Services services;

    //Metodo http que ele recebe, pode set GET, POST, DELETE, PUT, etc...
    //Aqui definimos que esse metodo vai se conectar com a classe de services
    @GetMapping
    public String helloController() {
        return services.helloService("Eduardo");
    }

    @PostMapping("")
    public String helloPost() {

    }
    
}

