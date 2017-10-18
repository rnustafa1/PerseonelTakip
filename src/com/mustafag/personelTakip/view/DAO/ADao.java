package com.mustafag.personelTakip.view.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ADao {

    Connection connection;

    public ADao(){
        String URL = "jdbc:mysql://localhost:3306/personelkayit";
        try {
            this.connection = DriverManager.getConnection(URL, "root", "afatsum");
        }catch (SQLException ex){
            ex.printStackTrace();
        }


    }
}