package com.riwi.persistence.CRUD;

import java.util.List;

public interface Read <t>{

    public List<t> read (t objeto);
}
