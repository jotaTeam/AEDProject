package Controllers.Events;

import java.awt.event.ActionListener;
import Models.Countries;
import Service.repositories.CountryRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class UpdateCountryEvent implements ActionListener {
    private JTextField countryName;
    private int id;

    public UpdateCountryEvent(JTextField countryName, int id) {
        this.countryName = countryName;
        this.id = id;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Countries countries = new Countries(id, countryName.getText());

        CountryRepository countryRepo = new CountryRepository();

        countryRepo.update(countries);

    }
}
