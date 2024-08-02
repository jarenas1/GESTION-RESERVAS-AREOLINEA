package com.riwi;
import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.model.FlightModel_Implementation;
import com.riwi.model.PlaneModel_Implementation;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightEntity flight = new FlightEntity("2024-08-01","ITALIA", 2, 1,"18:00:00");

        FlightModel_Implementation aa = new FlightModel_Implementation();

        //aa.create(flight);
        //aa.delete(3);

        //System.out.println(aa.read("Mexico"));

        //System.out.println(aa.readAll());

//        boolean status = aa.update(flight);
//        if (status){
//            System.out.println("hola");
//        }

        PlaneModel_Implementation pp = new PlaneModel_Implementation();

        PlaneEntity plane = new PlaneEntity(212,"boeing 747");
        //pp.create(plane);
        //System.out.println(pp.read(2));
        //System.out.println(pp.readAll());

        PlaneEntity planeToUpdate = new PlaneEntity(212, 2, "boeing 999");
        pp.update(planeToUpdate);
    }
}