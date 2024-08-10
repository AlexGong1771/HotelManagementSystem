package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame {
    UpdateCheck(){

        JPanel panel = new JPanel();
        panel.setBounds(5 , 5 , 940 ,490);
        panel.setBackground(new Color(3 , 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\updated.png");
        Image image = icon.getImage().getScaledInstance(300 , 300 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500 , 60  , 300 , 300);
        panel.add(label);

        JLabel check= new JLabel("Check-In Details");
        check.setBounds(124 , 11 , 222, 25);
        check.setFont(new Font("Tahoma" , Font.BOLD , 20));
        check.setForeground(Color.white);
        panel.add(check);

        JLabel id= new JLabel("ID :");
        id.setBounds(25 , 88 , 46, 14);
        id.setFont(new Font("Tahoma" , Font.BOLD , 14));
        id.setForeground(Color.white);
        panel.add(id);

        Choice choice = new Choice();
        choice.setBounds(248 , 85 , 140 , 20);
        panel.add(choice);

        try {
            JDBC jdbc = new JDBC();
            ResultSet resultSet = jdbc.statement.executeQuery("select  * from customer");
            while(resultSet.next()){
                choice.add(resultSet.getString("number"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        JLabel roomNumber= new JLabel("Room Number :");
        roomNumber.setBounds(25 , 129 , 127, 14);
        roomNumber.setFont(new Font("Tahoma" , Font.BOLD , 14));
        roomNumber.setForeground(Color.white);
        panel.add(roomNumber);

        JTextField textField = new JTextField();
        textField.setBounds(248 , 129 , 140 , 20);
        panel.add(textField);

        JLabel name = new JLabel("Name :");
        name.setBounds(25 , 174 , 97, 14);
        name.setFont(new Font("Tahoma" , Font.BOLD , 14));
        name.setForeground(Color.white);
        panel.add(name);

        JTextField textField1 = new JTextField();
        textField1.setBounds(248 , 174 , 140 , 20);
        panel.add(textField1);

        JLabel label5 = new JLabel("Checked-in :");
        label5.setBounds(25 , 216 , 97, 14);
        label5.setFont(new Font("Tahoma" , Font.BOLD , 14));
        label5.setForeground(Color.white);
        panel.add(label5);

        JTextField textField5 = new JTextField();
        textField5.setBounds(248 , 216 , 140 , 20);
        panel.add(textField5);

        JLabel ap = new JLabel("Amount Paid (Rs):");
        ap.setBounds(25 , 261 , 200, 14);
        ap.setFont(new Font("Tahoma" , Font.BOLD , 14));
        ap.setForeground(Color.white);
        panel.add(ap);

        JTextField textap = new JTextField();
        textap.setBounds(248 , 261 , 140 , 20);
        panel.add(textap);

        JLabel pa = new JLabel("Pending Amount (Rs):");
        pa.setBounds(25 , 302 , 200, 14);
        pa.setFont(new Font("Tahoma" , Font.BOLD , 14));
        pa.setForeground(Color.white);
        panel.add(pa);

        JTextField textpa = new JTextField();
        textpa.setBounds(248 , 302 , 140 , 20);
        panel.add(textpa);

        JButton update  = new JButton("Update");
        update.setBounds(56 , 378  , 89 , 23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma" , Font.BOLD  , 14));
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JDBC jdbc = new JDBC();
                    String querry = choice.getSelectedItem();
                    String room = textField.getText();
                    String name = textField1.getText();
                    String check = textField5.getText();
                    String amount  = textap.getText();
                    jdbc.statement.executeUpdate("update customer set room = '"+room+"' , name = '"+name+"' , chceckintime = '"+check+"' , deposit  = '"+amount+"' where number = '"+querry+"'");
                    JOptionPane.showMessageDialog(null , "Updated successfully");
                    setVisible(false);
                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(168, 378  , 89 , 23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.BOLD  , 14));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        JButton ck = new JButton("Check");
        ck.setBounds(281 , 378  , 89 , 23);
        ck.setBackground(Color.BLACK);
        ck.setForeground(Color.WHITE);
        ck.setFont(new Font("Tahoma" , Font.BOLD  , 14));
        ck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = choice.getSelectedItem();
                String querry  = "select  * from customer where number = '"+id+"'";
                try{
                    JDBC jdbc = new JDBC();
                    ResultSet resultSet = jdbc.statement.executeQuery(querry);

                    while(resultSet.next()){
                        textField.setText(resultSet.getString("room"));
                        textField1.setText(resultSet.getString("name"));
                        textField5.setText(resultSet.getString("chceckintime"));
                        textap.setText(resultSet.getString("deposit"));
                    }

                    ResultSet resultSet1 = jdbc.statement.executeQuery("select * from room where room_number = '"+textField.getText()+"'");
                    
                    while (resultSet1.next()){
                        String price = resultSet1.getString("price");
                        int amount  = Integer.parseInt(price) - Integer.parseInt(textap.getText());
                        textpa.setText(""+amount);
                    }


                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        panel.add(ck);

        setLayout(null);
        setSize(950 , 500);
        setLocation(400 , 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new UpdateCheck();
    }
}
