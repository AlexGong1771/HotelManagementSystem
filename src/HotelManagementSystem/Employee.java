package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee extends JFrame {
    Employee(){

        JPanel panel = new JPanel();
        panel.setBounds(5 , 5  ,990 , 590);
        panel.setLayout(null);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        JTable table = new JTable();
        table.setBackground(new Color(3 , 45, 48));
        table.setBounds(10 , 34, 980 , 450);
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            JDBC jdbc = new JDBC();
            String querry  = "SELECT * from  employee";
            ResultSet resultSet = jdbc.statement.executeQuery(querry);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350 , 500 , 120 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == back){
                    setVisible(false);
                }
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(41 , 11, 78, 19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(159 , 11, 78, 19);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(273 , 11, 78, 19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(gender);

        JLabel job = new JLabel("Gender");
        job.setBounds(416 , 11, 78, 19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536 , 11, 78, 19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(656 , 11, 78, 19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(786, 11, 78, 19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(gmail);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(896, 11, 78, 19);
        aadhar.setForeground(Color.WHITE);
        aadhar.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(aadhar);



        setUndecorated(true);
        setLayout(null);
        setLocation(430 , 100);
        setSize(1000 , 600);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Employee();
    }
}
