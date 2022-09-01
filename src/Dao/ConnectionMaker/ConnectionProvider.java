package Dao.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider implements ConnectionDetails{
    static Connection connection=null;
    private ConnectionProvider(){}
    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        if(connection==null) {
           Class.forName(ConnectionDetails.driver);
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
}
