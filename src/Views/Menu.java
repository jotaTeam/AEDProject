package Views;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Locale;

public class Menu extends JDialog {
    private JPanel contentPane;
    private JButton tableBtn;
    private JComboBox tableCombo;


    public Menu(Frame parent, boolean modal, List<String> tableName) {

        super(parent, modal);
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setSize(200, 200);
        setResizable(false);

        for(String tname: tableName){

            tableCombo.addItem(tname.toUpperCase(Locale.ROOT));
        }
        setLocationRelativeTo(parent);
    }

    public JButton getTableBtn() {
        return tableBtn;
    }

    public void setTableBtn(JButton tableBtn) {
        this.tableBtn = tableBtn;
    }

    public JComboBox getTableCombo() {
        return tableCombo;
    }

    public void setTableCombo(JComboBox tableCombo) {
        this.tableCombo = tableCombo;
    }
}
