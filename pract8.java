import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class pract8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HOME");
        frame.setVisible(true);
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar Mb = new JMenuBar();
        frame.setJMenuBar(Mb);

        JMenu M = new JMenu("MENU");
        Mb.add(M);
        JMenuItem file = new JMenuItem("FILE");
        M.add(file);

        JMenuItem tb = new JMenuItem("TABLES");
        M.add(tb);
        JMenuItem sqptb = new JMenuItem("MY SQL TABLE");
        M.add(sqptb);


        class exitaction implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==file) {
                    JFileChooser filename;

                    JFrame frame2 = new JFrame("FILE");
                    frame2.setBounds(100, 100, 800, 800);


                    Container c = frame2.getContentPane();
                    c.setLayout(null);
                    c.setBackground(Color.cyan);

                    JButton b1 = new JButton("OPEN");
                    b1.setBounds(100, 100, 100, 50);
                    c.add(b1);
                    JButton b2 = new JButton("SAVE");
                    b2.setBounds(200, 100, 100, 50);
                    c.add(b2);
                    JButton b3 = new JButton("CLEAR");
                    b3.setBounds(300, 100, 100, 50);
                    c.add(b3);
                    filename = new JFileChooser("E:\\OOAD PRACTS\\src");

                    JTextArea ta1 = new JTextArea(20, 20);
                    ta1.setBounds(100, 200, 500, 450);
                    c.add(ta1);
                    frame2.setVisible(true);
                    class sevlonbhoi implements ActionListener {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == b1) {
                                try {
                                    int selectedOption = filename.showOpenDialog(null);
                                    if (selectedOption == JFileChooser.APPROVE_OPTION) {
                                        File file = filename.getSelectedFile();
                                        String filepath = file.getPath();
                                        BufferedReader br = new BufferedReader(new FileReader(filepath));
                                        String s = "";
                                        String mydata = "";
                                        while ((s = br.readLine()) != null) {
                                            mydata = mydata + s + "\n";
                                        }
                                        ta1.setText(mydata);


                                    } else {
                                        System.out.println("user cancelled the dialog");
                                    }
                                } catch (Exception ex) {

                                }
                            }

                            if (e.getSource() == b2) {
                                int selectedOption = filename.showSaveDialog(null);
                                if (selectedOption == JFileChooser.APPROVE_OPTION) {
                                    System.out.println("selected file is:" + filename.getSelectedFile().getAbsolutePath());

                                } else {
                                    System.out.println("user cancelled the dialog");
                                }
                            }
                            if (e.getSource() == b3) {
                                ta1.setText("");
                            }
                        }
                    }
                    b1.addActionListener(new sevlonbhoi());
                    b2.addActionListener(new sevlonbhoi());
                    b3.addActionListener(new sevlonbhoi());
                }
                if(e.getSource()==tb){
                        JTable table;
                        JButton b1,b2,b3;
                        JTextField tf1,tf2,tf3;
                        JFrame frame3=new JFrame();
                        frame3.setSize(600,400);
                        frame3.setVisible(true);

                            Object[][] data={{001,"vedant",17},{002,"Shlok",18},{003,"Aarya",20},{004,"YUG",19},{005,"Aagam",18}};
                            String[] columnNames={"Roll No.","Names","Age"};
                            DefaultTableModel model=new DefaultTableModel(data,columnNames);
                            table=new JTable(model);
                            frame3.setLayout(new GridLayout(3,1));

                            JPanel panel=new JPanel();
                            JPanel panel1=new JPanel();
                            frame3.add(new JScrollPane(table));
                            frame3.add(panel1);
                            frame3.add(panel);

                            tf1=new JTextField();
                            tf2=new JTextField();
                            tf3=new JTextField();

                            b1=new JButton("ADD");
                            b2=new JButton("DELETE");
                            b3=new JButton("EDIT");

                            panel1.setLayout(new GridLayout(1,1));
                            JLabel l1=new JLabel("___________________________________!STUDENT DATA!_________________________________________");
                            panel1.add(l1);


                            panel.setLayout(new GridLayout(3,3));
                            panel.add(new JLabel("ROLL.NO"));
                            panel.add(tf1);
                            panel.add(b1);

                            panel.add(new JLabel("NAMES"));
                            panel.add(tf2);
                            panel.add(b2);

                            panel.add(new JLabel("AGE"));
                            panel.add(tf3);
                            panel.add(b3);

                            b1.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if(tf1.getText().toString().isEmpty()||tf2.getText().toString().isEmpty()||tf3.getText().toString().isEmpty()){
                                        JOptionPane.showMessageDialog(null,"Please fill all the fields","ERROR",JOptionPane.ERROR_MESSAGE);

                                    }
                                    else {
                                        int rollno = Integer.parseInt(tf1.getText().toString());
                                        String name = tf2.getText().toString();
                                        int age = Integer.parseInt(tf3.getText().toString());

                                        Object[] newrow = {rollno, name, age};
                                        model.addRow(newrow);
                                        tf1.setText(null);
                                        tf2.setText(null);
                                        tf3.setText(null);
                                    }
                                }
                            });

                            table.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    int rowindex=table.getSelectedRow();
                                    int rollno=(int)model.getValueAt(rowindex,0);
                                    String name=(String) model.getValueAt(rowindex,1);
                                    int age=(int)model.getValueAt(rowindex,2);
                                    tf1.setText(String.valueOf(rollno));
                                    tf2.setText(String.valueOf(name));
                                    tf3.setText(String.valueOf(age));
                                }
                            });
                            b3.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if(tf1.getText().toString().isEmpty()||tf2.getText().toString().isEmpty()||tf3.getText().toString().isEmpty()){
                                        JOptionPane.showMessageDialog(null,"Please fill all the fields","ERROR",JOptionPane.ERROR_MESSAGE);

                                    }
                                    else {
                                        int rollno = Integer.parseInt(tf1.getText().toString());
                                        String name = tf2.getText().toString();
                                        int age = Integer.parseInt(tf3.getText().toString());

                                        int row=table.getSelectedRow();
                                        model.setValueAt(rollno,row,0);
                                        model.setValueAt(name,row,1);
                                        model.setValueAt(age,row,2);
                                        tf1.setText(null);
                                        tf2.setText(null);
                                        tf3.setText(null);
                                    }

                                }
                            });
                            b2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if(table.getSelectedRow()==-1){
                                        JOptionPane.showMessageDialog(null,"Please select a row!.","ERROR",JOptionPane.ERROR_MESSAGE);
                                    }

                                    int selection= JOptionPane.showConfirmDialog(null,"SOCH LO DELETE HO JAEGA!.","CONFIRM",JOptionPane.YES_NO_OPTION);
                                    if(selection==JOptionPane.YES_OPTION){
                                        model.removeRow(table.getSelectedRow());
                                    }
                                }
                            });
                            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }

                if(e.getSource()==sqptb){

                    try{
                        JFrame display =new JFrame("DATABASE");
                        String sql="SELECT * FROM customer";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/aarzz", "root", "Aarya@123");
                        Statement statement=connection.createStatement();
                        ResultSet result=statement.executeQuery(sql);
                        String column[]={"ID","FIRSTNAME","LASTNAME"};
                        String data[][]={{"","",""}};

                        DefaultTableModel dtm=new DefaultTableModel(data,column);
                        JTable table=new JTable(dtm);
                        table.setBounds(200,100,200,300);
                        table.setVisible(true);
                        dtm.addRow(column);
                        while (result.next()) {
                            String id = result.getString("ID");
                            String firstname = result.getString("FIRSTNAME");
                            String lastname = result.getString("LASTNAME");
                            String newdata[] = {id, firstname, lastname};

                            dtm.addRow(newdata);
                        }
                        display.add(table);
                        display.setSize(500,500);
                        display.setVisible(true);
                    }catch (SQLException | ClassNotFoundException throwables){
                        throwables.printStackTrace();

                    }


                }


            }
        }
        file.addActionListener(new exitaction());
        tb.addActionListener(new exitaction());
        sqptb.addActionListener(new exitaction());

    }
}
