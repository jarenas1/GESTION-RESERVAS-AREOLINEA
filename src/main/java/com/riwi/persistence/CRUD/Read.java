package com.riwi.persistence.CRUD;

import java.util.List;

public interface Read <T>{

    //Devuelve una lista de tipo T con los usuario que se llamaron de la database
    public List<T> read (T dato);
}
