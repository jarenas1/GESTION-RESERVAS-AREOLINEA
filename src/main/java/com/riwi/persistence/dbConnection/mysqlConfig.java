package com.riwi.persistence.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysqlConfig {

    static Connection connection = null;

    //ABRIR CONECCION CON LA DATABASE

    static Connection conectar(){
            //CREAMOS LAS VARIABLES NECESARIAS PARA LA CONECCION  "jdbc:mysql://host:port/nombre";

            String URL = "jdbc:mysql://btiefdm5la9eg8hg4ixv-mysql.services.clever-cloud.com:3306/btiefdm5la9eg8hg4ixv";
            String user = "uihzeh8kpbi1wadq";
            String password = "08sWGXCBYJxlZtSrxnop";


            //NOS CONECTAMOS USANDO EL DIRVER MANAGER Y LA GUARDAMOS EN LA VARIABLE NULA
            try {
                connection = DriverManager.getConnection(URL,user,password);
                System.out.println("Coneccion exitosa");

            }catch (Exception e){
                System.out.println("No se pudo establecer la conexion con la db "+e.getMessage());
            }

            return connection;
        }

    }
}
