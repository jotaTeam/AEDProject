package Service;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

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
            return md.getColumnName(column+1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
