package Service.repositories;

import Models.CountrySide;
import Models.IndependencePeriod;
import Service.Service;
import Service.Metadata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountrySideRepository {


    private ResultSet rs;
    private Service srv;
    private String tableName;
    private Metadata md;

    public CountrySideRepository() {
        srv = new Service();
        tableName = "bando_pais";
        md = new Metadata(srv.getAll(tableName));
    }


    public List<CountrySide> get() {

        List<CountrySide> csides = new ArrayList<>();

        rs = srv.getAll(tableName);

        try {
            while (rs.next()) {
                CountrySide cs = new CountrySide(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5));
                csides.add(cs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return csides;

    }


    public CountrySide get(int id) {

        CountrySide cs = null;
        rs = srv.getById(id, tableName);

        try {
            while (rs.next()) {
                cs = new CountrySide(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return cs;

    }

    public boolean create(CountrySide cs) {

        boolean done = false;

        int i = srv.create(tableName,
                cs.getStartDate().toString(),
                cs.getEndDate().toString(),
                cs.getIdSide() + "",
                cs.getIdCountry() + "");

        if (i < 0) done = true;

        return done;
    }

    public boolean delete(int id) {

        boolean done = false;

        int i = srv.delete(id, tableName);

        if (i < 0) done = true;

        return done;


    }

    public boolean update(CountrySide cs){

        boolean done = false;

        int i = srv.update(cs.getId(),
                tableName,
                md.getColumnName(1), cs.getStartDate().toString(),
                md.getColumnName(2), cs.getEndDate().toString(),
                md.getColumnName(3), cs.getIdSide() + "",
                md.getColumnName(4), cs.getIdCountry() + "");

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
