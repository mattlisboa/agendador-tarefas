package com.matheus.agendadortarefas.insfrastucture.exceptions;


import javax.security.sasl.AuthenticationException;

public class UnauthorizedException extends AuthenticationException {

    public UnauthorizedException(String mensagem){

        super(mensagem);
    }

    public UnauthorizedException(String mensagem, Throwable throwable){

        super(mensagem, throwable);
    }



}
