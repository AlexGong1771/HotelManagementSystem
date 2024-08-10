package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame {
    PickUp(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(3 , 45, 48));
        panel.setBounds(5 , 5  ,790 , 590);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90 , 11, 200, 25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma", Font.BOLD , 20));
        panel.add(pus);

        JLabel toc = new JLabel("Car Type");
        toc.setBounds(32 , 97, 89, 17);
        toc.setForeground(Color.WHITE);
        toc.setFont(new Font("Tahoma", Font.BOLD , 17));
        panel.add(toc);

        Choice choice = new Choice();
        choice.setBounds(123 , 94 , 150 , 25);
        choice.setForeground(Color.WHITE);
        choice.setBackground(new Color(3 , 45, 48));
        panel.add(choice);


        try {
            JDBC jdbc = new JDBC();
            ResultSet resultSet = jdbc.statement.executeQuery("select * from driver");
            while (resultSet.next()){
                choice.add(resultSet.getString("car_name"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10, 233,800,250);
        table.setBackground(new Color(3 , 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
               JDBC jdbc = new JDBC();
               String querry  = "select * from driver";
               ResultSet resultSet = jdbc.statement.executeQuery(querry);
               table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24 , 208 , 46 , 14);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(164  , 208 , 46 , 14);
        gender.setForeground(Color.WHITE);
        panel.add(gender);


        JLabel age = new JLabel("Age");
        age.setBounds(265 , 208 , 46 , 14);
        age.setForeground(Color.WHITE);
        panel.add(age);

        JLabel company= new JLabel("Company");
        company.setBounds(366 , 208 , 100, 14);
        company.setForeground(Color.WHITE);
        panel.add(company);

        JLabel carName= new JLabel("Car Name");
        carName.setBounds(486 , 208 , 100, 14);
        carName.setForeground(Color.WHITE);
        panel.add(carName);

        JLabel available= new JLabel("Available");
        available.setBounds(600 , 208 , 100, 14);
        available.setForeground(Color.WHITE);
        panel.add(available);

        JLabel location= new JLabel("Location");
        location.setBounds(700 , 208 , 100, 14);
        location.setForeground(Color.WHITE);
        panel.add(location);

        JButton display = new JButton("Display");
        display.setBounds(200 , 500 , 120 , 30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String querry  = "select * from driver where car_name = '"+choice.getSelectedItem()+"'";
                try{
                    JDBC jdbc = new JDBC();
                    ResultSet resultSet = jdbc.statement.executeQuery(querry);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception ex){
                    ex.printStackTrace();
                }


            }
        });

        JButton back = new JButton("Back");
        back.setBounds(420 , 500 , 120 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



        setLayout(null);
        setSize(800 , 600);
        setLocation(500 , 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PickUp();
    }
}
