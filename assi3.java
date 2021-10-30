import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;

public class assi3 {
    public static void main(String args[]){
        String jdbcURL="jdbc:mysql://localhost:3306/sampledb2";
        String username1="";
        String password2="";

        JLabel l1,l2,l3,l4,l5,l6;
        JTextField tf1;
        JPasswordField p1;
        JButton b1,b2;
        JFrame frame=new JFrame("ASSIGNMENT-3");
        frame.setBounds(100,100,600,450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        l6=new JLabel("*Please enter a valid Username!.");
        l6.setBounds(240,90,200,100);
        l6.setVisible(false);
        frame.add(l6);

        l4=new JLabel("LOGIN");
        l4.setFont(new Font("Times New Roman",Font.BOLD,30));
        l4.setBounds(120,5,400,100);
        frame.add(l4);
        l3=new JLabel("*Please enter a valid password!.");
        l3.setBounds(240,140,200,100);
        l3.setVisible(false);
        frame.add(l3);
        l1=new JLabel("USERNAME : ");
        l1.setBounds(120,75,100,100);
        frame.add(l1);
        l2=new JLabel("PASSWORD : ");
        l2.setBounds(120,125,100,100);
        frame.add(l2);
        tf1=new JTextField();
        tf1.setBounds(200,115,150,20);
        frame.add(tf1);
        p1=new JPasswordField();
        p1.setBounds(200,165,150,20);
        p1.setEchoChar('*');
        frame.add(p1);
        b1=new JButton("LOGIN");
        b1.setBounds(150,250,100,50);
        frame.add(b1);
        b2=new JButton("CREATE ACCOUNT");
        b2.setBounds(280,250,200,50);
        frame.add(b2);
        frame.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().toString().isEmpty()||p1.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null,"SAB KUCH BHARDO!!!","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(e.getSource()==b1) {
                    String passwor = p1.getText();
                    String userid=tf1.getText();
                    int i;
                    for (i = 0; i < passwor.length(); i++) {
                        char p2 = passwor.charAt(i);
                        if (p2=='~'||p2=='`'||p2=='!'||p2=='@'||p2=='#'||p2=='$'||p2=='%'||p2=='^'||p2=='&'||p2=='*'||p2=='('||p2==')') {
                            int j;
                            for(j=0;j<userid.length();j++){
                                char m=userid.charAt(j);
                                if (m=='@'||m=='.'){
                                    JOptionPane.showMessageDialog(null,"SUCCESSFULLY LOGED IN","SUCCESS",JOptionPane.INFORMATION_MESSAGE);

                                    try {
                                        JFrame display = new JFrame("DATABASE");
                                        String sql = "SELECT * FROM stdu1";
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "", "");
                                        Statement statement = connection.createStatement();
                                        ResultSet result = statement.executeQuery(sql);
                                        String column[] = {"ID", "FIRSTNAME","MIDDLENAME","LASTNAME","DOB","GENDER","EMAIL","PASSWORD","HOBBIES","LANGUAGES KNOWN","ADDRESS","PINCODE","CITYNAME"};
                                        String data[][] = {{"", "", "","","","","","","","","","",""}};

                                        DefaultTableModel dtm = new DefaultTableModel(data, column);
                                        JTable table = new JTable(dtm);
                                        table.setBounds(200, 100, 200, 300);
                                        table.setVisible(true);
                                        dtm.addRow(column);
                                        while (result.next()) {
                                            String id = result.getString(1);
                                            String firstname = result.getString(2);
                                            String middlename = result.getString(3);
                                            String lastname = result.getString(4);
                                            String dob = result.getString(5);
                                            String gender = result.getString(6);
                                            String email = result.getString(7);
                                            String password = result.getString(8);
                                            String hobbies = result.getString(9);
                                            String languageknown = result.getString(10);
                                            String address = result.getString(11);
                                            String pincode = result.getString(12);
                                            String cityname = result.getString(13);


                                            String newdata[] = {id, firstname,middlename,lastname,dob,gender,email,password,hobbies,languageknown,address,pincode,cityname};

                                            dtm.addRow(newdata);
                                        }
                                        display.add(table);
                                        display.setSize(800, 500);
                                        display.setVisible(true);
                                    } catch (SQLException | ClassNotFoundException throwables) {
                                        throwables.printStackTrace();
                                    }
                                    l6.setVisible(false);
                                    break;
                                }
                                else {
                                    l6.setVisible(true);
                                }
                            }
                            l3.setVisible(false);
                            break;
                        }
                        else{
                            l3.setVisible(true);


                        }
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b2){
                    JFrame frame=new JFrame("REGISTRATION FORM");
                    frame.setLayout(null);

                    Label l1=new Label("Registration Form");
                    l1.setBounds(0,10,850,50);
                    frame.add(l1);

                    Label l2=new Label("First name :");
                    frame.add(l2);
                    l2.setBounds(50,100,100,10);
                    TextField t1=new TextField(15);
                    frame.add(t1);
                    t1.setBounds(150,100,100,20);
                    t1.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyTyped(KeyEvent e) {
                            char keychar=e.getKeyChar();
                            if(Character.isLowerCase(keychar)){
                                e.setKeyChar(Character.toUpperCase(keychar));
                            }
                        }
                    });

                    Label l3=new Label("Middle name :");
                    frame.add(l3);
                    l3.setBounds(280,100,100,10);
                    TextField t2=new TextField(15);
                    frame.add(t2);
                    t2.setBounds(380,100,100,20);
                    t2.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyTyped(KeyEvent e) {
                            char keychar=e.getKeyChar();
                            if(Character.isLowerCase(keychar)){
                                e.setKeyChar(Character.toUpperCase(keychar));
                            }
                        }
                    });
                    Label l4=new Label("Last name :");
                    frame.add(l4);
                    l4.setBounds(500,100,100,10);
                    TextField t3=new TextField(15);
                    frame.add(t3);
                    t3.setBounds(600,100,100,20);
                    t3.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyTyped(KeyEvent e) {
                            char keychar=e.getKeyChar();
                            if(Character.isLowerCase(keychar)){
                                e.setKeyChar(Character.toUpperCase(keychar));
                            }
                        }
                    });
                    Label l12=new Label("Date of Birth :");
                    frame.add(l12);
                    l12.setBounds(50,155,100,10);
                    Label l14=new Label("Date :");
                    frame.add(l14);
                    l14.setBounds(150,155,50,10);
                    Choice ch1=new Choice();
                    ch1.add("1");
                    ch1.add("2");
                    ch1.add("3");
                    ch1.add("4");
                    ch1.add("5");
                    ch1.add("6");
                    ch1.add("7");
                    ch1.add("8");
                    ch1.add("9");
                    ch1.add("10");
                    ch1.add("11");
                    ch1.add("12");
                    ch1.add("13");
                    ch1.add("14");
                    ch1.add("15");
                    ch1.add("16");
                    ch1.add("17");
                    ch1.add("18");
                    ch1.add("19");
                    ch1.add("20");
                    ch1.add("21");
                    ch1.add("22");
                    ch1.add("23");
                    ch1.add("24");
                    ch1.add("25");
                    ch1.add("26");
                    ch1.add("27");
                    ch1.add("28");
                    ch1.add("29");
                    ch1.add("30");
                    ch1.add("31");
                    frame.add(ch1);


                    ch1.setBounds(200,150,100,10);
                    Label l15=new Label("Month :");
                    frame.add(l15);
                    l15.setBounds(320,155,50,10);
                    Choice ch2=new Choice();
                    ch2.add("January");
                    ch2.add("February");
                    ch2.add("March");
                    ch2.add("April");
                    ch2.add("May");
                    ch2.add("June");
                    ch2.add("July");
                    ch2.add("August");
                    ch2.add("September");
                    ch2.add("October");
                    ch2.add("November");
                    ch2.add("December");
                    frame.add(ch2);

                    ch2.setBounds(380,150,100,10);
                    Label l16=new Label("Year :");
                    frame.add(l16);
                    l16.setBounds(500,155,50,10);
                    Choice ch3=new Choice();
                    ch3.add("1998");
                    ch3.add("1999");
                    ch3.add("2000");
                    ch3.add("2001");
                    ch3.add("2002");
                    ch3.add("2003");
                    frame.add(ch3);
                    ch3.setBounds(560,150,100,10);

                    Label l8=new Label("Gender :");
                    frame.add(l8);
                    l8.setBounds(50,200,100,10);
                    CheckboxGroup cbg=new CheckboxGroup();
                    Checkbox c4=new Checkbox("Male",cbg,false);
                    frame.add(c4);
                    c4.setBounds(150,200,100,10);
                    Checkbox c5=new Checkbox("Female",cbg,false);
                    frame.add(c5);
                    c5.setBounds(250,200,100,10);

                    Label l5=new Label("Email ID :");
                    frame. add(l5);
                    l5.setBounds(50,250,100,10);
                    TextField t4=new TextField(15);
                    frame. add(t4);
                    t4.setBounds(150,250,250,20);
                    Label l9=new Label("Password :");
                    frame. add(l9);
                    l9.setBounds(50,300,100,10);
                    TextField t5=new TextField(15);
                    frame.add(t5);
                    t5.setEchoChar('*');
                    t5.setBounds(150,300,150,20);


                    Label l17=new Label("(*password must contains one special character.)");
                    l17.setBounds(370,300,400,20);
                    l17.setFont(new Font("Times New Roman",1,10));
                    l17.setForeground(Color.RED);
                    l17.setVisible(false);
                    frame. add(l17);
                    Label l6=new Label("Hobbies :");
                    frame.add(l6);
                    l6.setBounds(50,355,100,10);
                    Checkbox c1=new Checkbox("Drawing");
                    frame.add(c1);
                    c1.setBounds(150,350,100,20);
                    Checkbox c2=new Checkbox("Coding");
                    frame. add(c2);
                    c2.setBounds(250,350,100,20);
                    Checkbox c3=new Checkbox("Valorant");
                    frame.add(c3);
                    c3.setBounds(350,350,100,20);

                    Label l10=new Label("Languages Known :");
                    frame.add(l10);
                    l10.setBounds(50,400,110,20);
                    Checkbox c6=new Checkbox("English");
                    frame.add(c6);
                    c6.setBounds(180,400,100,20);
                    Checkbox c7=new Checkbox("Gujarati");
                    frame. add(c7);
                    c7.setBounds(280,400,100,20);
                    Checkbox c8=new Checkbox("Hindi");
                    frame.add(c8);
                    c8.setBounds(380,400,100,20);


                    Label l7=new Label("Address :");
                    frame. add(l7);
                    l7.setBounds(50,500,100,10);
                    TextArea a=new TextArea(15,15);
                    frame.add(a);

                    a.setBounds(150,450,400,120);
                    Label l11=new Label("Pincode :");
                    frame.add(l11);
                    l11.setBounds(50,610,100,10);
                    TextField t6=new TextField(15);
                    frame. add(t6);
                    t6.setBounds(150,605,100,20);

                    Label l13=new Label("City Name :");
                    frame.add(l13);
                    l13.setBounds(50,650,100,20);
                    Choice c=new Choice();
                    c.add("Himmatnagar");
                    c.add("Ahmedabad");
                    c.add("Gandhinagar");
                    c.add("Indore");
                    c.add("Chhattisgarh");
                    c.add("Mumbai");
                    c.add("Chennai");
                    c.add("Dehradun");
                    frame. add(c);
                    c.setBounds(150,650,100,10);

                    Button b1=new Button("Submit");
                    frame.add(b1);
                    b1.setBounds(355,720,80,50);
                    b1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String Firstname = t1.getText();
                            String Middlename= t2.getText();
                            String Lastname=t3.getText();
                            String DOB= ch1.getSelectedItem()+"-"+ch2.getSelectedItem()+"-"+ch3.getSelectedItem();
                            String G=cbg.getSelectedCheckbox().getLabel();
                            String Email=t4.getText();
                            String Password=t5.getText();

                            String Address=a.getText();
                            String pin=t6.getText();
                            String City=c.getSelectedItem();
                            String lang=" ";
                            String Hob=" ";
                            if(c1.getState()){
                                Hob=Hob+"Cricket , ";
                            }
                            if(c2.getState()){
                                Hob=Hob+"Coding , ";
                            }
                            if(c3.getState()){
                                Hob=Hob+"Valorant ";
                            }

                            if(c6.getState()){
                                lang=lang+"English, ";
                            }
                            if(c7.getState()){
                                lang=lang+"Gujarati, ";
                            }
                            if(c8.getState()){
                                lang=lang+"Hindi  ";
                            }

                            int i;
                            for(i=0;i<Password.length();i++){
                                char p=Password.charAt(i);
                                if(p=='~'||p=='`'||p=='!'||p=='@'||p=='#'||p=='$'||p=='%'||p=='^'||p=='&'||p=='*'||p=='('||p==')'){
                                    try{
                                        Connection connection= DriverManager.getConnection(jdbcURL,username1,password2);

                                        String sql="INSERT INTO stdu1(firstname,middlename,lastname,dob,gender,email,password,hobbies,languageknown,address,pincode,cityname)"
                                                +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                                        PreparedStatement statement= connection.prepareStatement(sql);
                                        statement.setString(1,Firstname);
                                        statement.setString(2,Middlename);
                                        statement.setString(3,Lastname);
                                        statement.setString(4,DOB);
                                        statement.setString(5,G);
                                        statement.setString(6,Email);
                                        statement.setString(7,Password);
                                        statement.setString(8,Hob);
                                        statement.setString(9,lang);
                                        statement.setString(10,Address);
                                        statement.setString(11,pin);
                                        statement.setString(12,City);

                                        int rows=statement.executeUpdate();
                                        if(rows>0){
                                            System.out.println("A new user has been inserted!.");

                                        }

                                    }catch (SQLException ex){
                                        ex.printStackTrace();
                                    }
                                    l17.setVisible(false);
                                    break;
                                }
                                else {
                                    l17.setVisible(true);
                                }
                            }
                        }
                    });
                    frame.setVisible(true);
                    frame.setSize(1000,800);
                    frame.setResizable(false);
                    }
            }
        });

    }
}