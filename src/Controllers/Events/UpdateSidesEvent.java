package Controllers.Events;

import javax.swing.*;
import Models.Sides;
import Service.repositories.SideRepository;
import Views.SidesForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateSidesEvent implements ActionListener{
        private int id;
        private JTextField sideName;
        private JTextField isWinner;
        private JTextField idWar;
        private SidesForm sidesForm;

    public UpdateSidesEvent ( int id, JTextField sideName, JTextField isWinner, JTextField idWar, SidesForm sidesForm) {
        this.id = id;
        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;
        this.sidesForm = sidesForm;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides side = new Sides(id, sideName.getText(),Integer.parseInt(isWinner.getText()),Integer.parseInt(idWar.getText()));

        SideRepository sideRepo = new SideRepository();

        sideRepo.update(side);

        sidesForm.dispose();

    }
}
