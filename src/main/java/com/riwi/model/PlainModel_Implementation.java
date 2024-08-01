package com.riwi.model;

import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IPlaneModel;

import java.util.List;

public class PlainModel_Implementation implements IPlaneModel{

    @Override
    public boolean create(PlaneEntity objeto) {
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
    public List<PlaneEntity> readAll() {
        return List.of();
    }

    @Override
    public boolean update(PlaneEntity objeto) {
        return false;
    }
}
