package com.riwi.persistence.IModel;

import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.CRUD.*;

//IMPLEMENTAMOS TODOS LOS METODOS QUE VA A TENER EL VUELO
public interface IFlightModel extends Create<FlightEntity>, Delete<Integer>, Update<FlightEntity>, Read<String, FlightEntity>, ReadAll<FlightEntity> {
}
