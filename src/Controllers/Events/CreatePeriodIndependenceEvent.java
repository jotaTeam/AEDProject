package Controllers.Events;

import java.awt.event.ActionListener;
import Models.IndependencePeriod;
import Service.repositories.IndependencePeriodRepository;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Date;

public class CreatePeriodIndependenceEvent implements ActionListener {

    private JTextField periodIndependenceStartInput;
    private JTextField periodIndependenceEndInput;
    private int perInIdPaisInput;

    public CreatePeriodIndependenceEvent(JTextField periodIndependenceStartInput, JTextField periodIndependenceEndInput, int perInIdPaisInput) {
        this.periodIndependenceStartInput = periodIndependenceStartInput;
        this.periodIndependenceEndInput = periodIndependenceEndInput;
        this.perInIdPaisInput = perInIdPaisInput;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        IndependencePeriod idPeriod = new IndependencePeriod(0, new Date(Date.valueOf(periodIndependenceStartInput.getText()).getTime())
                , new Date(Date.valueOf(periodIndependenceEndInput.getText()).getTime()),perInIdPaisInput);

        IndependencePeriodRepository periodRepository = new IndependencePeriodRepository();

        periodRepository.create(idPeriod);
    }

}
