package com.riwi;
import com.riwi.controller.FlightController;
import com.riwi.controller.PassengerController;
import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PassengerEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.entitie.ReservationEntity;
import com.riwi.model.FlightModel_Implementation;
import com.riwi.model.PassengerModel_Implementation;
import com.riwi.model.PlaneModel_Implementation;
import com.riwi.model.ReservationModel_Implementation;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //####################################################  PRUEBAS  ########################################################################
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
        //pp.update(planeToUpdate);

        PassengerEntity pe=new PassengerEntity("10332948939","Arenas","Juan José");

        PassengerModel_Implementation nnn = new PassengerModel_Implementation();

        //nnn.create(pe);

        //nnn.delete(1);

        //System.out.println(nnn.read(2));

        //System.out.println(nnn.readAll());

        //PassengerEntity pe1=new PassengerEntity("10332948939",2,"Arenas Ortiz","Juan José");

        //nnn.update(pe1);


        ReservationModel_Implementation rr = new ReservationModel_Implementation();

        ReservationEntity reservation = new ReservationEntity("2024-07-02",2,2,7);

        //rr.create(reservation);

        //System.out.println(rr.read(1));

        //System.out.println(rr.readAll());

        //rr.delete(6);

        ReservationEntity reservationUpdate = new ReservationEntity("2024-07-02",4,2,2,12);

        //rr.update(reservationUpdate);
        //####################################################  PRUEBAS  ########################################################################


        //FLIGHT

        FlightController flightController = new FlightController();

        flightController.create("2020-01-09","Bogota", 1,"18:00:00");

        PassengerController passengerController = new PassengerController();

        passengerController.readAll();
    }
}