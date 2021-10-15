import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe extends JFrame implements ActionListener{
   private Container c;
   private JLabel label1,label2;
   private JTextField t1,t2;
   private JButton add,sub,mult,div;
   private JLabel result;
    myframe() {
       setTitle("simple calculator");
       setSize(300,300);
       setLocation(100,100);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       c=getContentPane();
               c.setLayout(null);

       label1=new JLabel("first number:");
       label1.setBounds(10,20,100,20);
       c.add(label1);

       t1=new JTextField();
       t1.setBounds(120,20,100,20);
       c.add(t1);


        label2=new JLabel("second number:");
        label2.setBounds(10,50,100,20);
        c.add(label2);

        t2=new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add=new JButton("+");
        add.setBounds(10,80,50,30);
        c.add(add);

        sub=new JButton("-");
        sub.setBounds(70,80,50,30);
        c.add(sub);

        mult=new JButton("X");
        mult.setBounds(130,80,50,30);
        c.add(mult);

        div=new JButton("/");
        div.setBounds(190,80,50,30);
        c.add(div);

        result =new JLabel("Result:");
        result.setBounds(10,120,150,20);
        c.add(result);


        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);


        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == add) {
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float c = a + b;
                result.setText("Result:" + c);
            }
            if (e.getSource() == sub) {
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float c = a - b;
                result.setText("Result:" + c);
            }
            if (e.getSource() == mult) {
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float c = a * b;
                result.setText("Result:" + c);
            }
            if (e.getSource() == div) {
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float c = a / b;
                result.setText("Result:" + c);
            }
        }
        catch (NumberFormatException e1){
            result.setText("please input numbers only");

        }
    }
}
class simplecalci{
    public static void main(String args[]){
        myframe frame=new myframe();
    }

}
//by Ap20bcm003