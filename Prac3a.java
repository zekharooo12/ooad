import java.awt.*;
import java.awt.event.*;
public class Prac3a extends Frame implements MouseListener{
    Label lab;
    Prac3a() {
        addMouseListener(this);
        lab = new Label();
        lab.setBounds(20, 50, 100, 20);
        add(lab);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked (MouseEvent e){
        lab.setText("Mouse Clicked");
    }
    public void mouseEntered (MouseEvent e){
        lab.setText("Mouse Entered");
    }
    public void mouseExited (MouseEvent e){
        lab.setText("Mouse Exited");
    }
    public void mousePressed (MouseEvent e){
        lab.setText("Mouse Pressed");
    }
    public void mouseReleased (MouseEvent e){
        lab.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new Prac3a();
    }
}