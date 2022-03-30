package Controllers.Events;

import Controllers.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBtnEvent implements ActionListener {
    private Controller controller;
    private String tableName;
    private JTable table;

    public DeleteBtnEvent(Controller controller, String tableName, JTable table){

        this.controller = controller;
        this.tableName = tableName;
        this.table = table;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int row = table.getSelectedRow();
        int id = (int)table.getValueAt(row, 0);

        controller.startDelete(tableName, id);
    }
}
