package Service.repositories;


import Models.IndependencePeriod;
import Service.Service;
import Service.Metadata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IndependencePeriodRepository {

    private ResultSet rs;
    private Service srv;
    private String tableName;
    private Metadata md;

    public IndependencePeriodRepository() {
        srv = new Service();
        tableName = "periodo_independencia";
        md = new Metadata(srv.getAll(tableName));
    }


    public List<IndependencePeriod> get() {

        List<IndependencePeriod> countries = new ArrayList<>();

        rs = srv.getAll(tableName);

        try {
            while (rs.next()) {
                IndependencePeriod country = new IndependencePeriod(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4));
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;

    }


    public IndependencePeriod get(int id) {

        IndependencePeriod ip = null;
        rs = srv.getById(id, tableName);

        try {
            while (rs.next()) {
                ip = new IndependencePeriod(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return ip;

    }

    public boolean create(IndependencePeriod ip) {

        boolean done = false;

        int i = srv.create(tableName,
                ip.getStartDate().toString(),
                ip.getEndDate().toString(),
                ip.getIdCountry() + "");

        if (i < 0) done = true;

        return done;
    }

    public boolean delete(int id) {

        boolean done = false;

        int i = srv.delete(id, tableName);

        if (i < 0) done = true;

        return done;


    }

    public boolean update(IndependencePeriod ip){

        boolean done = false;

        int i = srv.update(ip.getId(),
                tableName,
                md.getColumnName(1), ip.getStartDate().toString(),
                md.getColumnName(2), ip.getEndDate().toString(),
                md.getColumnName(3), ip.getIdCountry() + "");

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
