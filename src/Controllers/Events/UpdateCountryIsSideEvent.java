package Controllers.Events;

import Models.CountrySide;
import Service.repositories.CountrySideRepository;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


import javax.swing.*;


public class UpdateCountryIsSideEvent implements ActionListener {
    private int id;
    private JTextField startDate;
    private JTextField endDate;
    private JTextField idSide;
    private JTextField idCountry;

    public UpdateCountryIsSideEvent(int id, JTextField startDate, JTextField endDate, JTextField idSide, JTextField idCountry) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idSide = idSide;
        this.idCountry = idCountry;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        CountrySide countrySide = new CountrySide(id, new Date(Date.valueOf(startDate.getText()).getTime()),
                new Date(Date.valueOf(endDate.getText()).getTime()), Integer.parseInt(idSide.getText()),
                Integer.parseInt(idCountry.getText()));

        CountrySideRepository cr = new CountrySideRepository();

        cr.update(countrySide);

    }
}
