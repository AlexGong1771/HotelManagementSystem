package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {
    private JButton add,rec;
    DashBoard(){
        super("HOTEL MANAGEMENT SYSTEM");

        this.rec = new JButton("RECEPTION");
        rec.setBounds(425 , 510  ,140 , 30);
        rec.setFont(new Font("Tahoma" , Font.BOLD , 15));
        rec.setBackground(new Color(255 , 98 , 0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        this.add = new JButton("ADMIN");
        add.setBounds(880 , 510  ,140 , 30);
        add.setFont(new Font("Tahoma" , Font.BOLD , 15));
        add.setBackground(new Color(255 , 98 , 0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon icon11  = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\Reception.png");
        Image i11 = icon11.getImage().getScaledInstance(200 , 195 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i11);
        JLabel label11 = new JLabel(imageIcon11);
        label11.setBounds(400,300,200,195);
        add(label11);

        ImageIcon icon1  = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\boss.png");
        Image i1 = icon1.getImage().getScaledInstance(200 , 195 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(850,300,200,195);
        add(label1);

        ImageIcon icon  = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\Dashboard.gif");
        Image i = icon.getImage().getScaledInstance(1950 , 1090 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1950,1090);
        add(label);
//        setTitle("DashBoard");
        setLayout(null);
        setSize(1950 , 1090);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rec){
           new Reception();
           setVisible(false);
        } else {
           new Login2();
           setVisible(false);
        }
    }

    public static void main(String[] args) {
        new DashBoard();
    }
}
