package com.riwi.model;

import com.riwi.entitie.ReservationEntity;
import com.riwi.persistence.IModel.IReservationModel;

import java.util.List;

public class ReservationModel_Implementation implements IReservationModel {
    @Override
    public boolean create(ReservationEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {
        return false;
    }

    @Override
    public List<ReservationEntity> read(Integer dato) {
        return List.of();
    }

    @Override
    public List<ReservationEntity> readAll() {
        return List.of();
    }
}
