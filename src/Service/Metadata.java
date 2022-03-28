package Service;

import Service.database.DBConnection;


import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Metadata extends AbstractTableModel {

    ResultSet rs;
    ResultSetMetaData md;
    int columnsNum;
    int rowNum;

    public Metadata(ResultSet rs){

        this.rs = rs;

        try{

            md = rs.getMetaData();
            rs.last();
            rowNum = rs.getRow();
            columnsNum = md.getColumnCount();

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public int getRowCount() {
        return rowNum;
    }

    @Override
    public int getColumnCount() {
        return columnsNum;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        try{
            rs.absolute(rowIndex+1);

            Object o = rs.getObject(columnIndex +1);

            return o;

        } catch (SQLException e) {
            return e.toString();
        }

    }


    @Override
    public String getColumnName(int column) {
        try {
            return md.getColumnName(column+1).toUpperCase(Locale.ROOT);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> getTableName(){

        List<String> tableName = new ArrayList<>();
        String TABLE_NAME = "TABLE_NAME";
        String TABLE_CAT = "TABLE_CAT";
        String[] TABLE_TYPES = {"TABLE"};
        Connection con = DBConnection.getConnection();

        try {
            DatabaseMetaData dbmd = (DatabaseMetaData) con.getMetaData();

            ResultSet rs = dbmd.getTables(null, null, null, TABLE_TYPES);

            while (rs.next()){

                String bbdd = rs.getString(TABLE_CAT);


                if ( bbdd.equals("guerritas")){

                    tableName.add(rs.getString(TABLE_NAME));
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableName;

    }
}
