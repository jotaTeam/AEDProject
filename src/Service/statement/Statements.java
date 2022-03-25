package Service.statement;

import Service.database.DBConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {

    public static ResultSet executeQuery(String sql) {
        ResultSet rs;
        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            rs = null;

            JOptionPane.showMessageDialog(null, "Error de conexión", "Error", JOptionPane.ERROR_MESSAGE);

            ex.printStackTrace();

            return rs;


        }


    }
    public static int executeUpdate(String sql) {
        int i;
        try {
            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();
            JOptionPane.showMessageDialog(null, sql);
            i = stmt.executeUpdate(sql);
        } catch (SQLException ex) {

            System.err.println(ex.getMessage());
            i = 0;
        }
        return i;
    }
}
