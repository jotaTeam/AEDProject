package Controllers;

import Controllers.Events.AccessBtnEvent;

import Service.Metadata;
import Service.Service;
import Service.database.DBConnection;

import Service.repositories.CountryRepository;
import Views.Content;
import Views.Home;
import Views.Menu;
import com.mysql.cj.jdbc.DatabaseMetaData;

import javax.swing.*;

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


    public void startContent(String table){

        Content content = new Content(null, true);

        JTable tabla = content.getContentTable();
        Service srv = new Service();

        Metadata data = new Metadata( srv.getAll(table));

        tabla.setModel(data);

        content.setVisible(true);



    }


}
