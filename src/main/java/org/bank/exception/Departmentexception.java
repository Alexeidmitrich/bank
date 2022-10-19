package org.bank.exception;

public class Departmentexception extends RuntimeException{
    public Departmentexception(String message, Throwable cause) {
        super(message, cause);
    }

    public Departmentexception(String message) {
        super(message);
    }
}
