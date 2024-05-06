package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Stack;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","R7386@rish#");
            statement = connection.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}