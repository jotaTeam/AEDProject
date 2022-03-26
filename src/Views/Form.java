package Views;

import javax.swing.*;
import java.awt.*;

public class Form extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;


    public Form(Frame parent, Boolean modal) {

        super(parent, modal);
        setContentPane(contentPane);

        setSize(500, 500);




    }

    @Override
    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }
}
