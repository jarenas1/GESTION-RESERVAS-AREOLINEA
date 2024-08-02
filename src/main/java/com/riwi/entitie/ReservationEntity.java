package com.riwi.entitie;

public class ReservationEntity {

    private int id;
    private int id_passenger;
    private int id_flight;
    private String date; //MY SQL RECIBE 'AÑO-MES-DIA'
    private String time; //MY SQL RECIBE 'HORA:MINS:SEGUNDOS)private Stringr
    private int seat;
    //CONSTRUCTORS


    public ReservationEntity() {
    }

    public ReservationEntity(String date, int id, int id_flight, int id_passenger, int seat) {
        this.date = date;
        this.id = id;
        this.id_flight = id_flight;
        this.id_passenger = id_passenger;
        this.seat = seat;
    }

    public ReservationEntity(String date, int id_flight, int id_passenger, int seat) {
        this.date = date;
        this.id_flight = id_flight;
        this.id_passenger = id_passenger;
        this.seat = seat;
    }



    //GETTERS AND SETTERS


    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_flight() {
        return id_flight;
    }

    public void setId_flight(int id_flight) {
        this.id_flight = id_flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_passenger() {
        return id_passenger;
    }

    public void setId_passenger(int id_passenger) {
        this.id_passenger = id_passenger;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" +
                "date='" + date + '\'' +
                ", id=" + id +
                ", id_passenger=" + id_passenger +
                ", id_flight=" + id_flight +
                ", time='" + time + '\'' +
                '}';
    }
}
