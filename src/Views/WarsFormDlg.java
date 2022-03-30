package Views;

import javax.swing.*;

public class WarsFormDlg extends JDialog {
    private JPanel contentPane;
    private JTextField nameWarInput;
    private JTextField StartDateInput;
    private JTextField EndDateInput;
    private JButton okWarBtn;
    private JButton buttonOK;

    public WarsFormDlg(JFrame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize( 400, 300);
        setResizable(false);
    }

    public JTextField getNameWarInput() {
        return nameWarInput;
    }

    public void setNameWarInput(JTextField nameWarInput) {
        this.nameWarInput = nameWarInput;
    }

    public JTextField getStartDateInput() {
        return StartDateInput;
    }

    public void setStartDateInput(JTextField startDateInput) {
        StartDateInput = startDateInput;
    }

    public JTextField getEndDateInput() {
        return EndDateInput;
    }

    public void setEndDateInput(JTextField endDateInput) {
        EndDateInput = endDateInput;
    }

    public JButton getOkWarBtn() {
        return okWarBtn;
    }

    public void setOkWarBtn(JButton okWarBtn) {
        this.okWarBtn = okWarBtn;
    }

    public JButton getButtonOK() {
        return buttonOK;
    }

    public void setButtonOK(JButton buttonOK) {
        this.buttonOK = buttonOK;
    }
}
