package Controllers;

import Service.Metadata;
import Service.Service;
import Service.repositories.*;
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
                case "bando":
                    SidesForm sides = new SidesForm(null, true);
//                    EventHandler.;
                    sides.setVisible(true);
                    fillTable(table,content);
                case "pais":
                    CountryForm countries = new CountryForm(null,true);
                    //TODO eventHandler
                    countries.setVisible(true);
                    fillTable(table,content);
                case "bando_pais":
                    IsSIde theSide = new IsSIde(null, true);
                    //TODO enventhandler
                    theSide.setVisible(true);
                    fillTable(table,content);
                case "periodo_independencia":
                    PeriodIndependence independence = new PeriodIndependence(null, true);
                    //TODO eventHandler
                    independence.setVisible(true);
                    fillTable(table,content);

                default:
                    System.out.println("no existe esa tabla");

            }

            // Modificar
        } else {

            switch (table) {
                case "guerra":
                    WarsFormDlg wfd = new WarsFormDlg(null, true);
                    EventHandler.AddEvent(wfd, id);
                    wfd.setVisible(true);
                    fillTable(table, content);


                case "bando":
                    SidesForm sides = new SidesForm(null, true);
//                    EventHandler.;
                    sides.setVisible(true);
                    fillTable(table,content);
                case "pais":
                    CountryForm countries = new CountryForm(null,true);
                    //TODO eventHandler
                    countries.setVisible(true);
                    fillTable(table,content);
                case "bando_pais":
                    IsSIde theSide = new IsSIde(null, true);
                    //TODO enventhandler
                    theSide.setVisible(true);
                    fillTable(table,content);
                case "periodo_independencia":
                    PeriodIndependence independence = new PeriodIndependence(null, true);
                    //TODO eventHandler
                    independence.setVisible(true);
                    fillTable(table,content);

                default:
                    System.out.println("no existe esa tabla");
            }

        }


    }

    public void startDelete(String table, int id) {

        switch (table) {
            case "guerra":
                WarsRepository wr = new WarsRepository();
                wr.delete(id);
                fillTable(table, content);

            case "bando":
                SideRepository sideRepository = new SideRepository();
                sideRepository.delete(id);
                fillTable(table, content);
            case "pais":
                CountryRepository countryRepository = new CountryRepository();
                countryRepository.delete(id);
                fillTable(table, content);

            case "bando_pais":
                CountrySideRepository countrySideRepository = new CountrySideRepository();
                countrySideRepository.delete(id);
                fillTable(table, content);
            case "periodo_independencia":
                IndependencePeriodRepository independencePeriodRepository = new IndependencePeriodRepository();
                independencePeriodRepository.delete(id);
                fillTable(table, content);
            default:
                System.out.println("no existe esa tabla");
        }
    }

    private void fillTable(String table, Content content) {

        JTable tabla = content.getContentTable();
        Service srv = new Service();
        Metadata data = new Metadata(srv.getAll(table));
        tabla.setModel(data);
    }


}
