package Views;

import javax.swing.*;
import java.awt.*;

public class Content extends JDialog {
    private JPanel contentPane;
    private JTable contentTable;
    private JButton createBtn;
    private JButton deleteBtn;
    private JButton updateBtn;

    public Content(Frame parent, boolean modal) {

        super(parent, modal);
        setContentPane(contentPane);
        setSize(800, 600);
        setResizable(false);

    }

    public JTable getContentTable() {
        return contentTable;
    }

    public void setContentTable(JTable contentTable) {
        this.contentTable = contentTable;
    }

    public JButton getCreateBtn() {
        return createBtn;
    }

    public void setCreateBtn(JButton createBtn) {
        this.createBtn = createBtn;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(JButton deleteBtn) {
        this.deleteBtn = deleteBtn;
    }

    public JButton getUpdateBtn() {
        return updateBtn;
    }

    public void setUpdateBtn(JButton updateBtn) {
        this.updateBtn = updateBtn;
    }
}
