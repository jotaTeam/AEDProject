package Controllers;

import Controllers.Events.AccessBtnEvent;
import Controllers.Events.CreateBtnEvent;
import Controllers.Events.TableBtnEvent;
import Views.Content;
import Views.Home;
import Views.Menu;

import javax.swing.*;

public class EventHandler {

    public static void AddEvent(Home home, Controller controller) {
        JLabel accessBtn = home.getAccessBtn();
        accessBtn.addMouseListener(new AccessBtnEvent(controller));
    }

    public static void AddEvent(Menu menu, Controller controller) {
        JComboBox tableCombo = menu.getTableCombo();
        JButton tableBtn = menu.getTableBtn();
        tableBtn.addActionListener(new TableBtnEvent(tableCombo, controller));
    }

    public static void AddEvent(Content content, Controller controller, String tableName){
        JButton create = content.getCreateBtn();
        JButton update = content.getUpdateBtn();
        JButton delete = content.getDeleteBtn();
        JTable table = content.getContentTable();

        create.addActionListener(new CreateBtnEvent( controller, tableName));
    }

}