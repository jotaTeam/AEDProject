package Controllers.Events;

import Controllers.Controller;
import Views.CreatePane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBtnEvent implements ActionListener {

    private Controller controller;
    String tableName;

    public UpdateBtnEvent(Controller controller, String tableName){

        this.controller = controller;
        this.tableName = tableName;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CreatePane.create(tableName);
        //controller.startForm(tableName);


    }
}
