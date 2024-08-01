package com.riwi.model;

import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.IModel.IPlaneModel;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        }
        return false;
    }

    @Override
    public List<PlaneEntity> read(String dato) {
        return List.of();
    }

    @Override
    public List<PlaneEntity> readAll() {
        return List.of();
    }

    @Override
    public boolean update(PlaneEntity objeto) {
        return false;
    }
}
