package databaseday1.Connection;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMaker {
    public Connection getConnection(String DatabaseName)throws SQLException
    {
        Connection con= DriverManager.getConnection(ConnectionDetails.url+"/"+ DatabaseName,ConnectionDetails.userName,ConnectionDetails.Password);
        return con;
    }
}
