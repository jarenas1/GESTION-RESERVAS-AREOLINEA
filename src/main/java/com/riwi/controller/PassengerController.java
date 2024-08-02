package com.riwi.controller;

import com.riwi.entitie.PassengerEntity;
import com.riwi.model.PassengerModel_Implementation;
import com.riwi.persistence.IModel.IPassengerModel;

import java.util.List;

public class PassengerController {

    //CREAMOS UNA INSTANCIA DE LA INTERFAZ DE PASAJERO
    private final IPassengerModel passengerModel;

    //ASIGNAMOS ESA INSTANCIA A UN PASSENGERCONTROLLER PARA PODER LLAMARLO POR FUERA Y QUE SEA AMS SEGURO EL CODIGO
    public PassengerController (){
        this.passengerModel = new PassengerModel_Implementation();
    }
    //VA A RECIBIR LOS DATOS PARA LA CREACION DE UN PASAJERO, LUEGO CON ESTOS DATOS CREA UN PASAJERO POR MEDIO DE UN CONSTRUCTOR Y SE LO PASA AL METODO DE CREAR
    public boolean create(String document, String lastName, String name){

        //POR MEDIO DE LA INSTANCIA CREADA POR FUERA LLAMAMOS EL METODO, EN EL CUAL CREAMOS UN CONSTRUCTOR CON LOS PARAMETROS DE ARRIBA PARA QIE CREE UNA INSTANCIA Y SE INTRODUZCA AL METODO
        return this.passengerModel.create(new PassengerEntity(document,lastName,name));
    }

    public boolean delete(int id){
        return this.passengerModel.delete(id);
    }

    public List<PassengerEntity> read(int id){
        return this.passengerModel.read(id);
    }

    public List<PassengerEntity> readAll(){
        return this.passengerModel.readAll();
    }

    public boolean update (String document, int id,String lastName, String name){
        return this.passengerModel.update(new PassengerEntity(document,id,lastName,name));
    }
}
