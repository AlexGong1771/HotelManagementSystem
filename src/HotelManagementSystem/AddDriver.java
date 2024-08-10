package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {
    private JTextField nameText , ageText  ,locText ,carText, carNText;
    private JComboBox genderBox , availableBox;
    private JButton add, back;
    AddDriver(){
        JPanel panel = new JPanel();
        panel.setBounds(5 , 5 , 890 , 490);
        panel.setBackground(new Color(3 , 45,48));
        panel.setLayout(null);
        add(panel);

        JLabel driver = new JLabel("ADD DRIVERS");
        driver.setBounds(500 , 10 , 350 , 32);
        driver.setFont(new Font("Tahoma" , Font.BOLD , 32));
        driver.setForeground(Color.WHITE);
        panel.add(driver);

        JLabel name = new JLabel("NAME");
        name.setBounds(64 , 30 , 102 , 22);
        name.setFont(new Font("Tahoma" , Font.BOLD , 14));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(180 , 30 , 156 , 20);
        nameText.setBackground(new Color(16 , 108,115));
        nameText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(64 , 70 , 70 , 22);
        age.setFont(new Font("Tahoma" , Font.BOLD , 14));
        age.setForeground(Color.WHITE);
        panel.add(age);

        ageText = new JTextField();
        ageText.setBounds(180 , 70 , 156 , 20);
        ageText.setBackground(new Color(16 , 108,115));
        ageText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64 , 110 , 150 , 27);
        gender.setFont(new Font("Tahoma" , Font.BOLD , 14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        genderBox = new JComboBox(new String[] {"No suggestion","Male" , "Female"});
        genderBox.setBounds(180, 110 , 154 , 20);
        genderBox.setForeground(Color.WHITE);
        genderBox.setFont(new Font("Tahoma" , Font.BOLD , 14));
        genderBox.setBackground(new Color(16 , 108 , 115));
        panel.add(genderBox);

        JLabel car = new JLabel("CAR COMPANY");
        car.setBounds(64 , 150 , 120 , 22);
        car.setFont(new Font("Tahoma" , Font.BOLD , 14));
        car.setForeground(Color.WHITE);
        panel.add(car);

        carText = new JTextField();
        carText.setBounds(180 , 150 , 156 , 20);
        carText.setBackground(new Color(16 , 108,115));
        carText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        carText.setForeground(Color.WHITE);
        panel.add(carText);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64 , 190 , 120 , 22);
        carN.setFont(new Font("Tahoma" , Font.BOLD , 14));
        carN.setForeground(Color.WHITE);
        panel.add(carN);

        carNText = new JTextField();
        carNText.setBounds(180 , 190 , 156 , 20);
        carNText.setBackground(new Color(16 , 108,115));
        carNText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        carNText.setForeground(Color.WHITE);
        panel.add(carNText);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64 , 230 , 150 , 27);
        available.setFont(new Font("Tahoma" , Font.BOLD , 14));
        available.setForeground(Color.WHITE);
        panel.add(available);

        availableBox = new JComboBox(new String[] {"YES" , "NO"});
        availableBox.setBounds(180, 230 , 154 , 20);
        availableBox.setForeground(Color.WHITE);
        availableBox.setFont(new Font("Tahoma" , Font.BOLD , 14));
        availableBox.setBackground(new Color(16 , 108 , 115));
        panel.add(availableBox);

        JLabel loc = new JLabel("LOCATION");
        loc.setBounds(64 , 270 , 120 , 22);
        loc.setFont(new Font("Tahoma" , Font.BOLD , 14));
        loc.setForeground(Color.WHITE);
        panel.add(loc);

        locText = new JTextField();
        locText.setBounds(180 , 270 , 156 , 20);
        locText.setBackground(new Color(16 , 108,115));
        locText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        locText.setForeground(Color.WHITE);
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64 , 310 , 100 , 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(174 , 310 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\license.png");
        Image image = icon.getImage().getScaledInstance(300 , 300 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500 , 80 , 300 , 300);
        panel.add(label);

        setUndecorated(true);
        setLocation(20 , 200);
        setLayout(null);
        setSize(900 , 500);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == add){
           String name  = nameText.getText();
           String age = ageText.getText();
           String loc = locText.getText();
           String carInfo = carText.getText();
           String carName = carNText.getText();
           String available = (String) availableBox.getSelectedItem();
           String gender = (String) genderBox.getSelectedItem();
           try{
               JDBC jdbc = new JDBC();
               String sql = "create table driver(name varchar(20) , age varchar(20) , gender varchar(20) , company varchar(20) , car_name varchar(20) , available varchar(20) , location varchar(20));";
               String querry = "insert into driver values ('"+name+"' , '"+age+"' ,  '"+gender+"' , '"+carInfo+"' , '"+carName+"' , '"+available+"'  , '"+loc+"')";
               jdbc.statement.executeUpdate(querry);
               JOptionPane.showMessageDialog(null , "Driver added successfully ");
               setVisible(false);
           }catch(Exception ex){
               ex.printStackTrace();
           }
       } else {
           setVisible(false);
       }
    }

    public static void main(String[] args) {
        new AddDriver();
    }
}
