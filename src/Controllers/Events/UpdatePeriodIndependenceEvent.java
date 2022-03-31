package Controllers.Events;

import Models.IndependencePeriod;
import Models.Wars;
import Service.repositories.IndependencePeriodRepository;
import Service.repositories.WarsRepository;
import Views.PeriodIndependence;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class UpdatePeriodIndependenceEvent implements ActionListener{
    private JTextField periodIndependenceStartInput;
    private JTextField periodIndependenceEndInput;
    private JTextField perInIdPaisInput;
    private int id;
    private PeriodIndependence pind;

    public UpdatePeriodIndependenceEvent(int id,JTextField periodIndependenceStartInput, JTextField periodIndependenceEndInput, JTextField perInIdPaisInput, PeriodIndependence pind) {
        this.periodIndependenceStartInput = periodIndependenceStartInput;
        this.periodIndependenceEndInput = periodIndependenceEndInput;
        this.perInIdPaisInput = perInIdPaisInput;
        this.id =id;
        this.pind = pind;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        IndependencePeriod indPeriod = new IndependencePeriod(id, new Date(Date.valueOf(periodIndependenceStartInput.getText()).getTime()),
                new Date(Date.valueOf(periodIndependenceEndInput.getText()).getTime()),Integer.parseInt(perInIdPaisInput.getText()));

        IndependencePeriodRepository indPeriodRepository = new IndependencePeriodRepository();

        indPeriodRepository.update(indPeriod);

        pind.dispose();

    }

}
