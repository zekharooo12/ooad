import java.awt.*;
import java.awt.event.*;
import java.awt.CheckboxGroup;
import java.lang.String;


class regform extends Frame {

    regform()
    {
        setLayout(null);
        Color bg=new Color(135,206,235);
        setBackground(bg);

        //gui code
        Label l1=new Label("Registration Form");
        add(l1);
        l1.setBounds(350,50,100,50);

        Label l2=new Label("First name :");
        add(l2);
        l2.setBounds(50,100,100,10);
        TextField t1=new TextField(15);
        add(t1);
        t1.setBounds(150,100,100,20);

        Label l3=new Label("Middle name :");
        add(l3);
        l3.setBounds(280,100,100,10);
        TextField t2=new TextField(15);
        add(t2);

        t2.setBounds(380,100,100,20);

        Label l4=new Label("Last name :");
        add(l4);
        l4.setBounds(500,100,100,10);
        TextField t3=new TextField(15);
        add(t3);

        t3.setBounds(600,100,100,20);


        Label l12=new Label("Date of Birth :");
        add(l12);
        l12.setBounds(50,155,100,10);
        Label l14=new Label("Date :");
        add(l14);
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
        add(ch1);

        ch1.setBounds(200,150,100,10);
        Label l15=new Label("Month :");
        add(l15);
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
        add(ch2);

        ch2.setBounds(380,150,100,10);
        Label l16=new Label("Year :");
        add(l16);
        l16.setBounds(500,155,50,10);
        Choice ch3=new Choice();
        ch3.add("1998");
        ch3.add("1999");
        ch3.add("2000");
        ch3.add("2001");
        ch3.add("2002");
        ch3.add("2003");
        add(ch3);
        ch3.setBounds(560,150,100,10);

         Label l8=new Label("Gender :");
        add(l8);
        l8.setBounds(50,200,100,10);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox c4=new Checkbox("Male",cbg,false);
        add(c4);
        c4.setBounds(150,200,100,10);
        Checkbox c5=new Checkbox("Female",cbg,false);
        add(c5);
        c5.setBounds(250,200,100,10);

        Label l5=new Label("Email ID :");
        add(l5);
        l5.setBounds(50,250,100,10);
        TextField t4=new TextField(15);
        add(t4);
        t4.setBounds(150,250,250,20);
        Label l9=new Label("Password :");
        add(l9);
        l9.setBounds(50,300,100,10);
        TextField t5=new TextField(15);
        add(t5);
        t5.setEchoChar('*');
        t5.setBounds(150,300,150,20);


        Label l17=new Label("(password contains one special character and atleast 8 character needed!.)");
        add(l17);
        l17.setBounds(370,300,400,20);
        Label l6=new Label("Hobbies :");
        add(l6);
        l6.setBounds(50,355,100,10);
        Checkbox c1=new Checkbox("cricket");
        add(c1);
        c1.setBounds(150,350,100,20);
        Checkbox c2=new Checkbox("Coding");
        add(c2);
        c2.setBounds(250,350,100,20);
        Checkbox c3=new Checkbox("Valorant");
        add(c3);
        c3.setBounds(350,350,100,20);

        Label l10=new Label("Languages Known :");
        add(l10);
        l10.setBounds(50,400,110,20);
        Checkbox c6=new Checkbox("English");
        add(c6);
        c6.setBounds(180,400,100,20);
        Checkbox c7=new Checkbox("Gujarati");
        add(c7);
        c7.setBounds(280,400,100,20);
        Checkbox c8=new Checkbox("Hindi");
        add(c8);
        c8.setBounds(380,400,100,20);


        Label l7=new Label("Address :");
        add(l7);
        l7.setBounds(50,500,100,10);
        TextArea a=new TextArea(15,15);
        add(a);

        a.setBounds(150,450,400,120);
        Label l11=new Label("Pincode :");
        add(l11);
        l11.setBounds(50,610,100,10);
        TextField t6=new TextField(15);
        add(t6);
        t6.setBounds(150,605,100,20);

        Label l13=new Label("City Name :");
        add(l13);
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
        add(c);
        c.setBounds(150,650,100,10);
        Label l19=new Label("Screen");
        add(l19);
        l19.setBounds(1100,50,100,50);

        TextArea a2=new TextArea(15,15);
        add(a2);
        a2.setBounds(850,100,550,600);

        Button b1=new Button("Submit");
        add(b1);
        b1.setForeground(Color.black);
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
                    Hob=Hob+"Cricket  ";
                }
                if(c2.getState()){
                    Hob=Hob+"Coding  ";
                }
                if(c3.getState()){
                    Hob=Hob+"Valorant  ";
                }

                if(c6.getState()){
                   lang=lang+"English  ";
                }
                if(c7.getState()){
                   lang=lang+"Gujarati  ";
                }
                if(c8.getState()){
                  lang=lang+"Hindi  ";
                }

                int i;
                for(i=0;i<Password.length();i++){
                    char p=Password.charAt(i);
                    if(p=='~'||p=='`'||p=='!'||p=='@'||p=='#'||p=='$'||p=='%'||p=='^'||p=='&'||p=='*'||p=='('||p==')'){
                        a2.setText("First Name:"+Firstname.toUpperCase()+"\n\n"+"Middle name:"+Middlename.toUpperCase()+"\n\n"+"Last Name:"+Lastname.toUpperCase()+"\n\n"+"Date of Birth:"+DOB+"\n\n"+"Gender:"+G+"\n\n"+"Email:"+Email+"\n\n"+"Password:"+Password+"\n\n"+"Hobbies:"+Hob+"\n\n"+"Languages:"+lang+"\n\n"+"Address:"+Address+"\n\n"+"Pincode:"+pin+"\n\n"+"City:"+City+"\n\n");
                        break;
                    }

                }
            }

        });
        //closing frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        // control frame
        setVisible(true);
        setSize(1500,800);
        setTitle("Registration Form");
        setResizable(false);
    }

    public static void main(String[] args)
    {
        regform r=new regform();
    }


}
