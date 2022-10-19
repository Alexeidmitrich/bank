package org.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class Handler {

    @ExceptionHandler({Exception.class, Departmentexception.class, PersonNotFoundException.class, CreditException.class})
    public final ResponseEntity<Object> handler(Exception ex, WebRequest  request) {
        System.out.println("YEAH" + ex.getMessage());
        ApiException exception = new ApiException(ex.getMessage(), ex);
        return new ResponseEntity<>(exception, HttpStatus.BAD_GATEWAY);
    }

}
