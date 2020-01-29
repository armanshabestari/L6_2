package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "armansh"
                , "arman4563");
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into bank (code,name,fathersname,melicode,position,age,salary(Rial),background(Year)) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(1,22058);
        preparedStatement.setString(2,"Amir Hashemi");
        preparedStatement.setString(3,"Hamid");
        preparedStatement.setString(4,"003456432");
        preparedStatement.setString(5,"monshi");
        preparedStatement.setInt(6,33);
        preparedStatement.setDouble(7,15000000);
        preparedStatement.setInt(8,4);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
