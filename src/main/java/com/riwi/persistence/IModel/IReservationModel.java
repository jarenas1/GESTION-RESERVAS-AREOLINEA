package com.riwi.persistence.IModel;

import com.riwi.entitie.ReservationEntity;
import com.riwi.persistence.CRUD.*;

public interface IReservationModel extends Create<ReservationEntity>, Read<Integer,ReservationEntity>, ReadAll<ReservationEntity>, Delete<Integer> , Update<ReservationEntity> {
}
