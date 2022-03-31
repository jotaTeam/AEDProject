package Controllers.Events;


import Models.CountrySide;
import Service.repositories.CountryRepository;
import Service.repositories.CountrySideRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class CreateIsSidesEvent implements  ActionListener{
    private JTextField startDate;
    private JTextField endDate;
    private JTextField idSide;
    private JTextField idCountry;

    public CreateIsSidesEvent(JTextField startDate, JTextField endDate, JTextField idSide, JTextField idCountry) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.idSide = idSide;
        this.idCountry = idCountry;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        CountrySide countrySide = new CountrySide(0, new Date(Date.valueOf(startDate.getText()).getTime()),
                new Date(Date.valueOf(endDate.getText()).getTime()), Integer.parseInt(idSide.getText()),
                Integer.parseInt(idCountry.getText()));

        CountrySideRepository cr = new CountrySideRepository();

        cr.create(countrySide);
    }
}
