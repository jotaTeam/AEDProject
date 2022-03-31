package Controllers.Events;

import Models.Wars;
import Service.repositories.WarsRepository;
import Views.WarsFormDlg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class UpdateWarEvent implements ActionListener {

    private JTextField name;
    private JTextField startDate;
    private JTextField endDate;
    private int id;
    private WarsFormDlg wfd;

    public UpdateWarEvent(JTextField name, JTextField startDate, JTextField endDate, int id, WarsFormDlg wfd) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.wfd = wfd;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Wars war = new Wars(id, name.getText(), new Date(Date.valueOf(startDate.getText()).getTime()), new Date(Date.valueOf(endDate.getText()).getTime()));

        WarsRepository wr = new WarsRepository();

        wr.update(war);

        wfd.dispose();

    }
}
