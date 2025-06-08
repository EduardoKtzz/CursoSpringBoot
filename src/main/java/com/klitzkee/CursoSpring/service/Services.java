package com.klitzkee.CursoSpring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Services {

    //Metodo http que ele recebe, pode set GET, POST, DELETE, PUT, etc...
    @GetMapping
    public String helloService(String name) {
        return "Hello service!" + name;
    }
}
