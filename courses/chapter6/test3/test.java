package chapter6.test3;

// import javax.swing.JOptionPane; // JOptionPane/ showMessageDialog/ showInputDailog

import javax.swing.JFrame;

import java.awt.Container;

import java.awt.Color;

// import example1.ServerTest;

public class test {

    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "I love Myanmar");

        // System.out.println(
        //     JOptionPane.showInputDialog("Hello World")
        // );


        // ______________________________________________________

        JFrame frame = new JFrame();

        frame.setVisible(true); // to visible frame window 
        
        frame.setTitle("Tesing Title"); // frame title

        frame.setSize(500,200); // frame size 

        frame.setLocation(200,300); // set frame from border of window 

        frame.setResizable(false); // frame resize 

        Container container = frame.getContentPane();

        container.setBackground(Color.BLACK);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // actually closing by clicking cross sign
        
        
    }
    
}
