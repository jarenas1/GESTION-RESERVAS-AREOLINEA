package com.riwi.model;

import com.riwi.entitie.PassengerEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IPassengerModel;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PassengerModel_Implementation implements IPassengerModel {

    public PassengerModel_Implementation() {
    }

    @Override
    public boolean create(PassengerEntity objeto) {

        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query `time y date estan entrec comillas inversas debido a que son palabras reservadas en mysql`
        String query ="INSERT INTO passenger (name,lastName,document) VALUES(?,?,?)";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setString(1,objeto.getName());
            ps.setString(2,objeto.getLastName());
            ps.setString(3,objeto.getDocument());

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("pasajero añadido con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo crear el pasajero  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }





    @Override
    public boolean delete(Integer identidicador) {
        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="DELETE FROM passenger WHERE id = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setInt(1,identidicador);

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("pasajero eliminado con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo eliminar el pasajero  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }





    @Override
    public List<PassengerEntity> read(Integer id) {
        //variables
        List<PassengerEntity> passengers = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM passenger WHERE id = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setInt(1,id);

            //execute using executeQuery and asign rs because the merhod return anything
            rs = ps.executeQuery();

            //add the plane to the list
            if (rs.next()){
                //creation of passenger entity for the list
                PassengerEntity passenger = new PassengerEntity(rs.getString("document"),rs.getString("lastName"),rs.getString("name"));

                //add the plane to the list
                passengers.add(passenger);
            }
        }catch (Exception e){
            System.out.println("No se pudo traer los pasajeros  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return passengers;
    }





    @Override
    public List<PassengerEntity> readAll() {

        List<PassengerEntity> passengers = new ArrayList<>();
        Connection connection = Connect.conectar();
        ResultSet rs;
        PreparedStatement ps;
        String query = "SELECT * FROM passenger";

        try {
            ps = connection.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                PassengerEntity passenger = new PassengerEntity(rs.getString("document"), rs.getInt("id"), rs.getString("lastName"), rs.getString("name"));

                passengers.add(passenger);
            }

        }catch (Exception e){

        }
        return passengers;
    }




    @Override
    public boolean update(PassengerEntity objeto) {

        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        String query ="UPDATE passenger SET name = ?, lastName = ?, document = ? WHERE id = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setString(1,objeto.getName());
            ps.setString(2,objeto.getLastName());
            ps.setString(3,objeto.getDocument());
            ps.setInt(4,objeto.getId());

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("pasajero modificar con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo modificar el pasajero  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }
}
