package com.riwi.controller;

import com.riwi.entitie.PlaneEntity;
import com.riwi.model.PlaneModel_Implementation;
import com.riwi.persistence.IModel.IPlaneModel;

import java.util.List;

public class planeController {
    private final IPlaneModel planeModel;

    public planeController(){
        this.planeModel = new PlaneModel_Implementation();
    }

    public boolean create(int capacity,String model){
        return this.planeModel.create(new PlaneEntity(capacity,model));
    }

    public boolean delete(int id){
        return this.planeModel.delete(id);
    }

    public List<PlaneEntity> read(int id){
        return this.planeModel.read(id);
    }

    public List<PlaneEntity> readAll (){
        return this.planeModel.readAll();
    }

    public boolean update(int capacity, int id,String model){
        return this.planeModel.update(new PlaneEntity(capacity,id,model));
    }
}
