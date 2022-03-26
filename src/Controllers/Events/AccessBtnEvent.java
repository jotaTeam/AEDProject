package Controllers.Events;

import Controllers.Controller;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccessBtnEvent extends MouseAdapter {

    private Controller controller;

    public AccessBtnEvent(Controller controller){

        this.controller = controller;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        controller.startMenu();
    }
}
