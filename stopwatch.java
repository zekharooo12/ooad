import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class stpwtch implements ActionListener {

    JFrame frame=new JFrame();
    JButton bt1=new JButton("START");
    JButton bt2=new JButton("RESET");
    JLabel timeLabel=new JLabel();
    int eTime=0;
    int sec=0;
    int min=0;
    int hrs=0;
    boolean started=false;
    String sec_string=String.format("%02d",sec);
    String min_string=String.format("%02d",min);
    String hrs_string=String.format("%02d",hrs);
    Timer timer=new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            eTime+=1000;
            hrs=(eTime/3600000);
            min=(eTime/60000)%60;
            sec=(eTime/1000)%60;
             sec_string=String.format("%02d",sec);
             min_string=String.format("%02d",min);
             hrs_string=String.format("%02d",hrs);
            timeLabel.setText(hrs_string+":"+min_string+":"+sec_string);
        }
    });

    stpwtch(){
        timeLabel.setText(hrs_string+":"+min_string+":"+sec_string);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        bt1.setBounds(100,200,100,50);
        bt1.setFont(new Font("Ink Free",Font.PLAIN,20));
        bt1.setFocusable(false);
        bt1.addActionListener(this);

        bt2.setBounds(200,200,100,50);
        bt2.setFont(new Font("Ink Free",Font.PLAIN,20));
        bt2.setFocusable(false);
        bt2.addActionListener(this);

        frame.add(bt1);
        frame.add(bt2);
        frame.add(timeLabel);
        frame.setTitle("STOPWATCH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            if(!started){
                started=true;
                bt1.setText("STOP");
                start();
            }
            else {
                started=false;
                bt1.setText("START");
                stop();
            }
        }
        if(e.getSource()==bt2){
            started=false;
            bt1.setText("START");
            reset();
        }

    }
    void start(){
        timer.start();

    }
    void stop(){
        timer.stop();

    }
    void reset(){
        timer.stop();
        eTime=0;
        sec=0;
        min=0;
        hrs=0;
         sec_string=String.format("%02d",sec);
         min_string=String.format("%02d",min);
         hrs_string=String.format("%02d",hrs);
        timeLabel.setText(hrs_string+":"+min_string+":"+sec_string);

    }

}
 class stopwatch{
    public static void main(String[] args) {
        stpwtch Stopwatch=new stpwtch();
    }
}

