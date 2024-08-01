package com.riwi.persistence.IModel;

import com.riwi.entitie.PassengerEntity;
import com.riwi.persistence.CRUD.*;

public interface IPassengerModel extends Create<PassengerEntity>, Read<String,PassengerEntity>, ReadAll<PassengerEntity>, Update<PassengerEntity>, Delete<Integer> {
}
