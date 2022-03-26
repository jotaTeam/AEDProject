package Controllers.Events;

import Controllers.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class TableBtnEvent implements ActionListener {

    JComboBox tableCombo;
    Controller controller;

    public TableBtnEvent(JComboBox tableCombo, Controller controller){

        this.tableCombo = tableCombo;
        this.controller = controller;

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        String table = tableCombo.getSelectedItem().toString().toLowerCase(Locale.ROOT);

        controller.startContent(table);



    }
}
