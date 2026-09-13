package com.wsousa.banco;

public class ContaInativaException extends OperacaoBancariaException {

    public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause) {
        super(message, cause);
    }

}
