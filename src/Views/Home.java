package Views;

import javax.swing.*;

public class Home extends JFrame{
    private JPanel panel1;
    private JLabel accessBtn;


    public Home(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(935, 845);
        setResizable(false);

        setLocationRelativeTo(null);

        add(panel1);

    }

    public JLabel getAccessBtn() {
        return accessBtn;
    }

    public void setAccessBtn(JLabel accessBtn) {
        this.accessBtn = accessBtn;
    }
}
