package odev5toplar;

import javax.swing.*;

public class topcalistir {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                toplar t1 = new toplar();
                t1.setVisible(true);
            }
        });
    }}
