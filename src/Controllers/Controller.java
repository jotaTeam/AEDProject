package Controllers;

import Models.Countries;
import Models.IndependencePeriod;
import Service.Service;
import Service.Metadata;
import Service.database.DBConnection;
import Service.repositories.CountryRepository;
import Service.repositories.IndependencePeriodRepository;
import Views.Home;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Controller {


    public Controller(){


        Home home = new Home();

        home.setVisible(true);





    }


}
