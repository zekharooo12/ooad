import java.awt.*;
import java.awt.event.*;
public class Prac3b extends Frame implements KeyListener{
    Label lab;
    TextArea ta;
    Prac3b(){

        lab=new Label();
        lab.setBounds(20,50,100,20);
        ta=new TextArea();
        ta.setBounds(20,80,300, 300);
        ta.addKeyListener(this);

        add(lab);add(ta);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        lab.setText("Key is Pressed");
        setBackground(Color.cyan);
    }
    public void keyReleased(KeyEvent e) {
        lab.setText("Key is Released");
        setBackground(Color.RED);
    }
    public void keyTyped(KeyEvent e) {
        lab.setText("Key Typed");
        setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new Prac3b();
    }
}