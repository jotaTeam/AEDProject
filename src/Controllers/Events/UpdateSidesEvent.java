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
        private int id;
        private JTextField sideName;
        private int isWinner;
        private int idWar;

    public UpdateSidesEvent(int id, JTextField sideName, int isWinner, int idWar) {
        this.id = id;
        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Sides side = new Sides(id, sideName.getText(),isWinner,idWar);

        SideRepository sideRepo = new SideRepository();

        sideRepo.update(side);

    }
}
