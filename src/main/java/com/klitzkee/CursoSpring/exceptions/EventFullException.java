package com.klitzkee.CursoSpring.exceptions;

//Exceções personalizadas
//Sempre dar extends na RuntimeException
public class EventFullException extends RuntimeException {

    //Construtor para colocar a mensagem
    public EventFullException() { super("Filtro não existe");}

    //Construtor para receber a mensagem e passar a mensagem
    public EventFullException(String message) { super(message);}
}
