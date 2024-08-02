package com.riwi.model;

import com.riwi.entitie.ReservationEntity;
import com.riwi.persistence.IModel.IReservationModel;
import com.riwi.persistence.dbConnection.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ReservationModel_Implementation implements IReservationModel {
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
            System.out.println("No se pudo crear la reserva");
        }finally {
            Connect.cerrar();
        }
        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {

       
        return false;
    }

    @Override
    public List<ReservationEntity> read(Integer dato) {
        return List.of();
    }

    @Override
    public List<ReservationEntity> readAll() {
        return List.of();
    }
}
