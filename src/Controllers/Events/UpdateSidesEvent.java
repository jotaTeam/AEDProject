package Controllers.Events;

import javax.swing.*;
import Models.Sides;
import Models.Wars;
import Service.repositories.SideRepository;
import Service.repositories.WarsRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class UpdateSidesEvent implements ActionListener{
        private JTextField id;
        private JTextField sideName;
        private JTextField isWinner;
        private JTextField idWar;

    public UpdateSidesEvent(JTextField id, JTextField sideName, JTextField isWinner, JTextField idWar) {
        this.id = id;
        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides side = new Sides(0, sideName.getText(),Integer.parseInt(isWinner.getText()),0);

        SideRepository sideRepo = new SideRepository();

        sideRepo.update(side);

    }
}
