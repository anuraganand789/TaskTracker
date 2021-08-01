package com.refactoredcodes.tt.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteDB{
    
    public void connect(){
        final String dbLocation = "/home/anuraganand/TimerTask.db";
        final String dbUrlConnectionString = String.format("jdbc:sqlite:%s", dbLocation);

        try{
            Class.forName("org.sqlite.JDBC");
        }catch(ClassNotFoundException exception){
            exception.printStackTrace();
        }
        try(final Connection connection = DriverManager.getConnection(dbUrlConnectionString)){
            System.out.println("connection established");
        }catch(final SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
