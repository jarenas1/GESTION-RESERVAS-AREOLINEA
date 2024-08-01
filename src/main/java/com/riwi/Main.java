package com.riwi;
import com.riwi.entitie.FlightEntity;
import com.riwi.model.FlightModel_Implementation;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightEntity flight = new FlightEntity("2024-08-01","Paris", 2, 1,"18:00:00");

        FlightModel_Implementation aa = new FlightModel_Implementation();

//        aa.create(flight);
        //aa.delete(3);

        //System.out.println(aa.read("Mexico"));

        //System.out.println(aa.readAll());

        boolean status = aa.update(flight);
        if (status){
            System.out.println("hola");
        }
    }
}