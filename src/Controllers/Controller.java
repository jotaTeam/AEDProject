package Controllers;

import Controllers.Events.AccessBtnEvent;

import Service.Metadata;
import Service.Service;
import Service.database.DBConnection;

import Service.repositories.CountryRepository;
import Views.Content;
import Views.Form;
import Views.Home;
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

        Form form = new Form(null, true);

        JPanel cp = form.getContentPane();

        CardLayout cl = (CardLayout) cp.getLayout();

//        cl.first(cp);
        cl.show(cp, "Card2");

        form.setVisible(true);

    }

    private void fillTable(String table, Content content) {

        JTable tabla = content.getContentTable();

        Service srv = new Service();

        Metadata data = new Metadata(srv.getAll(table));

        tabla.setModel(data);


    }


}
