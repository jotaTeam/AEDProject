package Views;

import javax.swing.*;
import java.awt.*;

public class SidesForm extends JDialog {
    private JPanel contentPane;
    private JTextField sidesInput;
    private JTextField sidesIsWinnerInput;
    private JButton okBtn;

    public SidesForm(Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(800, 600);
        setResizable(false);

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
}
