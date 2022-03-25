package Service.repositories;

import Models.Countries;
import Service.Service;
import Service.Metadata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryRepository{

    private ResultSet rs;
    private Service srv;
    private String tableName;
    private Metadata md;


    public CountryRepository() {
        srv = new Service();
        tableName = "pais";
        md = new Metadata(srv.getAll(tableName));
    }


    public List<Countries> get() {

        List<Countries> countries = new ArrayList<>();

        rs = srv.getAll(tableName);

        try {
            while (rs.next()) {
                Countries country = new Countries(rs.getInt(1), rs.getString(2));
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;

    }


    public Countries get(int id) {

        Countries country = null;
        rs = srv.getById(id, tableName);

        try {
            while (rs.next()) {
                country = new Countries(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return country;

    }


    public boolean create(Countries country) {

        boolean done = false;

        int i = srv.create(tableName, country.getCountryName());

        if (i < 0) done = true;

        return done;
    }

    public boolean delete(int id) {

        boolean done = false;

        int i = srv.delete(id, tableName);

        if (i < 0) done = true;

        return done;


    }

    public boolean update(Countries country){

        boolean done = false;

        int i = srv.update(country.getId(),tableName, md.getColumnName(1), country.getCountryName());

        if (i < 0) done = true;

        return done;

    }

    public String[] getColumnsName(){

        String[] columnNames = new String[2];

        for(int i=0;i<columnNames.length;i++){

            columnNames[i] = md.getColumnName(i);
        }

        return columnNames;

    }


}
