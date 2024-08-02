package com.riwi.model;

import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IFlightModel;
import com.riwi.persistence.dbConnection.Connect;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightModel_Implementation implements IFlightModel {

    public FlightModel_Implementation() {
    }

    //CREATE FLIGHT
    @Override
    public boolean create(FlightEntity objeto) {
        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query `time y date estan entrec comillas inversas debido a que son palabras reservadas en mysql`
        String query ="INSERT INTO flight (destination,`date`,`time`,id_avion) VALUES(?,?,?,?)";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setString(1,objeto.getDestination());
            ps.setString(2,objeto.getDate());
            ps.setString(3,objeto.getTime());
            ps.setInt(4,objeto.getId_avion());

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("Vuelo añadido con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo crear el vuelo  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }


    //DELETE FLIGHT
    @Override
    public boolean delete(Integer identidicador) {
        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="DELETE FROM flight WHERE id = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setInt(1,identidicador);

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("Vuelo eliminado con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo crear el usuario  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }


    //LIST FLIGHTS
    @Override
    public List<FlightEntity> read(String destino) {

        //variables
        List<FlightEntity> flys = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM flight WHERE destination = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setString(1,destino);

            //execute using executeQuery and asign rs because the merhod return anything
            rs = ps.executeQuery();

            //add the fly to the list
            if (rs.next()){
                //creation of slyght entity for the list
                FlightEntity flyght = new FlightEntity(rs.getString("date"), rs.getNString("destination"), rs.getInt("id"), rs.getInt("id_avion"), rs.getString("date"));

                //add the flyght to the list
                flys.add(flyght);
            }
        }catch (Exception e){
            System.out.println("No se pudo traer los vuelos  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return flys;
    }


    //READ ALL FLIGHTS
    @Override
    public List<FlightEntity> readAll() {
        //variables
        List<FlightEntity> flys = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM flight";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //execute using executeQuery and asign rs because the merhod return anything
            rs = ps.executeQuery();

            //add the fly to the list
            while (rs.next()){
                //creation of flight entity for the list
                FlightEntity flight = new FlightEntity(rs.getString("date"), rs.getNString("destination"), rs.getInt("id"), rs.getInt("id_avion"), rs.getString("date"));

                //add the flight to the list
                flys.add(flight);
            }
        }catch (Exception e){
            System.out.println("No se pudo traer los vuelos  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return flys;
    }

    @Override
    public boolean update(FlightEntity objeto) {
        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="UPDATE flight SET destination = ?, `date` = ?, `time` = ?, id_avion=? WHERE id = ?";

        //execute
        try {
            ps = con.prepareStatement(query);
            //Insert data into query
            ps.setString(1,objeto.getDestination());
            ps.setString(2,objeto.getDate());
            ps.setString(3,objeto.getTime());
            ps.setInt(4,objeto.getId_avion());
            ps.setInt(5,objeto.getId());

            ps.execute();

            return true;
        }catch (Exception e){
            System.out.println("No se pudo actualizar el usuario "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }
}
