package chapter6.test3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{

    private JTextField textField[] = new JTextField[3];
    private JLabel label[] = new JLabel[textField.length];

    public Frame() {

        setSize(500,300);
        setLocation(500,500);
        setTitle("Insert GUI");
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JButton button = new JButton("Insert");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        JButton button1 = new JButton("Show Data");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.CYAN);



        JPanel panel = new JPanel(new GridLayout(6,0));
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        String labelText[] = {"Full Name", "Email", "Password"}; 

        for( int idx = 0; idx < labelText.length ; idx++) {

            textField[idx] = new JTextField(100);
            label[idx] = new JLabel(labelText[idx]);

            panel.add(label[idx]);
            panel.add(textField[idx]);

        }

        btnPanel.add(button);
        btnPanel.add(button1);

        container.add(btnPanel, BorderLayout.SOUTH);

        container.add(panel, BorderLayout.CENTER);
        
        button.addActionListener(this);
        button1.addActionListener(this);
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // for( int idx = 0; idx < textField.length; idx++ ) {

        //     System.out.println(idx + " " + textField[idx].getText());
        // }

        try{

            Database database = new Database();

            JButton buttonGet = (JButton) event.getSource();
        
            // System.out.println(buttonGet.getText());
    
            if( buttonGet.getText().equalsIgnoreCase("show data") ) {
    
                System.out.println("show Data");
    
                JOptionPane.showMessageDialog(null, database.getData());

            
            }else{

                String data[] = new String[textField.length];

                for( int idx = 0; idx < data.length ; idx++ ) {

                    data[idx] = textField[idx].getText();

                    textField[idx].setText("");
                }

                JOptionPane.showMessageDialog(null, database.insertData(data));
            }
        
        }catch(Exception exception){

            
        }


    }

}