package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut(){
        JPanel panel = new JPanel();
        panel.setBounds(5 , 5, 790 , 390);
        panel.setBackground(new Color(3 , 45,48));
        panel.setLayout(null);
        add(panel);

        JLabel title  = new JLabel("Check-Out");
        title.setBounds(100 , 20 , 160 , 30);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Tahoma" , Font.BOLD , 20));
        panel.add(title);

        JLabel userId = new JLabel("Customer Id");
        userId.setBounds(30 , 80 , 160 , 30);
        userId.setForeground(Color.WHITE);
        userId.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(userId);

        Choice customer = new Choice();
        customer.setBounds(200 , 80 , 150 , 25);
        panel.add(customer);

        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30 , 130 , 160 , 30);
        roomNum.setForeground(Color.WHITE);
        roomNum.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(roomNum);

        JLabel labelRoomNumber= new JLabel();
        labelRoomNumber.setBounds(200 , 130 , 160 , 30);
        labelRoomNumber.setForeground(Color.WHITE);
        labelRoomNumber.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(labelRoomNumber);

        JLabel checkInTime= new JLabel("Check-In Time");
        checkInTime.setBounds(30 , 180 , 160 , 30);
        checkInTime.setForeground(Color.WHITE);
        checkInTime.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(checkInTime);

        JLabel labelcheckInTime= new JLabel();
        labelcheckInTime.setBounds(200 , 180 , 160 , 30);
        labelcheckInTime.setForeground(Color.WHITE);
        labelcheckInTime.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(labelcheckInTime);

        JLabel checkOutTime= new JLabel("Check-Out Time");
        checkOutTime.setBounds(30 , 230 , 160 , 30);
        checkOutTime.setForeground(Color.WHITE);
        checkOutTime.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(checkOutTime);

        Date date = new Date();

        JLabel labelcheckOutTime= new JLabel(""+date);
        labelcheckOutTime.setBounds(200 , 230 , 240 , 30);
        labelcheckOutTime.setForeground(Color.WHITE);
        labelcheckOutTime.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(labelcheckOutTime);

        try {
            JDBC jdbc = new JDBC();
            ResultSet resultSet = jdbc.statement.executeQuery("select * from customer");
            while(resultSet.next()){
                customer.add(resultSet.getString("number"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        JButton checkOut = new JButton("Check-Out");
        checkOut.setBounds(30 , 300 , 120 , 30);
        checkOut.setForeground(Color.WHITE);
        checkOut.setBackground(Color.BLACK);
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                JDBC jdbc = new JDBC();
                jdbc.statement.executeUpdate("delete from customer where number  = '"+customer.getSelectedItem()+"'");
                jdbc.statement.executeUpdate("update  room set avialibility  = 'Available' where  room_number = '"+labelRoomNumber.getText()+"'");
                JOptionPane.showMessageDialog(null , "Done");
                setVisible(false);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300 , 300 , 120 , 30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDBC jdbc = new JDBC();
                try {
                    ResultSet resultSet = jdbc.statement.executeQuery("select  * from customer where  number = '"+customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelRoomNumber.setText(resultSet.getString("room"));
                        labelcheckInTime.setText(resultSet.getString("chceckintime"));
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170 , 300 , 120 , 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(800 ,400);
        setLocation(500 , 210);
        setVisible(true);


    }
    public static void main(String[] args) {
     new CheckOut();
    }
}
