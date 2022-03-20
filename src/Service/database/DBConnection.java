package Service.database;

import java.sql.*;
import java.sql.DriverManager;

import static Service.database.DBConfig.*;



public class DBConnection {

    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            new DBConnection();
        }
        System.out.println("connect to DB");
        return connection;
    }

    private DBConnection(){
        try {
            this.connection = DriverManager.getConnection(URL,getProperties());

        }catch (SQLException e){
            e.printStackTrace();
        }
    }




}

