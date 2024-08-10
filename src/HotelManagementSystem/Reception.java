package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    public Reception() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(280 , 5 , 1240 , 820);
        panel1.setBackground(new Color(3 , 45 , 48));
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(5 , 5 , 270 , 820);
        panel2.setBackground(new Color(3 , 45 , 48));
        add(panel2);

        ImageIcon icon11  = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\cccc.gif");
        Image i11 = icon11.getImage().getScaledInstance(800 , 800 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i11);
        JLabel label11 = new JLabel(imageIcon11);
        label11.setBounds(300,20,800,800);
        panel1.add(label11);

        ImageIcon icon2  = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\login.gif");
        Image i2 = icon2.getImage().getScaledInstance(250 , 250 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(5,530,250,250);
        panel2.add(label2);

        JButton jButton = new JButton("New Customer Form");
        jButton.setBounds(30 , 30 , 200 , 30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.WHITE);
        panel2.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new NewCustomer();

                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton1 = new JButton("Room");
        jButton1.setBounds(30 , 70 , 200 , 30);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);
        panel2.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton2 = new JButton("Department");
        jButton2.setBounds(30 , 110 , 200 , 30);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);
        panel2.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton3 = new JButton("All Employee Info");
        jButton3.setBounds(30 , 150 , 200 , 30);
        jButton3.setBackground(Color.BLACK);
        jButton3.setForeground(Color.WHITE);
        panel2.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                      new Employee();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton4 = new JButton("Costumer Info");
        jButton4.setBounds(30 , 190 , 200 , 30);
        jButton4.setBackground(Color.BLACK);
        jButton4.setForeground(Color.WHITE);
        panel2.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                      new CustomerInfo();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton5 = new JButton("Manager Info");
        jButton5.setBounds(30 , 230 , 200 , 30);
        jButton5.setBackground(Color.BLACK);
        jButton5.setForeground(Color.WHITE);
        panel2.add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        new ManagerInfo();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton6 = new JButton("Check Out");
        jButton6.setBounds(30 , 270 , 200 , 30);
        jButton6.setBackground(Color.BLACK);
        jButton6.setForeground(Color.WHITE);
        panel2.add(jButton6);
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton7= new JButton("Update Check-In Details");
        jButton7.setBounds(30 , 310 , 200 , 30);
        jButton7.setBackground(Color.BLACK);
        jButton7.setForeground(Color.WHITE);
        panel2.add(jButton7);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                       new UpdateCheck();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton8 = new JButton("Update Room Status");
        jButton8.setBounds(30 , 350 , 200 , 30);
        jButton8.setBackground(Color.BLACK);
        jButton8.setForeground(Color.WHITE);
        panel2.add(jButton8);
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateRoom();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton9 = new JButton("Pick Up Service");
        jButton9.setBounds(30 , 390 , 200 , 30);
        jButton9.setBackground(Color.BLACK);
        jButton9.setForeground(Color.WHITE);
        panel2.add(jButton9);
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                       new PickUp();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton jButton10 = new JButton("Search Room");
        jButton10.setBounds(30 , 430 , 200 , 30);
        jButton10.setBackground(Color.BLACK);
        jButton10.setForeground(Color.WHITE);
        panel2.add(jButton10);
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                           new SearchRoom();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(100 , 700 , 200 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new DashBoard();
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });


        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950 , 1090);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String[] args) {
        new Reception();
    }
}
