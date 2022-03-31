package Views;

import javax.swing.*;

public class SidesForm extends JDialog {
    private JPanel contentPane;
    private JButton okBtn;
    private JTextField sidesInput;
    private JTextField sidesIsWinnerInput;
    private JTextField sidesIdWarInput;

    public SidesForm(JFrame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(935, 845);
        setResizable(false);
        setLocationRelativeTo(null);

    }


    public JButton getOkBtn() {
        return okBtn;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }

    public JTextField getSidesInput() {
        return sidesInput;
    }

    public void setSidesInput(JTextField sidesInput) {
        this.sidesInput = sidesInput;
    }

    public JTextField getSidesIsWinnerInput() {
        return sidesIsWinnerInput;
    }

    public void setSidesIsWinnerInput(JTextField sidesIsWinnerInput) {
        this.sidesIsWinnerInput = sidesIsWinnerInput;
    }

    public JTextField getSidesIdWarInput() {
        return sidesIdWarInput;
    }

    public void setSidesIdWarInput(JTextField sidesIdWarInput) {
        this.sidesIdWarInput = sidesIdWarInput;
    }
}
