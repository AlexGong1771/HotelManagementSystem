package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class AddRoom extends JFrame implements ActionListener {
    private JTextField textField;
    private JTextField jTextField;
    private JComboBox jTextField1  , text5;
    private JComboBox  textField1;
    private JButton button1 ,button2;
    public AddRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5,875,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel jlabel = new JLabel("Add Rooms");
        jlabel.setBounds(194 , 10 , 160 , 22);
        jlabel.setFont(new Font("Tahoma" , Font.BOLD , 22));
        jlabel.setForeground(Color.WHITE);
        panel.add(jlabel);

        JLabel jlabel1 = new JLabel("Room Number");
        jlabel1.setBounds(64 , 70 , 152 , 22);
        jlabel1.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jlabel1.setForeground(Color.WHITE);
        panel.add(jlabel1);

        textField = new JTextField();
        textField.setBounds(200 , 70 , 156 , 20);
        textField.setFont(new Font("Tahoma" , Font.BOLD , 14));
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(16 , 108,115));
        panel.add(textField);

        JLabel jlabel2 = new JLabel("Availability");
        jlabel2.setBounds(64 , 110 , 152 , 22);
        jlabel2.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jlabel2.setForeground(Color.WHITE);
        panel.add(jlabel2);

        textField1 = new JComboBox(new String[] {"Available" , "Occupied"});
        textField1.setBounds(200 , 110 , 156 , 20);
        textField1.setFont(new Font("Tahoma" , Font.BOLD , 14));
        textField1.setForeground(Color.WHITE);
        textField1.setBackground(new Color(16 , 108,115));
        panel.add(textField1);

        JLabel jlabel3 = new JLabel("Price");
        jlabel3.setBounds(64 , 150 , 152 , 22);
        jlabel3.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jlabel3.setForeground(Color.WHITE);
        panel.add(jlabel3);

        jTextField= new JTextField();
        jTextField.setBounds(200 , 150 , 156 , 20);
        jTextField.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jTextField.setForeground(Color.WHITE);
        jTextField.setBackground(new Color(16 , 108,115));
        panel.add(jTextField);

        JLabel jlabel4 = new JLabel("Cleaning Status");
        jlabel4.setBounds(64 , 190 , 152 , 22);
        jlabel4.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jlabel4.setForeground(Color.WHITE);
        panel.add(jlabel4);

        jTextField1= new JComboBox(new String[] {"Cleaned" , "Dirty"});
        jTextField1.setBounds(200 , 190 , 156 , 20);
        jTextField1.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jTextField1.setForeground(Color.WHITE);
        jTextField1.setBackground(new Color(16 , 108,115));
        panel.add(jTextField1);

        JLabel jlabel5 = new JLabel("Bed Type");
        jlabel5.setBounds(64 , 230 , 152 , 22);
        jlabel5.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jlabel5.setForeground(Color.WHITE);
        panel.add(jlabel5);

        text5= new JComboBox(new String[] {"Single Bed" , "Double Bed"});
        text5.setBounds(200 , 230 , 156 , 20);
        text5.setFont(new Font("Tahoma" , Font.BOLD , 14));
        text5.setForeground(Color.WHITE);
        text5.setBackground(new Color(16 , 108,115));
        panel.add(text5);

        button1 = new JButton("Add");
        button1.setBounds(64,321,111,33);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        panel.add(button1);

        button2 = new JButton("Back");
        button2.setBounds(198,321,111,33);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        panel.add(button2);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\roomser.png");
        Image image = icon.getImage().getScaledInstance(300 , 300 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500 , 60 , 300 , 300);
        panel.add(label);


        setUndecorated(true);
        setLocation(20 , 200);
        setLayout(null);
        setSize(885 , 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            try{
                JDBC jdbc= new JDBC();
                String room = textField.getText();
                String ava = (String) textField1.getSelectedItem();
                String status = (String) jTextField1.getSelectedItem();
                String price  = jTextField.getText();
                String type = (String) text5.getSelectedItem();

                String querry = "insert into room values('"+room+"' , '"+ava+"' , '"+price+"' , '"+type+"' , '"+status+"')";
                jdbc.statement.executeUpdate(querry);

                JOptionPane.showMessageDialog(null , "Room successfully added");
                setVisible(false);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        } else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
