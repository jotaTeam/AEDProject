package Controllers.Events;

import Controllers.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBtnEvent implements ActionListener {

    private Controller controller;
    private String tableName;
    private JTable table;

    public UpdateBtnEvent(Controller controller, String tableName, JTable table){

        this.controller = controller;
        this.tableName = tableName;
        this.table = table;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
//        CreatePane.create(tableName);
        //controller.startForm(tableName);

        int row = table.getSelectedRow();
        int id = (int)table.getValueAt(row, 0);

        controller.startForm(tableName, id);





    }
}
