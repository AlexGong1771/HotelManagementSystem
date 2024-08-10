package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame implements ActionListener {
    JTable table ;
    JButton back;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890 , 590);
        panel.setBackground(new Color(3 , 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\roomm.png");
        Image image = icon.getImage().getScaledInstance(200 , 200 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(600 , 200 , 200 , 200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10 , 40 , 500 , 400);
        table.setBackground(new Color(3 , 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            JDBC jdbc = new JDBC();
            String roomInfo = "select * from room";
            ResultSet resultSet = jdbc.statement.executeQuery(roomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200 , 500 , 120 , 30);
        back.addActionListener(this);
        panel.add(back);

        JLabel room = new JLabel("Room No");
        room.setBounds(12 , 15, 80 , 19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(room);

        JLabel availabilty = new JLabel("Availability");
        availabilty.setBounds(119 , 15, 80 , 19);
        availabilty.setForeground(Color.WHITE);
        availabilty.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(availabilty);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(413 , 15, 150 , 19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(240 , 15, 80 , 19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(330 , 15, 80 , 19);
        bed.setForeground(Color.WHITE);
        bed.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(bed);

        setUndecorated(true);
        setLayout(null);
        setLocation(500 , 100);
        setSize(900 , 600);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Room();
    }
}
