import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class trial {
    public static void main(String[] args){
        JFileChooser filename;

        JFrame frame2=new JFrame("FILE");
        frame2.setBounds(100,100,800,800);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame2.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        JButton b1=new JButton("OPEN");
        b1.setBounds(100,100,100,50);
        c.add(b1);
        JButton b2=new JButton("SAVE");
        b2.setBounds(200,100,100,50);
        c.add(b2);
        JButton b3=new JButton("CLEAR");
        b3.setBounds(300,100,100,50);
        c.add(b3);
        filename=new JFileChooser("E:\\OOAD PRACTS\\src");

        JTextArea ta1=new JTextArea(20,20);
        ta1.setBounds(100,200,500,450);
        c.add(ta1);
        frame2.setVisible(true);
        class sevlonbhoi implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b1) {
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
}catch (Exception ex){

}
                }

                if(e.getSource()==b2) {
                    int selectedOption = filename.showSaveDialog(null);
                    if (selectedOption == JFileChooser.APPROVE_OPTION) {
                        System.out.println("selected file is:" + filename.getSelectedFile().getAbsolutePath());

                    } else {
                        System.out.println("user cancelled the dialog");
                    }
                }
                if(e.getSource()==b3){
                    ta1.setText("");
                }
                }
        }
        b1.addActionListener(new sevlonbhoi());
        b2.addActionListener(new sevlonbhoi());
        b3.addActionListener(new sevlonbhoi());

    }
}
