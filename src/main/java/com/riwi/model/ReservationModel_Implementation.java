package com.riwi.model;

import com.riwi.entitie.PlaneEntity;
import com.riwi.entitie.ReservationEntity;
import com.riwi.persistence.IModel.IReservationModel;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReservationModel_Implementation implements IReservationModel {


    public ReservationModel_Implementation() {
    }

    @Override
    public boolean create(ReservationEntity objeto) {

        Connection con = Connect.conectar();
        PreparedStatement ps;

        String query = "INSERT INTO reservation (id_passenger,id_flight,`date`,seat) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(query);

            //set values
            ps.setInt(1,objeto.getId_passenger());
            ps.setInt(2,objeto.getId_flight());
            ps.setString(3,objeto.getDate());
            ps.setInt(4,objeto.getSeat());

            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("No se pudo crear la reserva  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }




    @Override
    public boolean delete(Integer identidicador) {

        Connection connection = Connect.conectar();
        PreparedStatement ps;
        String query = "DELETE FROM reservation WHERE id = ?";

        try {
            ps = connection.prepareStatement(query);

            ps.setInt(1,identidicador);

            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("No se pudo eliminar el avion");
        }finally {
            Connect.cerrar();
        }
        return false;
    }




    @Override
    public List<ReservationEntity> read(Integer id) {
        //variables
        List<ReservationEntity> reservations = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM reservation WHERE id = ?";

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
                ReservationEntity reservation = new ReservationEntity(rs.getString("date"), rs.getInt("id_flight"), rs.getInt("id_passenger"), rs.getInt("seat"));

                //add the plane to the list
                reservations.add(reservation);
            }
        }catch (Exception e){
            System.out.println("No se pudieron traer las reservas  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return reservations;
    }





    @Override
    public List<ReservationEntity> readAll() {

        //variables
        List<ReservationEntity> reservations = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        //Connection to db using the class because the method is created using the static
        Connection con = Connect.conectar();

        //Query
        String query ="SELECT * FROM reservation";

        //LAUNCH
        try {
            ps=con.prepareStatement(query);

            //execute using executeQuery and asign rs because the merhod return anything
            rs = ps.executeQuery();

            //add the plane to the list
            while (rs.next()){
                //creation of slyght entity for the list
                ReservationEntity reservation = new ReservationEntity(rs.getString("date"), rs.getInt("id"), rs.getInt("id_flight"), rs.getInt("id_passenger"), rs.getInt("seat"));

                //add the plane to the list
                reservations.add(reservation);
            }
        }catch (Exception e){
            System.out.println("No se pudieron traer las reservas  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return reservations;
    }





    @Override
    public boolean update(ReservationEntity objeto) {

        Connection connection = Connect.conectar();
        PreparedStatement ps;
        String query = "UPDATE reservation SET id_passenger = ?, id_flight = ?, date = ?, seat = ? WHERE id = ?";

        try {
            ps = connection.prepareStatement(query);

            ps.setInt(1, objeto.getId_passenger());
            ps.setInt(2,objeto.getId_flight());
            ps.setString(3,objeto.getDate());
            ps.setInt(4,objeto.getSeat());
            ps.setInt(5,objeto.getId());

            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("No se pudo modificar el avion  "+e.getMessage());
        }finally {
            Connect.cerrar();
        }
        return false;
    }
}
