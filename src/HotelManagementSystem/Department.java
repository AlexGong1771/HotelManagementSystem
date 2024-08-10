package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690 , 490);
        panel.setBackground(new Color(3 , 45, 48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0 , 40 , 700 , 350);
        table.setBackground(new Color(3 , 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            JDBC jdbc = new JDBC();
            String depInfo = "select * from department";
            ResultSet resultSet = jdbc.statement.executeQuery(depInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(400 , 410 , 120 , 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == back){
                    setVisible(false);
                }
            }
        });
        panel.add(back);
        JLabel label1 = new JLabel("Department");
        label1.setBounds(145, 11,105 , 20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setBounds(431, 11,105 , 20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(label2);

        setUndecorated(true);
        setLayout(null);
        setLocation(550 , 150);
        setSize(700 , 500);
        setVisible(true);

    }



    public static void main(String[] args) {
        new Department();
    }

}
