package Controllers;

import Service.Metadata;
import Service.Service;
import Service.repositories.WarsRepository;
import Views.*;
import Views.Menu;
import javax.swing.*;
import java.util.List;

public class Controller {

    private Home home;
    private Content content;


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

        content = new Content(null, true);


        fillTable(table, content);

        EventHandler.AddEvent(content, this, table);

        content.setVisible(true);


    }

    public void startForm(String table, int id) {

        // Crear
        if (id <= 0) {

            switch (table) {
                case "guerra":
                    WarsFormDlg wfd = new WarsFormDlg(null, true);
                    EventHandler.AddEvent(wfd);
                    wfd.setVisible(true);
                    fillTable(table, content);

            }

            // Modificar
        } else {

            switch (table) {
                case "guerra":
                    WarsFormDlg wfd = new WarsFormDlg(null, true);
                    EventHandler.AddEvent(wfd, id);
                    wfd.setVisible(true);
                    fillTable(table, content);
            }

        }


    }

    public void startDelete(String table, int id) {

        switch (table) {
            case "guerra":
                WarsRepository wr = new WarsRepository();
                wr.delete(id);
                fillTable(table, content);
        }
    }

    private void fillTable(String table, Content content) {

        JTable tabla = content.getContentTable();
        Service srv = new Service();
        Metadata data = new Metadata(srv.getAll(table));
        tabla.setModel(data);
    }


}
