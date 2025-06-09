package com.klitzkee.CursoSpring.exceptions;

//Exceções personalizadas
//Sempre dar extends na RuntimeException
public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException() { super("Evento não encontrado");}

    public EventNotFoundException(String message) { super(message);}
}
