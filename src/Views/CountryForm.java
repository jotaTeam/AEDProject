package Views;

import javax.swing.*;
import java.awt.*;

public class CountryForm extends javax.swing.JDialog {

    private javax.swing.JPanel contentPane;
    private JTextField CountryTextField;
    private JButton okBtn;

    public CountryForm(Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(935, 845);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public JTextField getCountryTextField() {
        return CountryTextField;
    }

    public void setCountryTextField(JTextField countryTextField) {
        CountryTextField = countryTextField;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }
}
