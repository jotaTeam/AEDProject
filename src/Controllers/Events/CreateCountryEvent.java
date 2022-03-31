package Controllers.Events;

import Models.Countries;
import Service.repositories.CountryRepository;
import Views.CountryForm;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateCountryEvent implements ActionListener{
    private JTextField countryName;
    private CountryForm cform;

    public CreateCountryEvent(JTextField countryName, CountryForm cform) {
        this.countryName = countryName;
        this.cform = cform;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Countries countries = new Countries(0, countryName.getText());

        CountryRepository countryRepo = new CountryRepository();

        countryRepo.create(countries);

        cform.dispose();
    }
}
