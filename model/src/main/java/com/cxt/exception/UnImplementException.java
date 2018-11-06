package com.cxt.exception;

/**
 * author Administrator
 * date   2018/10/30
 */
public class UnImplementException extends RuntimeException {

    public UnImplementException() {
    }

    public UnImplementException(String message) {
        super(message);
    }

    public UnImplementException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnImplementException(Throwable cause) {
        super(cause);
    }
}
