import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pract5b extends JFrame implements ItemListener
{
    int r=0,g=0,b=0;
    JCheckBox red,green,blue;
    JPanel P = new JPanel();
    JPanel cpanel = new JPanel();
    Container pane = getContentPane();


    pract5b (String cd){
        super(cd);
        red = new JCheckBox("red");
        red.addItemListener(this);

        green = new JCheckBox("green");
        green.addItemListener(this);

        blue = new JCheckBox("blue");
        blue.setSelected(true);
        blue.addItemListener(this);

        cpanel.add(red);
        cpanel.add(green);
        cpanel.add(blue);

        getContentPane().add(cpanel,"North");
        setSize(400,400);
        setVisible(true);

        getContentPane().add(P);
        P.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        pract5b cd = new pract5b("Color Check Box");
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void itemStateChanged(ItemEvent ie){

        if(ie.getItem() == red)
            if(red.isSelected()) r=255; else r=0;
        if(ie.getItem() == green)
            if(green.isSelected()) g=255; else g=0;
        if(ie.getItem() == blue)
            if(blue.isSelected()) b=255; else b=0;

        P.setBackground(new Color(r,g,b));

    }

}