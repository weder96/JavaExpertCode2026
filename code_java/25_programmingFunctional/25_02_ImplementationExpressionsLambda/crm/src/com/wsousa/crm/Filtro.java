package com.wsousa.crm;

public interface Filtro<T> {

    boolean avaliar(T objeto);

}