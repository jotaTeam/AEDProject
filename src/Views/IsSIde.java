package Views;

import javax.swing.*;
import java.awt.*;

public class IsSIde extends JDialog {
    private JPanel contentPane;
    private JTextField isSideStrartInput;
    private JTextField isSideEndInput;
    private JButton okBtn;
    private JButton buttonOK;

    public IsSIde(Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(contentPane);
        setSize(935, 845);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public JTextField getIsSideStrartInput() {
        return isSideStrartInput;
    }

    public void setIsSideStrartInput(JTextField isSideStrartInput) {
        this.isSideStrartInput = isSideStrartInput;
    }

    public JTextField getIsSideEndInput() {
        return isSideEndInput;
    }

    public void setIsSideEndInput(JTextField isSideEndInput) {
        this.isSideEndInput = isSideEndInput;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }
}
