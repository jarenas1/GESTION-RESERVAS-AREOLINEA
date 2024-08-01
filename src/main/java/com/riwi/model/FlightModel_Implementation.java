package com.riwi.model;

import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IFlightModel;

import java.util.List;

public class FlightModel_Implementation implements IFlightModel {
    @Override
    public boolean create(FlightEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {
        return false;
    }

    @Override
    public List<PlaneEntity> read(String dato) {
        return List.of();
    }

    @Override
    public List<FlightEntity> readAll() {
        return List.of();
    }

    @Override
    public boolean update(FlightEntity objeto) {
        return false;
    }
}
