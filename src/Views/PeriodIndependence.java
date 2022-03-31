package Views;

import javax.swing.*;
import java.awt.*;

public class PeriodIndependence extends JDialog {
    private JPanel contentPane;
    private JTextField periodIndependenceStartInput;
    private JTextField periodIndependenceEndInput;
    private JButton okBtn;
    private JTextField perInIdPaisInput;

    public PeriodIndependence(Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(935, 845);
        setResizable(false);
        setLocationRelativeTo(null);


    }

    public JTextField getPeriodIndependenceStartInput() {
        return periodIndependenceStartInput;
    }

    public void setPeriodIndependenceStartInput(JTextField periodIndependenceStartInput) {
        this.periodIndependenceStartInput = periodIndependenceStartInput;
    }

    public JTextField getPeriodIndependenceEndInput() {
        return periodIndependenceEndInput;
    }

    public void setPeriodIndependenceEndInput(JTextField periodIndependenceEndInput) {
        this.periodIndependenceEndInput = periodIndependenceEndInput;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public JTextField getPerInIdPaisInput() {
        return perInIdPaisInput;
    }

    public void setPerInIdPaisInput(JTextField perInIdPaisInput) {
        this.perInIdPaisInput = perInIdPaisInput;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }
}
