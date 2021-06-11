import java.rmi.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connDB {
    public Connection conn ;
    public  connDB(){

        try {
            String url = "jdbc:mysql://localhost:3306/crud";
            String username = "root";
            String password = "";


            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
//            System.out.println("Success!!");



        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println("Loading driver...");
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded!");
//        } catch (ClassNotFoundException e) {
//            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
//        }



    
}}
