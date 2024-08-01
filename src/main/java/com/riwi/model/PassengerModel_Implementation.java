package com.riwi.model;

import com.riwi.entitie.PassengerEntity;
import com.riwi.persistence.IModel.IPassengerModel;

import java.util.List;

public class PassengerModel_Implementation implements IPassengerModel {
    @Override
    public boolean create(PassengerEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {
        return false;
    }

    @Override
    public List<PassengerEntity> read(String dato) {
        return List.of();
    }

    @Override
    public List<PassengerEntity> readAll() {
        return List.of();
    }

    @Override
    public boolean update(PassengerEntity objeto) {
        return false;
    }
}
