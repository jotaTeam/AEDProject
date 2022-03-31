package Controllers;

import Controllers.Events.*;
import Views.*;

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
        update.addActionListener(new UpdateBtnEvent(controller, tableName, table));
        delete.addActionListener(new DeleteBtnEvent(controller, tableName, table));
    }

    public static void AddEvent(WarsFormDlg wfd){

        JTextField name = wfd.getNameWarInput();
        JTextField startDate = wfd.getStartDateInput();
        JTextField endDate = wfd.getEndDateInput();
        JButton okBtn = wfd.getOkWarBtn();

        okBtn.addActionListener(new CreateWarEvent(name, startDate, endDate));

    }

        public static void AddEvent(WarsFormDlg wfd, int id){

        JTextField name = wfd.getNameWarInput();
        JTextField startDate = wfd.getStartDateInput();
        JTextField endDate = wfd.getEndDateInput();
        JButton okBtn = wfd.getOkWarBtn();

        okBtn.addActionListener(new UpdateWarEvent(name, startDate, endDate, id));

    }

    public static void AddEvent(CountryForm countryF){

        JTextField name = countryF.getCountryNameInput();
        JButton okBtn = countryF.getOkBtn();

        okBtn.addActionListener(new CreateCountryEvent(name));

    }

    public static void AddEvent(CountryForm countryF, int id){

        JTextField name = countryF.getCountryNameInput();
        JButton okBtn = countryF.getOkBtn();

        okBtn.addActionListener(new UpdateCountryEvent(name, id));

    }

    public static void AddEvent(SidesForm sidesF, int isWinner,int idWar){

        JTextField name = sidesF.getSidesInput();
        JButton okBtn = sidesF.getOkBtn();

        okBtn.addActionListener(new CreateSidesEvent(name,isWinner,idWar));

    }

    public static void AddEvent(SidesForm sidesF, int id, int isWinner, int idWar){

        JTextField name = sidesF.getSidesInput();
        JButton okBtn = sidesF.getOkBtn();

        okBtn.addActionListener(new CreateSidesEvent(name, id,idWar));

    }
}
