package Views;

import Models.Countries;
import Service.repositories.CountryRepository;

import javax.swing.*;

public class CreatePane {

    public static boolean create(String tableName){
        switch(tableName){
            case "pais":
                String country = JOptionPane.showInputDialog("Introduce el país:");
                if (country == null || country.isBlank())
                    return false;
                CountryRepository repository = new CountryRepository();
                return repository.create(new Countries(0, country));
           /*case "bando":
               String sideName = JOptionPane.showInputDialog("Introduce el bando:");
               if (sideName== null)
                   return false;
               if(sideName.isBlank())
                   return false;
               CountryRepository repository = new CountryRepository();
               return repository.create(new Countries(0, country));*/
            default: return false;
        }





    }
}
