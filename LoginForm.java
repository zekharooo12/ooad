
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class yourframe extends JFrame implements ActionListener{
    Container c;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    JButton btn1,btn2;

    yourframe(){
        setTitle("login form");
        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        c=getContentPane();
        c.setLayout(null);

        label1=new JLabel("Username:");
        label2=new JLabel("Password:");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        c.add(label1);
        c.add(label2);
        user=new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);
        pass=new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);

        btn1=new JButton("LOGIN");
        btn1.setBounds(125,200,100,25);
        c.add(btn1);
        btn1.addActionListener(this);
        btn2=new JButton("RESET");
        btn2.setBounds(225,200,100,25);
        c.add(btn2);
        btn2.addActionListener(this);
        setVisible(true);

    }

     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == btn1) {
             System.out.println("username:" + user.getText());
             System.out.println("password:" + pass.getText());
         }
         if(e.getSource()==btn2){
             user.setText("");
             pass.setText("");
         }
     }
 }
class LoginForm {
    public static void main(String args[]){
     yourframe frame=new yourframe();
    }
}
//by aarya patel...