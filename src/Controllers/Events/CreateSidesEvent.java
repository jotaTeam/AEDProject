package Controllers.Events;

import Models.Sides;
import Service.repositories.SideRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateSidesEvent implements ActionListener{
    private JTextField id;
    private JTextField sideName;
    private JTextField isWinner;
    private JTextField idWar;



    public CreateSidesEvent(JTextField id, JTextField sideName, JTextField isWinner, JTextField idWar) {

        this.id = id;
        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides sides = new Sides(0, sideName.getText(),Integer.parseInt(isWinner.getText()),0);

        SideRepository sideRepo = new SideRepository();

        sideRepo.create(sides);
    }
}
