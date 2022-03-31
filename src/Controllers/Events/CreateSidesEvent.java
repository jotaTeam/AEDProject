package Controllers.Events;

import Models.Sides;
import Service.repositories.SideRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateSidesEvent implements ActionListener{

    private JTextField sideName;
    private int isWinner;
    private int idWar;



    public CreateSidesEvent(JTextField sideName, int isWinner, int idWar) {

        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides sides = new Sides(0, sideName.getText(),isWinner,idWar);

        SideRepository sideRepo = new SideRepository();

        sideRepo.create(sides);
    }
}
