package odev5toplar;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class toplar extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    static int x,y,a,hizx,hizy,hiza,x2,y2,a2,hizx2,hizy2,hiza2,x3,y3,a3,hizx3,hizy3,hiza3;
    Timer t;
    TimerTask g;

    public toplar(){
        add(panel1);
        setSize(400,400);
        setTitle("TOP KAZASI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);

        x=200;
       y=200;
       a=200;

       x2=100;
       y2=100;
       a2=100;

        x3=100;
        y3=100;
        a3=100;

       hizx=2;
       hizy=3;
       hiza=5;

        hizx2=4;
        hizy2=5;
        hiza2=6;

        hizx3=5;
        hizy3=2;
        hiza3=3;

       t = new Timer();
       g = new TimerTask() {
           @Override
           public void run() {
               x +=hizx;
               y +=hizy;
               a +=hiza;

               x2 +=hizx2;
               y2 +=hizy2;
               a2 +=hiza2;

               x3 +=hizx3;
               y3 +=hizy3;
               a3 +=hiza3;

               if(x>=360 || x<=0) hizx*=-1;
               if(y>=350 || y<=0) hizy*=-1;
               if(a>=360 || a<=0) hiza*=-1;

               if(x2>=360 || x2<=0) hizx2*=-1;
               if(y2>=350 || y2<=0) hizy2*=-1;
               if(a2>=350 || a2<=0) hiza2*=-1;

               if(x3>=360 || x3<=0) hizx3*=-1;
               if(y3>=360 || y3<=0) hizy3*=-1;
               if(a3>=360 || a3<=0) hiza3*=-1;

               button1.setBounds(x,y,50,50);
               button2.setBounds(x2,y2,50,50);
               button3.setBounds(a,a2,50,50);

           }
       };
        t.schedule(g,0,10);


}}
