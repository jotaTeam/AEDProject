package Controllers.Events;

import Models.Wars;
import Service.repositories.WarsRepository;
import Views.WarsFormDlg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class CreateWarEvent implements ActionListener {

    private JTextField name;
    private JTextField startDate;
    private JTextField endDate;
    private WarsFormDlg wfd;

    public CreateWarEvent(JTextField name, JTextField startDate, JTextField endDate, WarsFormDlg wfd) {
        this.name = name;

        this.startDate = startDate;
        this.endDate = endDate;
        this.wfd = wfd;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Wars war = new Wars(0, name.getText(), new Date(Date.valueOf(startDate.getText()).getTime()), new Date(Date.valueOf(endDate.getText()).getTime()));

        WarsRepository wr = new WarsRepository();

        wr.create(war);

        wfd.dispose();
    }
}
