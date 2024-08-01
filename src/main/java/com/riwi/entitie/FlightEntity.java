package com.riwi.entitie;


import java.time.LocalDate;
import java.time.LocalTime;

public class FlightEntity {

    //ATRIBUTOS
    private int id;
    private String destination;
    private String date; //MY SQL RECIBE 'AÑO-MES-DIA'
    private String time; //MY SQL RECIBE 'HORA:MINS:SEGUNDOS)
    private int id_avion;

    //CONSTRUCTORS

    public FlightEntity() {
    }

    public FlightEntity(String date, String destination, int id, int id_avion, String time) {
        this.date = date;
        this.destination = destination;
        this.id = id;
        this.id_avion = id_avion;
        this.time = time;
    }

    public FlightEntity(String date, String destination, int id_avion, String time) {
        this.date = date;
        this.destination = destination;
        this.id_avion = id_avion;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public int getId_avion() {
        return id_avion;
    }

    public String getTime() {
        return time;
    }

    //GETTERS AND SETTERS


    public void setDate(String date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "date='" + date + '\'' +
                ", id=" + id +
                ", destination='" + destination + '\'' +
                ", time='" + time + '\'' +
                ", id_avion=" + id_avion +
                '}';
    }
}

