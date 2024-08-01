package com.riwi.persistence.IModel;

import com.riwi.entitie.ReservationEntity;
import com.riwi.persistence.CRUD.Create;
import com.riwi.persistence.CRUD.Delete;
import com.riwi.persistence.CRUD.Read;
import com.riwi.persistence.CRUD.ReadAll;

public interface IReservationModel extends Create<ReservationEntity>, Read<Integer,ReservationEntity>, ReadAll<ReservationEntity>, Delete<Integer> {
}
