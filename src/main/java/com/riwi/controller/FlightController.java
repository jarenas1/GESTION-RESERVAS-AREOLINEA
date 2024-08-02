package com.riwi.controller;

import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.ReservationEntity;
import com.riwi.model.FlightModel_Implementation;
import com.riwi.persistence.IModel.IFlightModel;

import java.util.List;

public class FlightController {
    private final IFlightModel flightModel;

    public FlightController(){
        this.flightModel = new FlightModel_Implementation();
    }

    public boolean create(String date, String destiation, int id_avion, String time){
        return this.flightModel.create(new FlightEntity(date,destiation,id_avion,time));
    }

    public boolean delete(int id){
        return this.flightModel.delete(id);
    }

    public List<FlightEntity> read(String destination){
        return this.flightModel.read(destination);
    }

    public List<FlightEntity> readAll (){
        return this.flightModel.readAll();
    }

    public boolean update(String date, String destiation, int id, int id_avion, String time){
        return this.flightModel.create(new FlightEntity(date, destiation, id, id_avion, time));
    }
}
