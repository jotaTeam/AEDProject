package Controllers;

import Controllers.Events.AccessBtnEvent;

import Service.Metadata;
import Service.Service;
import Service.database.DBConnection;

import Service.repositories.CountryRepository;
import Views.*;
import Views.Menu;


import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Controller {

    private Home home;


    public Controller() {

        home = new Home();

        EventHandler.AddEvent(home, this);

        home.setVisible(true);

    }


    public void startMenu() {

        List<String> tableName = Metadata.getTableName();

        Menu menu = new Menu(home, true, tableName);

        EventHandler.AddEvent(menu, this);

        menu.setVisible(true);

    }


    public void startContent(String table) {

        Content content = new Content(null, true);


        fillTable(table, content);

        EventHandler.AddEvent(content, this, table);

        content.setVisible(true);




    }

    public void startForm(String table){

        switch (table){
            case "guerra":
                WarsFormDlg wfd = new WarsFormDlg(null, true);

                EventHandler.AddEvent(wfd);

                wfd.setVisible(true);
        }





    }

    private void fillTable(String table, Content content) {

        JTable tabla = content.getContentTable();
        Service srv = new Service();

        Metadata data = new Metadata(srv.getAll(table));

        tabla.setModel(data);


    }


}
