package jdbcDay2.StudentManupulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMaker {
    private static final Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private ConnectionMaker(){}

    public static Connection getConnectionInstance()
    {
        return con;
    }
}
