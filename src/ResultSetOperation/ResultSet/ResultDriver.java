package ResultSetOperation.ResultSet;

/**
 * update table data through resultset
 *
 * @author anuj sundriyal
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class ResultDriver {
    void updateOperationThroughResultSet() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statement.executeQuery("select *from teacher");
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"    "+resultSet.getString(2)+"    "+resultSet.getString(3));

            resultSet.absolute(1);
            resultSet.updateString(2,"Shailesh");
            resultSet.updateString(3,"Physics Teacher");
            resultSet.updateRow();
        System.out.println(resultSet.getInt(1)+"    "+resultSet.getString(2)+"    "+resultSet.getString(3));


    }

    public static void main(String[] args) throws SQLException {
        new  ResultDriver().updateOperationThroughResultSet();
    }
}
/*
OUTPUT
1    Anuj    Maths Teacher
1    Shailesh    Physics Teacher
 */