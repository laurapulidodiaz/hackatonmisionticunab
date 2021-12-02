package com.ejemplo.tiendaalamano.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadResourceRequestException extends RuntimeException {
    public BadResourceRequestException(String msg) {
        super(msg);
    }
}
