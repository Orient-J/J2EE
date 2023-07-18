Before Start , must know 

packages 

javax.swing.*;
java.awt.*;

JLabel
JMenu
JButton 
JFrame 
ImageIcon
JTextField

Classes 


JOptionPane 

    to give result as output 

    methods 

        showMessageDialog(null,"message") 
        showInputDialog("label") 

JFrame 

    create a customized frame window 

    methods 

        setVisible(true); // false 
        setTitle("title"); 
        setLocation(x,y);
        setSize(length,height);
        setResizable(true); // false
        setDefaultCloseOperator(JFrame.EXIT_ON_CLOSE);
        getContentPane(); // return a container

Container 

    methods 

        setBackground(Color.BLUE) ;
        add(JObjects) ;
        setLayout(Position Manger Object);


=> Ways To put GUI objects on Content Pane 

=Layout Manger 

    FlowLayout

        LEFT
        RIGHT
        CENTER

    BorderLayout 

        CENTER
        NORTH
        SOUTH
        EAST
        WEST

    GridLayout 

        row, column 

=Absolute Positioning 

    null layout manager 



JFrame Panels 


Event Handling 

    Event Source Objects 

        Action Event 

            component.addActionListener(this);
            actionPerformed(ActionEvent event);

            ActionEventObject.getSource(); // return String

        Item Event 



        Mouse Event 

    Event Listener Objects 

