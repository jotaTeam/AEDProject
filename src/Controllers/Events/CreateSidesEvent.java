package Controllers.Events;

import Models.Sides;
import Service.repositories.SideRepository;
import Views.SidesForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateSidesEvent implements ActionListener{

    private JTextField sideName;
    private JTextField isWinner;
    private JTextField idWar;
    private SidesForm sidesForm;



    public CreateSidesEvent(JTextField sideName, JTextField isWinner, JTextField idWar, SidesForm sidesForm) {

        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;
        this.sidesForm = sidesForm;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides sides = new Sides(0, sideName.getText(),Integer.parseInt(isWinner.getText()),Integer.parseInt(idWar.getText()));

        SideRepository sideRepo = new SideRepository();

        sideRepo.create(sides);

        sidesForm.dispose();
    }
}
