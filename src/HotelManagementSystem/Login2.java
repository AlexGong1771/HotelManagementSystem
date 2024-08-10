package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener {
    private JTextField textField;
    private JPasswordField textField1;
    JButton b1 , b2 ;
    Login2(){
        JLabel label = new JLabel("User name");
        label.setBounds(40, 70 , 100 , 30);
        label.setFont(new Font("Tahoma" , Font.BOLD ,  16));
        add(label);

        JLabel label1 = new JLabel("Password");
        label1.setBounds(40, 120 , 100 , 30);
        label1.setFont(new Font("Tahoma" , Font.BOLD ,  16));
        add(label1);

        textField = new JTextField();
        textField.setBounds(150 , 70 , 150 , 30);
        textField.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        textField.setBackground(new Color(196, 152, 70, 255));
        add(textField);

        textField1 = new JPasswordField();
        textField1.setBounds(150 , 120 , 150 , 30);
        textField1.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        textField1.setBackground(new Color(196, 152, 70, 255));
        add(textField1);


        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\login.gif");
        Image i1 = icon.getImage().getScaledInstance(255, 300 , Image.SCALE_DEFAULT);
        JLabel label2 = new JLabel(icon);
        label2.setBounds(335, -10 ,255 , 300);
        add(label2);

        b1 = new JButton("Login");
        b1.setBounds(40 , 170 , 120 , 30);
        b1.setFont(new Font("serif" , Font.BOLD , 15 ));
        b1.setBackground(new Color(196, 152, 70, 255));
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180 , 170 , 120 , 30);
        b2.setFont(new Font("serif" , Font.BOLD , 15 ));
        b2.setBackground(new Color(196, 152, 70, 255));
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        add(b2);


        getContentPane().setBackground(new Color(196, 152, 70, 92));
        setLayout(null);
        setLocation(400 , 270);
        setSize(600 , 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            try {
                JDBC jdbc = new JDBC();
                String user = textField.getText();
                String pas = String.valueOf(textField1.getPassword());
                String querry = "select * from login2 where user_name = '"+user+"'  and password = '"+pas+"'";
                ResultSet resultSet = jdbc.statement.executeQuery(querry);
                if (resultSet.next()){
                    new Admin();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null , "invalid");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }

        } else {
            new DashBoard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login2();
    }
}
