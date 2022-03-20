package Views;

import javax.swing.*;

public class Home extends JFrame{
    private JPanel panel1;
    private JLabel boton;


    public Home(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  setUndecorated(true);
        setSize(945, 835);
        // setResizable(false);
        setLocationRelativeTo(null);
        add(panel1);

    }


}