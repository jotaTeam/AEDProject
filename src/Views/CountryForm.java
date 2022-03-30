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
        setSize(800, 600);
        setResizable(false);

    }

    public JTextField getCountryTextField() {
        return CountryTextField;
    }

    public void setCountryTextField(JTextField countryTextField) {
        CountryTextField = countryTextField;
    }
}
