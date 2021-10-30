import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;


public class trial2 {
    public static void main(String[] args){
        String jdbcURL="jdbc:mysql://localhost:3306/sampledb";
        String username1="root";
        String password2="Aarya@123";
        JButton b1,b2,b3;
        JTextField tf1,tf2,tf3;
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();



        JTable table;

        JFrame frame3=new JFrame();
        frame3.setSize(600,400);
        frame3.setVisible(true);


        try{
            String sql="SELECT * FROM user1";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "Aarya@123");
            Statement statement=connection.createStatement();
            ResultSet result=statement.executeQuery(sql);
            String column[]={"USERID","USERNAME","PASSWORD","EMAIL"};
            String data[][]={{"","","",""}};

            DefaultTableModel dtm=new DefaultTableModel(data,column);
            table=new JTable(dtm);
            table.setBounds(200,100,200,300);
            table.setVisible(true);
            frame3.add(new JScrollPane(table));
            while (result.next()) {
                String user_id = result.getString(1);
                String username = result.getString("USERNAME");
                String password = result.getString("PASSWORD");

                String email = result.getString("EMAIL");

                String newdata[] = {user_id,username,password,email};

                dtm.addRow(newdata);

            }

        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();

        }
        frame3.setLayout(new GridLayout(3,1));

        JPanel panel=new JPanel();
        JPanel panel1=new JPanel();
        frame3.add(panel1);
        frame3.add(panel);

        b1=new JButton("ADD");
        b2=new JButton("DELETE");
        b3=new JButton("EDIT");

        panel1.setLayout(new GridLayout(1,1));
        JLabel l1=new JLabel("___________________________________!STUDENT DATA!_________________________________________");
        panel1.add(l1);


        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("USERNAME"));
        panel.add(tf1);
        panel.add(b1);

        panel.add(new JLabel("PASSWORD"));
        panel.add(tf2);
        panel.add(b2);

        panel.add(new JLabel("EMAIL"));
        panel.add(tf3);
        panel.add(b3);





        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String us=tf1.getText();
                String pwd=tf2.getText();
                String em=tf3.getText();


                if(tf1.getText().toString().isEmpty()||tf2.getText().toString().isEmpty()||tf3.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill all the fields","ERROR",JOptionPane.ERROR_MESSAGE);

                }
                else {
                    try{
                        Connection connection= DriverManager.getConnection(jdbcURL,username1,password2);

                        String sql="INSERT INTO user1(username,password,email)"
                                +"VALUES(?,?,?)";
                       PreparedStatement statement= connection.prepareStatement(sql);
                       statement.setString(1,us);
                       statement.setString(2,pwd);
                        statement.setString(3,em);


                        int rows=statement.executeUpdate();
                        if(rows>0){
                            System.out.println("A new user has been inserted!.");
                            tf1.setText(null);
                            tf2.setText(null);
                            tf3.setText(null);
                        }

                    }catch (SQLException ex){
                        ex.printStackTrace();
                    }

                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String us1=tf1.getText();
                String pwd1=tf2.getText();
                String em1=tf3.getText();

                if(tf1.getText().toString().isEmpty()||tf2.getText().toString().isEmpty()||tf3.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill all the fields","ERROR",JOptionPane.ERROR_MESSAGE);

                }
                else {
                    try {
                        Connection connection=DriverManager.getConnection(jdbcURL,username1,password2);
                        String sql1="UPDATE user1 SET password=?,email=? WHERE username=?";
                        PreparedStatement statement1=connection.prepareStatement(sql1);
                        statement1.setString(1,pwd1);
                        statement1.setString(2,em1);
                        statement1.setString(3,us1);


                        int rows=statement1.executeUpdate();
                        if(rows>0){
                            System.out.println("THE USERS INFO IS UPDATED!.");
                        }

                    }catch (SQLException ex2){
                        ex2.printStackTrace();
                    }
                }

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String us2=tf1.getText();


                    try {
                        Connection connection=DriverManager.getConnection(jdbcURL,username1,password2);
                        String sql1="DELETE FROM user1 WHERE username=?";
                        PreparedStatement statement1=connection.prepareStatement(sql1);
                        statement1.setString(1,us2);


                        int rows=statement1.executeUpdate();
                        if(rows>0){
                            System.out.println("THE USERS INFO IS DELETED!.");
                        }

                    }catch (SQLException ex2){
                        ex2.printStackTrace();
                    }



                }



        });



    }
}
