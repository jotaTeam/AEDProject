package Views;

import javax.swing.*;
import java.awt.*;

public class CountryForm extends javax.swing.JDialog {

    private javax.swing.JPanel contentPane;
    private JTextField countryNameInput;
    private JButton okBtn;
    private JTextField countryIdInput;

    public CountryForm(Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(800, 600);
        setResizable(false);

    }

    public JTextField getCountryIdInput() {
        return countryIdInput;
    }

    public void setCountryIdInput(JTextField countryIdInput) {
        this.countryIdInput = countryIdInput;
    }

    public JTextField getCountryNameInput() {
        return countryNameInput;
    }

    public void setCountryNameInput(JTextField countryNameInput) {
        this.countryNameInput = countryNameInput;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }
}
