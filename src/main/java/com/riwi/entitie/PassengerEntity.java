package com.riwi.entitie;

public class PassengerEntity {

    private int id;
    private  String name;
    private  String lastName;
    private  String document;

    //CONSTRUCTORS


    public PassengerEntity() {
    }

    public PassengerEntity(String document, int id, String lastName, String name) {
        this.document = document;
        this.id = id;
        this.lastName = lastName;
        this.name = name;
    }

    public PassengerEntity(String document, String lastName, String name) {
        this.document = document;
        this.lastName = lastName;
        this.name = name;
    }

    //SETTERS AND GETTERS


    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PassengerEntity{" +
                "document='" + document + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
