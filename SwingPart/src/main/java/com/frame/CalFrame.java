package com.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalFrame {


    public static void main(String[] args){
        JFrame frame=new JFrame("计算器");
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));

        JButton button1=new JButton("1");
        panel.add(button1);
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        panel.add(new JButton("11"));
        panel.add(new JButton("12"));
        panel.add(new JButton("13"));
//        panel.add(new JButton("14"));
//        panel.add(new JButton("15"));
//        panel.add(new JButton("16"));
        frame.add(panel);
        frame.setBounds(500,0,1100,620);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long time=e.getWhen();
                perfrom_1();
            }
        });
    }

    static void perfrom_1(){
        JFrame frame=new JFrame("计算器");
        JPanel panel=new JPanel();
        JTextField text=new JTextField("2");
        text.setBounds(new Rectangle(50,50));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setText("this is 1+1");
        panel.add(text);
        frame.add(panel);
        frame.setBounds(0,0,200,200);
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
