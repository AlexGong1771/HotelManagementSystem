package HotelManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class SearchRoom extends JFrame implements ActionListener {
    private JCheckBox checkBox;
    private Choice choice;
    private JTable table;
    private JButton add , back;
    SearchRoom(){


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(3 , 45, 48));
        panel.setBounds(5 , 5, 690 , 490);
        add(panel);

        JLabel searchRoom  = new JLabel("Search For Room");
        searchRoom.setBounds(250 , 11, 120, 31);
        searchRoom.setForeground(Color.WHITE);
        searchRoom.setFont(new Font("Tahoma" , Font.BOLD , 20));
        panel.add(searchRoom);


        JLabel rbt = new JLabel("Room Bed Type");
        rbt.setBounds(50 , 73, 120, 14);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(rbt);

        JLabel rn = new JLabel("Room Number");
        rn.setBounds(23 , 162, 150, 20);
        rn.setForeground(Color.WHITE);
        rn.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(rn);

        JLabel available = new JLabel("Availability");
        available.setBounds(175 , 162, 150, 20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(available);

        JLabel st = new JLabel("Price");
        st .setBounds(300 , 162, 150, 20);
        st .setForeground(Color.WHITE);
        st .setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(st );

        JLabel price = new JLabel("Clean Status");
        price.setBounds(458 , 162, 150, 20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(price);

        JLabel bt = new JLabel("Bed Type");
        bt.setBounds(580 , 162, 150, 20);
        bt.setForeground(Color.WHITE);
        bt.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(bt);


        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400 , 69, 205 , 23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3 , 45, 48));
        checkBox.setFont(new Font("Tahoma" , Font.BOLD , 15));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170 , 70 ,120 ,33);
        choice.setBackground(new Color(3 , 45, 48));
        choice.setForeground(Color.WHITE);
        panel.add(choice);

        table = new JTable();
        table.setBounds(0 ,187,700,150);
        table.setBackground(new Color(3 , 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            JDBC jdbc = new JDBC();
            String querry = "select * from room";
            ResultSet resultSet = jdbc.statement.executeQuery(querry);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200 ,400 , 120 , 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back= new JButton("Back");
        back.setBounds(380 ,400 , 120 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);



        setUndecorated(true);
        setLayout(null);
        setLocation(500 , 200);
        setSize(700 , 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == add){
             String querry = "select * from room where bed_type  = '"+choice.getSelectedItem()+"'";
             String querr1 = "select * from room where avialibility  =  'Available' and bed_type = '"+choice.getSelectedItem()+"'";
             try{
                 JDBC jdbc = new JDBC();
                 ResultSet resultSet = jdbc.statement.executeQuery(querry);
                 table.setModel(DbUtils.resultSetToTableModel(resultSet));
                 if (checkBox.isSelected()){
                     ResultSet resultSet1 = jdbc.statement.executeQuery(querr1);
                     table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                 }
             }catch (Exception ex){
                 ex.printStackTrace();
             }
         } else{
             setVisible(false);
         }
    }
    public static void main(String[] args) {
        new SearchRoom();
    }


}
