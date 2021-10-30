import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
public class solve extends JFrame implements ListSelectionListener
{

    //frame
    static JFrame f;
    //static JButton startButton;

    //lists
    static JList b,b1,b2;

    //label
    static JLabel l1;


    //main class
    public static void main(String[] args)
    {
        //create a new frame
        f = new JFrame("frame");

        //create a object
        solve s=new solve();

        //create a panel
        JPanel p =new JPanel();

        //create a new label
        JLabel l= new JLabel("select your choice");
        l1= new JLabel();

        //String array to store weekdays
        String font[]= { "CalibriMy ", "Arial", "Candara",
                "Cambria"};

        //create a array for months and year
        String type[]= { "normal ", "bold", "italic",
                "underline"};
        //add month number and year to list
        String size[]= { "8", "10", "12",
                "14"};

        //create lists
        b= new JList(font);
        b1= new JList(type);
        b2= new JList(size);
		/*
		startButton.setBounds(100,50,200,50);
                startButton.setBackground(Color.green);
		startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
		startButton.setFocusable(false);
		//startButton.addActionListener(this);
		f.add(startButton);
                 */
        l1.setText(b.getSelectedValue()+" "+b1.getSelectedValue()
                +" "+b2.getSelectedValue());

        //add item listener
        b.addListSelectionListener(s);
        b1.addListSelectionListener(s);
        b2.addListSelectionListener(s);

        //add list to panel
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l1);



        f.add(p);

        //set the size of frame
        f.setSize(700,600);

        f.show();
    }
    public void valueChanged(ListSelectionEvent e)
    {
        //set the text of the label to the selected value of lists
        l1.setText(b.getSelectedValue()+" "+b1.getSelectedValue()
                +" "+b2.getSelectedValue());



    }


}