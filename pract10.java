import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;

public class pract10 {
    public static void main(String args[]){
        JButton b1,b2,b3,b4;
        JFrame frame=new JFrame("PRACTICLE-10");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel l1=new JLabel("What do you want to do?");
        l1.setBounds(120,25,250,100);
        l1.setFont(new Font("Times New Roman",Font.BOLD, 18));
        l1.setForeground(Color.RED);
        frame.add(l1);

        b1=new JButton("SHOW TABLES");
        b1.setBounds(60,150,150,50);
        b2=new JButton("JOIN");
        b2.setBounds(240,150,100,50);
        b3=new JButton("Aggregate function");
        b3.setBounds(60,250,150,50);
        b4=new JButton(" condition");
        b4.setBounds(240,250,100,50);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ex) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/sampledb","root","Aarya@123");

                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select p10a.fullname,p10b.coursename from sampledb.p10a,sampledb.p10b where p10a.cid=p10b.id");
                    while(rs.next())
                        System.out.println(rs.getString(1)+"  "+rs.getString(2));
                    con.close();
                }catch(Exception e){ System.out.println(e);}
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ef) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/sampledb","root","Aarya@123");

                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select sum(p10a.marks) FROM sampledb.p10a");
                    while(rs.next())
                        System.out.println(rs.getInt(1));
                    con.close();
                }catch(Exception e){ System.out.println(e);}
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ez) {
                //condition
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/sampledb","root","Aarya@123");

                    Statement stmt=con.createStatement();
                    String query = "select p10a.fullname,p10b.coursename from sampledb.p10a,sampledb.p10b where p10a.cid=p10b.id and p10b.coursename="+"\"OOAD\""+ "or p10b.coursename="+"\"DSA\"";
                    ResultSet rs=stmt.executeQuery(query);

                    while(rs.next())
                        System.out.println(rs.getString(1)+"  "+rs.getString(2));
                    con.close();
                }catch(Exception e){ System.out.println(e);}

            }
        });

    }
}


