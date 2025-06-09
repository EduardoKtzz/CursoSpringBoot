package com.klitzkee.CursoSpring.infra;

import com.klitzkee.CursoSpring.exceptions.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //No parametro da classe, temos que colocar a exceção que criamos na pasta "exception"
    //Nesse metodo só vem uma ‘String’ de retorno
    @ExceptionHandler(EventNotFoundException.class)  //Precisamos disso para o Spring identificar a classe que vai ser tratadas
    private ResponseEntity<RestErrorMessage> userNotFoundHandler(EventNotFoundException exception) {
        RestErrorMessage threatResponse = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(threatResponse);
    }

}
