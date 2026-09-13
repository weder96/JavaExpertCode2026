package com.wsousa.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();

}
