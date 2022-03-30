package Controllers.Events;

import Models.Countries;
import Service.repositories.CountryRepository;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateCountryEvent implements ActionListener{
    private JTextField countryName;

    public CreateCountryEvent(JTextField countryName) {
        this.countryName = countryName;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Countries countries = new Countries(0, countryName.getText());

        CountryRepository countryRepo = new CountryRepository();

        countryRepo.create(countries);
    }
}
