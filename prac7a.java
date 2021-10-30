import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class prac7a implements ActionListener
{
    JFrame frame;
    JButton submit;
    JList<String> fontStyle_List, fontName_List,fontSize_List;
    JTextField textfield;
    JLabel l1,l2,l3,l4,j_error,input,output , display;
    String inputFontName = "";
    String inputFontStyle;
    int inputFontStyleNumber;
    int inputFontSize;
    public prac7a()
    {
        frame = new JFrame();
        JLabel l1 = new JLabel("< Font Name >");
        l1.setBounds(40, 50,120, 20);
        l1.setFont(new Font("Times New Roman",1,17));
        l1.setForeground(Color.BLUE);
        frame.add(l1);
        JLabel l2 = new JLabel("< Font Size >");
        l2.setBounds(332, 50, 120, 20);
        l2.setFont(new Font("Times New Roman",1,17));
        l2.setForeground(Color.BLUE);
        frame.add(l2);
        JLabel l3 = new JLabel("< Font Style >");
        l3.setBounds(195, 50, 120, 20);
        l3.setFont(new Font("Times New Roman",1,17));
        l3.setForeground(Color.BLUE);
        frame.add(l3);
// Error message
        j_error = new JLabel("Select one option");
        j_error.setFont(new Font("Times New Roman",Font.PLAIN, 13));
        j_error.setForeground(Color.BLUE);
        j_error.setVisible(false);
        frame.add(j_error);
        input = new JLabel("Enter Text Here :");
        input.setBounds(450, 50, 200, 20);
// input.setBounds(170, 270, 200, 20);
// textfield.setBounds(30, 300, 400, 25);
        input.setFont(new Font("Times New Roman",1,18));
        frame.add(input);
// Text Field
        textfield = new JTextField("");
        textfield.setBounds(450, 80, 400, 25);
        frame.add(textfield);
// Submit Button
        submit = new JButton("SUBMIT");
        submit.setBounds(605, 130, 100, 30);
        submit.setFont(new Font("SansSerif",1,14));
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLUE);
        submit.setFocusPainted(false);
        frame.add(submit);
        submit.addActionListener(this);
        output = new JLabel("OUTPUT :");
        output.setBounds(450, 200, 100, 30);
        output.setFont(new Font("Times New Roman",1,18));
        frame.add(output);
// Display output
        display = new JLabel();
        display.setBounds(600, 200, 400, 40);
        frame.add(display);
// Font Name
        DefaultListModel<String> fontName = new DefaultListModel<>();
        fontName.addElement("Bell MT");
        fontName.addElement("Broadway");
        fontName.addElement("Comic Sans MS");
        fontName.addElement("Impact");
        fontName.addElement("Rockwell");
        fontName.addElement("Verdana");
        fontName_List = new JList<>(fontName);
        fontName_List.setBounds(30, 90, 132, 138);
        fontName_List.setFont(new Font("Calibri", Font.PLAIN, 17));
        frame.add(fontName_List);
// Font Style
        DefaultListModel<String> fontStyle = new DefaultListModel<>();
        fontStyle.addElement("NORMAL");
        fontStyle.addElement("BOLD");
        fontStyle.addElement("ITALIC");
        fontStyle.addElement("BOLD | ITALIC");
        fontStyle_List = new JList<>(fontStyle);
        fontStyle_List.setBounds(182, 90, 132, 92);
        fontStyle_List.setFont(new Font("Calibri", Font.PLAIN, 17));
        frame.add(fontStyle_List);
// Font Size
        DefaultListModel<String> fontSize = new DefaultListModel<>();
        fontSize.addElement("08");
        fontSize.addElement("09");
        fontSize.addElement("10");
        fontSize.addElement("11");
        fontSize.addElement("12");
        fontSize.addElement("14");
        fontSize_List = new JList<>(fontSize);
        fontSize_List.setBounds(345, 90, 70, 138);
        fontSize_List.setFont(new Font("Calibri", Font.PLAIN, 17));
        frame.add(fontSize_List);
        frame.setSize(1000, 550);
        frame.setLocation(500, 150);
        frame.setTitle("Text Editor");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(241,245,251));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l4=new JLabel("20bcm003 Aarya Patel");
        l4.setBounds(400,400,200,50);
        frame.add(l4);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String data = "";
        if (ae.getSource() == submit)
        {
            data = textfield.getText();
            if (fontName_List.getSelectedIndex() != -1 &&
                    fontSize_List.getSelectedIndex() != -1 && fontStyle_List.getSelectedIndex() !=
                    -1)
            {
                j_error.setVisible(false);
                inputFontName = fontName_List.getSelectedValue();
                inputFontStyle = fontStyle_List.getSelectedValue();
                if (inputFontStyle.equals("NORMAL"))
                {
                    inputFontStyleNumber = 0;
                }
                else if (inputFontStyle.equals("BOLD"))
                {
                    inputFontStyleNumber = 1;
                }
                else if (inputFontStyle.equals("ITALIC"))
                {
                    inputFontStyleNumber = 2;
                }
                else if (inputFontStyle.equals("BOLD | ITALIC"))
                {
                    inputFontStyleNumber = 1|2;
                }
                inputFontSize =
                        Integer.parseInt(fontSize_List.getSelectedValue());
            }
            else
            {
                if (fontName_List.getSelectedIndex() == -1)
                {
                    j_error.setVisible(true);
                    j_error.setBounds(45, 225, 100, 30);
                }
                if (fontStyle_List.getSelectedIndex() == -1)
                {
                    j_error.setVisible(true);
                    j_error.setBounds(197, 180, 100, 30);
                }
                if (fontSize_List.getSelectedIndex() == -1)
                {
                    j_error.setVisible(true);
                    j_error.setBounds(335, 225, 100, 30);
                }
            }
        }
        Font inputFont = new Font(inputFontName, inputFontStyleNumber,
                inputFontSize);
        display.setFont(inputFont);
        display.setText(data);
    }
    public static void main(String[] args)
    {
        new prac7a();
    }
}