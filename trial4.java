import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class trial4 {
    public static void main(String args[]) {

        JFrame frame4=new JFrame("mysqldb");
        frame4.setBounds(100,100,600,600);
        frame4.setVisible(true);
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn=new JButton("show Data");
        btn.setBounds(50,50,100,50);
        frame4.add(btn);


    }
}
