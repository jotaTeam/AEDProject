package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Country extends JFrame {
    private JPanel panel1;
    private JTable countryTable;


    public Country(){
        add(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(935, 845);
        setResizable(false);

        setLocationRelativeTo(null);

        createTable("");
    }

    public void limpiar(){
       /* txtid.setText("");
        txtnombre.setText("");
        txtapellidos.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");*/
    }
    void createTable(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");


        countryTable.setModel(modelo);

        String sql = "SELECT * FROM empleados WHERE CONCAT (nombre, ' ', apellidos) LIKE '%"+valor+"%' ";
        String datos[]=new String[5];
       /* Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);

                modelo.addRow(datos);
            }

            countryTable.setModel(modelo);

        } catch (SQLException e) {
            System.err.println("error al llamar la tabla: " + e);
            JOptionPane.showMessageDialog(null, "Error tabla");
        }*/
        countryTable.setModel(modelo);

    }

}
