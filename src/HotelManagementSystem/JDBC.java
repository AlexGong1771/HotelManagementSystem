package HotelManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {
    Connection connection;
    Statement statement;

    public JDBC() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelSys", "root", "gongalschi");
            statement = connection.createStatement();
            if(connection != null){
                System.out.println("Conection successfully to database");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
