package com.riwi.entitie;

public class PlaneEntity {

    //ATRIBUTOS
    private int id;
    private String model;
    private int capacity;

    //CONSTRUCTORES


    public PlaneEntity() {
    }

    public PlaneEntity(int capacity, int id, String model) {
        this.capacity = capacity;
        this.id = id;
        this.model = model;
    }

    //SIN ID YA QUE ESTE ES AUTOGENERABLE
    public PlaneEntity(int capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

    //GETTERS Y SETTERS


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PlaneEntity{" +
                "capacity=" + capacity +
                ", id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
