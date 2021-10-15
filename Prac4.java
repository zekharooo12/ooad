import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Prac4 {
    Prac4(){
        Frame f=new Frame("PRACTICAL 4");
        Button b1=new Button("LOAD"),b2=new Button("SAVE AS"),b3=new Button("SAVE");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("file operation");
        MenuItem menu1=new MenuItem("READ");
        MenuItem menu2=new MenuItem("SAVE");
        MenuItem menu3=new MenuItem("COPY");
        MenuItem menu4=new MenuItem("DELETE");
        MenuItem menu5=new MenuItem("EXIT");
        menu.add(menu1);
        {
            menu1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.repaint();
                    TextField tf=new TextField();
                    tf.setVisible(true);
                    Label l1 = null;
                    l1=new Label("Enter the address of file:");
                    l1.setBounds(50,50,400,20);
                    tf.setBounds(50,75,400,20);
                    f.add(l1);
                    b1.setBounds(50,125,400,30);
                    f.add(b1);
                    f.add(tf);
                    f.setSize(500,500);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed (ActionEvent e){
                            String location=tf.getText();
                            File file = new File(location);
                            String s;
                            Scanner fs= null;
                            try {
                                fs = new Scanner(file);
                            } catch (FileNotFoundException fileNotFoundException) {
                                fileNotFoundException.printStackTrace();
                            }
                            s=fs.nextLine();
                            TextArea ta=new TextArea();
                            Label l2;
                            l2=new Label("Text in file is:");
                            l2.setBounds(50,225,400,20);
                            f.add(l2);
                            ta.setBounds(50,250,400,400);
                            ta.setText(s);
                            ta.setVisible(true);
                            f.add(ta);
                        }

                    });
                    f.repaint();
                }
            });
        }
        menu.add(menu2);
        {
            menu2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.repaint();
                    TextArea ta=new TextArea();
                    TextField tf=new TextField();
                    Label l1;
                    l1=new Label("Enter the text:");
                    l1.setBounds(50,50,400,20);
                    f.add(l1);
                    ta.setBounds(50,70,400,400);
                    ta.setVisible(true);
                    f.add(ta);
                    b2.setBounds(50,500,400,30);
                    f.add(b2);
                    f.setSize(500,500);
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed (ActionEvent e){
                            Label l2;
                            l2=new Label("Enter the file location:");
                            l2.setBounds(50,530,400,20);
                            f.add(l2);
                            tf.setBounds(50,550,400,20);

                            b3.setBounds(50,600,400,30);
                            f.add(b3);
                            b3.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try {
                                        String loc=tf.getText();
                                        String str=ta.getText();
                                        File file = new File(loc);
                                        file.createNewFile();
                                        FileWriter fw = new FileWriter(loc);
                                        ta.setText(str);
                                        fw.write(str);
                                        fw.close();
                                    } catch (Exception er) {
                                        System.out.println(er);
                                    }

                                }
                            });
                            tf.setVisible(true);
                            ta.setVisible(true);
                            f.add(tf);
                            f.add(ta);
                        }
                    });
                    f.repaint();
                }
            });
        }
        menu.add(menu3);
        {
            menu3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.repaint();
                    f.setSize(500,500);
                    TextField tf=new TextField();
                    TextField tf1=new TextField();
                    Label l1;
                    l1=new Label("Enter the location of source file:");
                    l1.setBounds(50,50,400,20);
                    f.add(l1);
                    tf.setBounds(50,70,400,20);
                    Label l2;
                    l2=new Label("Enter the location of source file:");
                    l2.setBounds(50,100,400,20);
                    f.add(l2);
                    tf1.setBounds(50,120,400,20);
                    f.add(tf1);
                    f.add(tf);
                    Button b=new Button("COPY");
                    f.add(b);
                    b.setBounds(50,145,400,20);
                    b.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                String src,loc,data;
                                src = tf.getText();
                                loc = tf1.getText();
                                File srcfile=new File(src);
                                Scanner fs=new Scanner(srcfile);
                                data=fs.nextLine();
                                File file = new File(loc);
                                file.createNewFile();
                                FileWriter fw = new FileWriter(loc);
                                fw.write(data);
                                fw.close();
                            }
                            catch (Exception er)
                            {
                                System.out.println(er);
                            }
                        }
                    });
                    f.repaint();
                }
            });
        }
        menu.add(menu4);
        {
            menu4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.repaint();
                    TextField tf=new TextField();
                    f.setSize(500,500);
                    tf.setBounds(50,70,400,20);
                    Label l1;
                    l1=new Label("Enter the file location:");
                    l1.setBounds(50,50,400,20);
                    Button b4=new Button("Delete");
                    b4.setBounds(50,95,400,20);
                    f.add(tf);
                    f.add(l1);
                    f.add(b4);
                    b4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String loc;
                            loc=tf.getText();
                            File f=new File(loc);
                            try{
                                f.delete();
                            }
                            catch (Exception er){
                                System.out.println(er);
                            }
                        }
                    });

                }
            });
        }
        menu.add(menu5);
        {
            menu5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new Prac4();
    }
}