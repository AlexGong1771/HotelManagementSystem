package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    private JButton addEmployee , addRoom , addDrivers , logout , back;
    public Admin() {

        addEmployee = new JButton("ADD EMPLOYEE");
        addEmployee.setBounds(250 , 230 , 200 , 30);
        addEmployee.setBackground(Color.WHITE);
        addEmployee.setForeground(Color.BLACK);
        addEmployee.setFont(new Font("Tahoma" , Font.BOLD , 15));
        addEmployee.addActionListener(this);
        add(addEmployee);

        addRoom = new JButton("ADD ROOM");
        addRoom.setBounds(250 , 380 , 200 , 30);
        addRoom.setBackground(Color.WHITE);
        addRoom.setForeground(Color.BLACK);
        addRoom.setFont(new Font("Tahoma" , Font.BOLD , 15));
        addRoom.addActionListener(this);
        add(addRoom);

        addDrivers = new JButton("ADD DRIVERS");
        addDrivers.setBounds(250 , 530 , 200 , 30);
        addDrivers.setBackground(Color.WHITE);
        addDrivers.setForeground(Color.BLACK);
        addDrivers.setFont(new Font("Tahoma" , Font.BOLD , 15));
        addDrivers.addActionListener(this);
        add(addDrivers);

        logout = new JButton("LOGOUT");
        logout.setBounds(10 , 700 , 95 , 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma" , Font.BOLD , 13));
        logout.addActionListener(this);
        add(logout);

        back= new JButton("BACK");
        back.setBounds(110 , 700 , 95 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.BOLD , 13));
        back.addActionListener(this);
        add(back);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\employees.png");
        Image image= icon.getImage().getScaledInstance(120 , 120 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon =new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70 , 180 ,120 ,120);
        add(label);

        ImageIcon icon1 = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\room.png");
        Image image1= icon1.getImage().getScaledInstance(120 , 120 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(image1);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70 , 340 ,120 ,120);
        add(label1);

        ImageIcon icon2 = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\driver.png");
        Image image2= icon2.getImage().getScaledInstance(120 , 120 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 =new ImageIcon(image2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70 , 500 ,120 ,120);
        add(label2);

        ImageIcon icon3 = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\login.gif");
        Image image3= icon3.getImage().getScaledInstance(400 , 400 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 =new ImageIcon(image3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(1000 , 250 ,400 ,400);
        add(label3);


        getContentPane().setBackground(new Color(3 , 45 , 48));
        setLayout(null);
        setSize(1950 , 1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == addEmployee){
           new AddEmployee();
       } else if (e.getSource() == addRoom) {
           new AddRoom();

       } else if (e.getSource() == addDrivers) {
           new AddDriver();

       } else if (e.getSource() == logout) {
           System.exit(102);

       } else if (e.getSource() == back) {
          new DashBoard();
          setVisible(false);
       }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
