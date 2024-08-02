package com.riwi.controller;

import com.riwi.entitie.PlaneEntity;
import com.riwi.entitie.ReservationEntity;
import com.riwi.model.ReservationModel_Implementation;
import com.riwi.persistence.IModel.IReservationModel;

import java.util.List;

public class ReservationController {

    private final IReservationModel reservationModel;

    public ReservationController(){
        this.reservationModel = new ReservationModel_Implementation();
    }

    public boolean create(String date, int id_flight, int id_passenger, int seat){
        return this.reservationModel.create(new ReservationEntity(date, id_flight, id_passenger, seat));
    }

    public boolean delete(int id){
        return this.reservationModel.delete(id);
    }

    public List<ReservationEntity> read(int id){
        return this.reservationModel.read(id);
    }

    public List<ReservationEntity> readAll (){
        return this.reservationModel.readAll();
    }

    public boolean update(String date, int id, int id_flight, int id_passenger, int seat){
        return this.reservationModel.update(new ReservationEntity(date, id, id_flight,id_passenger, seat));
    }
}
