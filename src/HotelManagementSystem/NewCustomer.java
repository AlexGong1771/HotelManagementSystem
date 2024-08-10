package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    private JComboBox comboBox;
    private JTextField textFieldNumber , textFieldName ,textFieldCountry , textlabelDeposite ;
    private JRadioButton m, f;
    private  Choice c1;
    private JLabel date;
    private JButton add , back;
    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5 , 5, 840 , 540);
        panel.setLayout(null);
        panel.setBackground(new Color(3 ,45, 48));
        add(panel);

        ImageIcon icon = new ImageIcon("C:\\Users\\42194\\workspace\\HotelManagementSystem\\src\\HotelManagementSystem\\icon\\customer.png");
        Image image = icon.getImage().getScaledInstance(200 , 200 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(550 , 150 , 200 , 200);
        panel.add(label);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118 , 11 , 260 , 53);
        labelName.setFont(new Font("Tahoma" , Font.BOLD , 20));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35 , 76, 200 , 17);
        labelID.setForeground(Color.WHITE);
        labelID.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Password" , "Aadhar Card" , "Voter Id " , "Driving License"});
        comboBox.setBounds(271 , 76 ,150 , 20);
        comboBox.setBackground(new Color(3, 45, 48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(comboBox);

        JLabel labelNumber= new JLabel("Number :");
        labelNumber.setBounds(35 , 111, 200 , 17);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271 , 111 ,150 , 20);
        textFieldNumber.setBackground(Color.WHITE);
        textFieldNumber.setForeground(Color.BLACK);
        textFieldNumber.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(textFieldNumber);

        JLabel labeltextName= new JLabel("Name :");
        labeltextName.setBounds(35 , 151, 200 , 17);
        labeltextName.setForeground(Color.WHITE);
        labeltextName.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labeltextName);

        textFieldName = new JTextField();
        textFieldName.setBounds(271 , 151 ,150 , 20);
        textFieldName.setBackground(Color.WHITE);
        textFieldName.setForeground(Color.BLACK);
        textFieldName.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(textFieldName);

        JLabel labelGender= new JLabel("Gender :");
        labelGender.setBounds(35 , 191, 200 , 17);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labelGender);

        m = new JRadioButton("Male");
        m.setFont(new Font("Tahoma" , Font.BOLD , 14));
        m.setForeground(Color.WHITE);
        m.setBackground(new Color(3 , 45, 48));
        m.setBounds(271 , 191, 80,14);
        panel.add(m);

        f = new JRadioButton("Female");
        f.setFont(new Font("Tahoma" , Font.BOLD , 14));
        f.setForeground(Color.WHITE);
        f.setBackground(new Color(3 , 45, 48));
        f.setBounds(350 , 191, 80,14);
        panel.add(f);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35 , 231, 200 , 17);
        labelCountry.setForeground(Color.WHITE);
        labelCountry.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labelCountry);

        textFieldCountry = new JTextField();
        textFieldCountry.setBounds(271 , 231 ,150 , 20);
        textFieldCountry.setBackground(Color.WHITE);
        textFieldCountry.setForeground(Color.BLACK);
        textFieldCountry.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(textFieldCountry);

        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35 , 274, 230 , 17);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma" , Font.BOLD , 17));
        panel.add(labelRoom);

       c1 = new Choice();
       try {

           JDBC jdbc =new JDBC();
           ResultSet resultSet = jdbc.statement.executeQuery("select * from room ");
           while(resultSet.next()){
               c1.add(resultSet.getString("room_number"));
           }

       }catch (Exception ex){
           ex.printStackTrace();
       }
       c1.setBounds(271,274,150,20);
       c1.setFont(new Font("Tahoma" , Font.BOLD , 14));
       c1.setForeground(Color.WHITE);
       c1.setBackground(new Color(3 , 45, 48));
       panel.add(c1);

       JLabel labelCIS= new JLabel("Checked-In :");
       labelCIS.setBounds(35 , 316, 230 , 17);
       labelCIS.setForeground(Color.WHITE);
       labelCIS.setFont(new Font("Tahoma" , Font.BOLD , 17));
       panel.add(labelCIS);

       Date date1 = new Date();

       date = new JLabel(" " + date1);
       date.setBounds(271 , 316, 230 , 17);
       date.setForeground(Color.WHITE);
       date.setFont(new Font("Tahoma" , Font.BOLD , 17));
       panel.add(date);

       JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite .setBounds(35 , 359, 200 , 17);
        labelDeposite .setForeground(Color.WHITE);
        labelDeposite .setFont(new Font("Tahoma" , Font.BOLD , 17));
       panel.add(labelDeposite );

       textlabelDeposite = new JTextField();
       textlabelDeposite.setBounds(271 , 359 ,150 , 20);
       textlabelDeposite.setBackground(Color.WHITE);
       textlabelDeposite.setForeground(Color.BLACK);
       textlabelDeposite.setFont(new Font("Tahoma" , Font.BOLD , 17));
       panel.add(textlabelDeposite);

       add = new JButton("ADD");
       add.setBounds(100 , 430 , 120 , 30);
       add.setForeground(Color.WHITE);
       add.setBackground(Color.BLACK);
       add.addActionListener(this);
       panel.add(add);

       back = new JButton("BACK");
       back.setBounds(260 , 430 , 120 , 30);
       back.setForeground(Color.WHITE);
       back.setBackground(Color.BLACK);
       back.addActionListener(this);
       panel.add(back);







       setUndecorated(true);
        setLayout(null);
        setLocation(500 , 150);
        setSize(850 ,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){

                JDBC jdbc = new JDBC();
                String button = null;
                if (m.isSelected()){
                    button = "Male";
                } else if (f.isSelected()) {
                    button = "Female";
                }

                String s1 = (String) comboBox.getSelectedItem();
                String s2 = textFieldNumber.getText();
                String s3 = textFieldName.getText();
                String s4 = button;
                String s5 = textFieldCountry.getText();
                String s6 = c1.getSelectedItem();
                String s7 = date.getText();
                String s8 =textlabelDeposite.getText();

                try {
                    String querry = "insert into customer values('"+s1+"'  , '"+s3+"' , '"+s4+"' , '"+s5+"' , '"+s6+"'  , '"+s7+"' , '"+s8+"' ,'"+s2+"')";
                    String q1 = "update room set avialibility = 'Occupied' where room_number = "+s6;
                    jdbc.statement.executeUpdate(querry);
                    jdbc.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null , "Added Successfully");

                }catch (Exception ex){
                    ex.printStackTrace();
                }
        }
        else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
