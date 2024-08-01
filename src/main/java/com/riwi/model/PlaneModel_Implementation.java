package com.riwi.model;

import com.riwi.entitie.FlightEntity;
import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IPlaneModel;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlaneModel_Implementation implements IPlaneModel{



    @Override
    public boolean create(PlaneEntity objeto) {
        //variables
        PreparedStatement ps;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query `time y date estan entrec comillas inversas debido a que son palabras reservadas en mysql`
        String query ="INSERT INTO plane (model,capacity) VALUES(?,?)";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setString(1,objeto.getModel());
            ps.setInt(2,objeto.getCapacity());

            //execute using execute, becouse the method dont retorn anything
            ps.execute();
            System.out.println("avion añadido con exito");
            return true;
        }catch (Exception e){
            System.out.println("No se pudo crear el avion  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }

    //DELETE

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


    //find by id
    @Override
    public List<PlaneEntity> read(Integer id) {
        //variables
        List<PlaneEntity> planes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM plane WHERE id = ?";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //Insert data into query
            ps.setInt(1,id);

            //execute using executeQuery and asign rs because the merhod return anything
            rs = ps.executeQuery();

            //add the plane to the list
            if (rs.next()){
                //creation of slyght entity for the list
                PlaneEntity plane = new PlaneEntity(rs.getInt("capacity"),rs.getInt("id"),rs.getString("model"));

                //add the plane to the list
                planes.add(plane);
            }
        }catch (Exception e){
            System.out.println("No se pudo traer los vuelos  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return planes;
    }




    @Override
    public List<PlaneEntity> readAll() {

        //variables
        List<PlaneEntity> planes = new ArrayList<>();
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

            //add the plane to the list
            if (rs.next()){
                //creation of slyght entity for the list
                PlaneEntity plane = new PlaneEntity(rs.getInt("capacity"),rs.getInt("id"),rs.getString("model"));

                //add the plane to the list
                planes.add(plane);
            }
        }
        catch (Exception e){
            System.out.println("No se pudo traer los vuelos  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return planes;
    }

    @Override
    public boolean update(PlaneEntity objeto) {

        Connection connection = Connect.conectar();
        return false;
    }
}
