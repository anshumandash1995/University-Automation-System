
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anant
 */

public class connectionClass {
        Connection connection;
        Statement statement;
        ResultSet resultSet;
    public connectionClass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/kiit_portal", "root", "");
            statement=connection.createStatement();
            System.out.println("Connection ok");
        }catch(Exception message){
            System.out.println(message);
        }
    }
}


