package Service.repositories;

import Models.Sides;
import Service.Service;
import Service.Metadata;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SideRepository {

        private ResultSet rs;
    private Service srv;
    private String tableName;
    private Metadata md;

    public SideRepository(){
        srv = new Service();
        tableName = "bando";
        md = new Metadata(srv.getAll(tableName));
    }

        public List<Sides> get() {

        List<Sides> sides = new ArrayList<>();

        rs = srv.getAll(tableName);

        try {
            while (rs.next()) {
                Sides side = new Sides(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                sides.add(side);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sides;

    }
    public Sides get(int id) {

        Sides side = null;
        rs = srv.getById(id, tableName);

        try {
            while (rs.next()) {
                side = new Sides(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return side;
    }

        public boolean create(Sides side) {

        boolean done = false;

        int i = srv.create(tableName, side.getSideName(),side.isWinner() + "", side.getIdWar() + "");

        if (i < 0) done = true;

        return done;
    }

        public boolean delete(int id) {

        boolean done = false;

        int i = srv.delete(id, tableName);

        if (i < 0) done = true;

        return done;


    }

    public boolean update(Sides side){

        boolean done = false;

        int i = srv.update(side.getId(),
                tableName,
                md.getColumnName(1),
                md.getColumnName(2),
                md.getColumnName(3),
                side.getSideName(),
                side.isWinner() + "",
                side.getIdWar() + "");

        if (i < 0) done = true;

        return done;

    }

    public String[] getColumnsName(){

        String[] columnNames = new String[4];

        for(int i=0;i<columnNames.length;i++){

            columnNames[i] = md.getColumnName(i);
        }

        return columnNames;

    }

}
