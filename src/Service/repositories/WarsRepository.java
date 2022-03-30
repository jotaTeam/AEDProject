package Service.repositories;

import Models.IndependencePeriod;
import Models.Wars;
import Service.Service;
import Service.Metadata;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WarsRepository {

    private ResultSet rs;
    private Service srv;
    private String tableName;
    private Metadata md;

    public WarsRepository() {
        srv = new Service();
        tableName = "guerra";
        md = new Metadata(srv.getAll(tableName));
    }


    public List<Wars> get() {

        List<Wars> wars = new ArrayList<>();

        rs = srv.getAll(tableName);

        try {
            while (rs.next()) {
                Wars war = new Wars(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4));
                wars.add(war);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return wars;

    }


    public Wars get(int id) {

        Wars war = null;
        rs = srv.getById(id, tableName);

        try {
            while (rs.next()) {
                war = new Wars(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return war;

    }

    public boolean create(Wars war) {

        boolean done = false;

        int i = srv.create(tableName,
                war.getName(),
                war.getInitDate().toString(),
                war.getEndDate().toString());

        if (i < 0) done = true;

        return done;
    }

    public boolean delete(int id) {

        boolean done = false;

        int i = srv.delete(id, tableName);

        if (i < 0) done = true;

        return done;


    }

    public boolean update(Wars war){

        boolean done = false;

        System.out.println(war.toString());

        int i = srv.update(war.getId(),
                tableName,
                md.getColumnName(1),
                md.getColumnName(2),
                md.getColumnName(3),
                war.getName(),
                war.getInitDate().toString(),
                war.getEndDate().toString());

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
