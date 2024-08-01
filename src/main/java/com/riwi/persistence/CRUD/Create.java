package com.riwi.persistence.CRUD;

public interface Create <t>{

    //va a devolver true si se crea el usuario
    public boolean create(t objeto);
}
