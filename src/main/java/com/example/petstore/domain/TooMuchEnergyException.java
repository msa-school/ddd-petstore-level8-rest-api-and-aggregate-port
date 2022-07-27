package com.example.petstore.domain;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason="Too MUCH energy")
public class TooMuchEnergyException extends RuntimeException{

    public TooMuchEnergyException(){
        super("Too much energy");
        
    }
}