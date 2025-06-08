package com.klitzkee.CursoSpring.controller;

import com.klitzkee.CursoSpring.domain.User;
import com.klitzkee.CursoSpring.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Aqui estamos a definir que um POST vai enviar informações e vamos recebê-las pelo 'corpo' dela
    //@RequestBody é para recebermos as aplicações
    @PostMapping("/{id}")
    public String helloPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Bem vindo " + filter;
    }
}

