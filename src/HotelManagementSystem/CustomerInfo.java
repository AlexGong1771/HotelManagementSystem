package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RectangularShape;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame  {
    CustomerInfo(){

        JPanel panel =new JPanel();
        panel.setBackground(new Color(3 , 45, 48));
        panel.setBounds(5,5,890,590);
        panel.setLayout(null);
        add(panel);

        JTable table  = new JTable();
        table.setBounds(10 , 40 , 900 , 450);
        table.setBackground(new Color(3 , 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{

            JDBC jdbc = new JDBC();
            String querry  = "select * from customer";
            ResultSet resultSet = jdbc.statement.executeQuery(querry);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel id =  new JLabel("ID");
        id.setBounds(31 , 11, 46, 14);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(id);

        JLabel number =  new JLabel("Name");
        number.setBounds(150 , 11, 46, 14);
        number.setForeground(Color.WHITE);
        number.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(number);

        JLabel name =  new JLabel("Gender");
        name.setBounds(270 , 11, 90, 14);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(name);

        JLabel gender =  new JLabel("Country");
        gender.setBounds(360 , 11, 90, 14);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(gender);

        JLabel country =  new JLabel("Room");
        country.setBounds(480 , 11, 46, 14);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(country);

        JLabel room =  new JLabel("Date");
        room.setBounds(600 , 11, 46, 14);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(room);

        JLabel deposit =  new JLabel("Deposit");
        deposit .setBounds(720 , 11, 90, 14);
        deposit .setForeground(Color.WHITE);
        deposit .setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(deposit );

        JLabel num =  new JLabel("Number");
        num  .setBounds(820 , 11, 90, 14);
        num  .setForeground(Color.WHITE);
        num  .setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(num  );

        JButton  back  = new JButton("Back");
        back.setBounds(450 , 510 , 120 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });





        setUndecorated(true);
        setLayout(null);
        setSize(900 ,600);
        setLocation(500 , 100);
        setVisible(true);

    }
    public static void main(String[] args) {
        new CustomerInfo();
    }
}
