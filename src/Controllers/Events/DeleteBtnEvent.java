package Controllers.Events;

import Controllers.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBtnEvent implements ActionListener {
    private Controller controller;
    String tableName;

    public DeleteBtnEvent(Controller controller, String tableName){

        this.controller = controller;
        this.tableName = tableName;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
