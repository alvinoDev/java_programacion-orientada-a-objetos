package com.aluracursos.screenmatch.exceptions;

public class ErrorConvertionDurationMinutesException extends RuntimeException {
    private String message;
    public ErrorConvertionDurationMinutesException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
