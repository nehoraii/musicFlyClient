package org.example.function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Front {
    private JFrame frame=new JFrame();
    private int widthScreen=500;
    private int heightScreen=750;

    public void runner(){
        connectionButton();
        createButton();
        screenSetting();
    }
    public void screenSetting(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        frame.setResizable(false);
        frame.setTitle("Music-Fly");//prevent frame from being resized
        frame.setSize(widthScreen,heightScreen); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true);
        ImageIcon image=new ImageIcon("C:\\Users\\user\\Documents\\Haspin\\project\\pictures\\headphone.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0,0,0));
    }

    public void connectionButton(){
        JButton connectionButton = new JButton("CONNECTION");
        connectionButton.addActionListener(e-> {
                    JDialog dialog = new JDialog(frame, "CONNECTION", true);
                    dialog.getContentPane().setLayout(new FlowLayout());

                    JTextField usernameField = new JTextField(20);
                    JTextField passwordField = new JTextField(20);

                    dialog.getContentPane().add(usernameField);
                    dialog.getContentPane().add(passwordField);
                    JButton submitButton = new JButton("Submit");
                    submitButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String username = usernameField.getText();
                            String password = passwordField.getText();
                            dialog.dispose();
                        }

                    });
                    dialog.getContentPane().add(submitButton);
                    dialog.setSize(300, 150);
                    dialog.setVisible(true);
                });
        frame.getContentPane().add(connectionButton);
        frame.getContentPane().setLayout(new FlowLayout());
    }
    public void createButton(){
        JButton creatButton = new JButton("CREAT");
        creatButton.addActionListener(e-> {
            JDialog dialog = new JDialog(frame, "CONNECTION", true);
            dialog.getContentPane().setLayout(new FlowLayout());

            JTextField usernameField = new JTextField(20);
            JTextField passwordField = new JTextField(20);
            JTextField phoneFiled = new JTextField(20);
            JTextField emailFiled = new JTextField(20);
            JTextField secNameFiled = new JTextField(20);
            JTextField dateFiled = new JTextField(20);

            JLabel userLabel = new JLabel("USER:");
            JLabel passLabel = new JLabel("PASSWORD:");
            JLabel secNameLabel = new JLabel("SECOND NAME:");
            JLabel phoneLabel = new JLabel("PHONE:");
            JLabel dateLabel = new JLabel("DATE:");
            JTextField textField = new JTextField(10);

            dialog.getContentPane().add(userLabel);
            dialog.getContentPane().add(textField);
            dialog.getContentPane().add(usernameField);

            dialog.getContentPane().add(passLabel);
            dialog.getContentPane().add(textField);
            dialog.getContentPane().add(passwordField);

            dialog.getContentPane().add(phoneLabel);
            dialog.getContentPane().add(textField);
            dialog.getContentPane().add(phoneFiled);

            dialog.getContentPane().add(secNameLabel);
            dialog.getContentPane().add(textField);
            dialog.getContentPane().add(secNameFiled);

            dialog.getContentPane().add(dateLabel);
            dialog.getContentPane().add(textField);
            dialog.getContentPane().add(dateFiled);
            JButton submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText();
                    String password = passwordField.getText();
                    String phone=phoneFiled.getText();
                    String email=emailFiled.getText();
                    String secName=secNameFiled.getText();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); dateFiled.getText();

                    dialog.dispose();
                }

            });
            dialog.getContentPane().add(submitButton);
            dialog.setSize(300, 150);
            dialog.setVisible(true);
        });
        frame.add(creatButton);
    }
}
