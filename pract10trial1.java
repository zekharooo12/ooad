import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class pract10trial1 {
    public static void main(String args[]){
        JTable table,table1;
        JFrame frame3=new JFrame();
        frame3.setSize(600,400);
        frame3.setVisible(true);
        try{
            String sql="SELECT * FROM p10a";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "Aarya@123");
            Statement statement=connection.createStatement();
            ResultSet result=statement.executeQuery(sql);
            String column[]={"IDSTUDENT","FULLNAME","MARKS","RANK","CID"};
            String data[][]={{"","","","",""}};

            DefaultTableModel dtm=new DefaultTableModel(data,column);
            table=new JTable(dtm);
            table.setBounds(200,100,200,300);
            table.setVisible(true);
            frame3.add(new JScrollPane(table));
            while (result.next()) {

                String idstudent = result.getString("IDSTUDENT");
                String fullname = result.getString("FULLNAME");
                String marks = result.getString("MARKS");
                String rank = result.getString("RANK");
                String cid = result.getString("CID");

                String newdata[] = {idstudent,fullname,marks,rank,cid};
                dtm.addRow(newdata);

            }

        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();

        }
        frame3.setLayout(new GridLayout(2,1));
        JPanel panel=new JPanel();
        frame3.add(panel);
        try{
            String sql="SELECT * FROM p10b";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "Aarya@123");
        Statement statement=connection.createStatement();
        ResultSet result=statement.executeQuery(sql);
        String column[]={"ID","COURSENAME"};
        String data[][]={{"",""}};

        DefaultTableModel dtm=new DefaultTableModel(data,column);
        table1=new JTable(dtm);
        table1.setBounds(200,100,200,300);
        table1.setVisible(true);
        panel.add(new JScrollPane(table1));
        while (result.next()) {

            String id = result.getString("ID");
            String coursename = result.getString("COURSENAME");


            String newdata[] = {id,coursename};
            dtm.addRow(newdata);

        }

    }catch (SQLException | ClassNotFoundException throwables){
        throwables.printStackTrace();

    }


    }
}
