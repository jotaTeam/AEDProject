package Views;

import javax.swing.*;
import java.awt.*;

public class Content extends JDialog {
    private JPanel contentPane;
    private JTable contentTable;

    public Content(Frame parent, boolean modal) {

        super(parent, modal);
        setContentPane(contentPane);
        setSize(800, 600);
        setResizable(false);

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
    }

    public JTable getContentTable() {
        return contentTable;
    }

    public void setContentTable(JTable contentTable) {
        this.contentTable = contentTable;
    }
}
