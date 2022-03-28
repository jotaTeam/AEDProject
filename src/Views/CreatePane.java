package Views;

import Models.Countries;
import Models.Sides;
import Service.repositories.CountryRepository;
import Service.repositories.SideRepository;

import javax.swing.*;

public class CreatePane {

    public static boolean create(String tableName){
        switch(tableName){
            case "pais":
                return createCountry();
           case "bando":
//               String sideName = JOptionPane.showInputDialog("Introduce el bando:");
//               if (sideName == null)
//                   return false;
//               if(sideName.isBlank())
//                   return false;
               return createSide();
//            SideRepository repository = new SideRepository();
//            return true;
            case "periodo_indenpendencia":
                return true;
            case "guerra":
                return true;
            default: return false;
        }

    }
    static boolean createCountry(){
        String country = JOptionPane.showInputDialog("Introduce el país:");
        if (country == null || country.isBlank())
            return false;
        CountryRepository repository = new CountryRepository();

        return repository.create(new Countries(0, country));
    }

    static boolean createSide(){
        String side = JOptionPane.showInputDialog("Introduce el bando:");
        if (side == null || side.isBlank())
            return false;

        SideRepository repository = new SideRepository();
        int isWinner = JOptionPane.showConfirmDialog(null,"Es el bando ganador", "sele",JOptionPane.YES_NO_OPTION);
        System.out.println(isWinner);
        return repository.create(new Sides(0, side, isWinner,1));
    }
    static boolean createIndependtDates(){
        String country = JOptionPane.showInputDialog("Introduce el país:");
        if (country == null || country.isBlank())
            return false;
        CountryRepository repository = new CountryRepository();

        return repository.create(new Countries(0, country));
    }
    static boolean createWar(){
        String country = JOptionPane.showInputDialog("Introduce el país:");
        if (country == null || country.isBlank())
            return false;
        CountryRepository repository = new CountryRepository();

        return repository.create(new Countries(0, country));
    }
}
