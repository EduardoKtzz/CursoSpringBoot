package com.klitzkee.CursoSpring.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestErrorMessage {

    //Atributos
    private HttpStatus status;
    private String message;


}
