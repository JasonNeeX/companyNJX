package com.frame;

import javax.swing.*;
import java.awt.*;


public class LoginFrame extends JFrame {

    private JPanel contentPanel;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                LoginFrame frame=new LoginFrame();
                frame.setVisible(true);
            }
        });

    }

    public LoginFrame(){
        setTitle("倪浩鑫");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JasonNee\\Desktop\\timg2.jpg"));
        setBounds(200,100,1100,620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPanel=new JPanel();
        contentPanel.setBackground(Color.blue);
        setContentPane(contentPanel);
        contentPanel.setLayout(new BorderLayout(0,0));
        JButton button=new JButton("按钮");
        button.setIcon(new ImageIcon("C:\\Users\\JasonNee\\Desktop\\timg.jpg"));
        button.setBounds(400,420,84,27);
        contentPanel.add(button,BorderLayout.LINE_END);
        JButton button2=new JButton("按钮0");
        button2.setBackground(Color.cyan);
        button2.setBounds(300,300,84,27);
        contentPanel.add(button,BorderLayout.BEFORE_FIRST_LINE);
    }

}
