package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    private JTextField nameText , ageText , salaryText , phoneText  ,aadharText, emailText;
    private JRadioButton manBtn , womBtn;
    private JComboBox comboBox;
    private JButton add , back;
    AddEmployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5 , 5, 890,490  );
        panel.setLayout(null);
        panel.setBackground(new Color(3 , 45 , 48));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60 , 30 , 150 , 27);
        name.setFont(new Font("Tahoma" , Font.BOLD , 17));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText  = new JTextField();
        nameText.setBounds(200 , 30 , 150 , 27);
        nameText.setBackground(new Color(16 , 108,115));
        nameText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(60 , 80 , 150 , 27);
        age.setFont(new Font("Tahoma" , Font.BOLD , 17));
        age.setForeground(Color.WHITE);
        panel.add(age);

        ageText  = new JTextField();
        ageText.setBounds(200 , 80 , 150 , 27);
        ageText.setBackground(new Color(16 , 108,115));
        ageText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60 , 130 , 150 , 27);
        gender.setFont(new Font("Tahoma" , Font.BOLD , 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        manBtn = new JRadioButton("MALE");
        manBtn.setBounds(200 , 130 , 70 , 27);
        manBtn.setBackground(new Color(3 , 45 , 48));
        manBtn.setFont(new Font("Tahoma"  , Font.BOLD , 14));
        manBtn.setForeground(Color.white);
        panel.add(manBtn);

        womBtn = new JRadioButton("FEMALE");
        womBtn.setBounds(270 , 130 , 100 , 27);
        womBtn.setBackground(new Color(3 , 45 , 48));
        womBtn.setFont(new Font("Tahoma"  , Font.BOLD , 14));
        womBtn.setForeground(Color.white);
        panel.add(womBtn);

        JLabel job = new JLabel("JOB");
        job.setBounds(60 , 170, 150 , 27);
        job.setFont(new Font("serif" , Font.BOLD , 17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox<>(new String [] {"Front Desk" , "Housekeeping" , "Kitchen Staff" , "Room Service" , "Manager" , "Accountant" , "Chef"});
        comboBox.setBackground(new Color(16 , 108, 115));
        comboBox.setBounds(200 , 170 , 150 , 30);
        comboBox.setFont(new Font("Tahoma" , Font.BOLD , 14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60 , 220 , 150 , 27);
        salary.setFont(new Font("Tahoma" , Font.BOLD , 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);

        salaryText  = new JTextField();
        salaryText.setBounds(200 , 220 , 150 , 27);
        salaryText.setBackground(new Color(16 , 108,115));
        salaryText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);

        JLabel phone= new JLabel("PHONE");
        phone.setBounds(60 , 270 , 150 , 27);
        phone.setFont(new Font("Tahoma" , Font.BOLD , 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);

        phoneText  = new JTextField();
        phoneText.setBounds(200 , 270 , 150 , 27);
        phoneText.setBackground(new Color(16 , 108,115));
        phoneText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel aadhar= new JLabel("AADHAR");
        aadhar.setBounds(60 , 320 , 150 , 27);
        aadhar.setFont(new Font("Tahoma" , Font.BOLD , 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);

        aadharText  = new JTextField();
        aadharText.setBounds(200 , 320 , 150 , 27);
        aadharText.setBackground(new Color(16 , 108,115));
        aadharText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60 , 370 , 150 , 27);
        email.setFont(new Font("Tahoma" , Font.BOLD , 17));
        email.setForeground(Color.WHITE);
        panel.add(email);

        emailText  = new JTextField();
        emailText.setBounds(200 , 370 , 150 , 27);
        emailText.setBackground(new Color(16 , 108,115));
        emailText.setFont(new Font("Tahoma" , Font.BOLD , 14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        JLabel  AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450 , 24 , 445 , 35);
        AED.setFont(new Font("Tahoma" , Font.BOLD , 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80 , 420 , 100 , 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200 , 420 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\addemp.png");
        Image image = icon.getImage().getScaledInstance(300 , 300 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500 , 100 , 300 , 300);
        panel.add(label);

        setLocation(60 , 160);
        setLayout(null);
        setTitle("Add employee");
        setSize(900 , 500);
        setUndecorated(true);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
           String name  = nameText.getText();
           String age = ageText.getText();
           String salary=  salaryText.getText();
           String phone  = phoneText.getText();
           String email = emailText.getText();
           String aadhar = aadharText.getText();
           String job = (String) comboBox.getSelectedItem();
           String gender = null;
           if (manBtn.isSelected()){
               gender = "Male";
           } else if (womBtn.isSelected()) {
               gender = "Female";
           }
           try{
               JDBC jdbc = new JDBC();
               String sql ="create table employee(name varchar(20) , age varchar(20) , gender varchar(20) , job varchar(20) , salary varchar(20) , phone varchar(20) , email varchar(30) , aadhar varchar(20) );";
               String querry = "insert into employee values ('"+name+"' , '"+age+"' , '"+gender+"' , '"+job+"' , '"+salary+"' , '"+phone+"' , '"+email+"' , '"+aadhar+"')";
               jdbc.statement.executeUpdate(querry);
               JOptionPane.showMessageDialog(null , "Employee Added successfully");
               setVisible(false);
           } catch (Exception ex){
               ex.printStackTrace();
           }

        } else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
