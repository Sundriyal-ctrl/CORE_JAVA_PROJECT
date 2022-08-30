package jdbcDay2.StudentManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlterStudentTable {
    void alterStudentAddGenderColumn(PreparedStatement preparedStatement) throws IOException, SQLException {
        preparedStatement=ConnectionMaker.getConnectionInstance().
                prepareStatement("alter table Student add Gender varchar(233)");
        preparedStatement.executeUpdate();
        preparedStatement=ConnectionMaker.getConnectionInstance().prepareStatement("select *from Student");
        PreparedStatement preparedStatement1 = ConnectionMaker.getConnectionInstance().prepareStatement("update" +
                " Student set Gender=? where id=?");
        ResultSet resultSet=preparedStatement.executeQuery();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(resultSet.next())
        {
            System.out.format("%14d %14s %14s %14s %14s\n",resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5));

            System.out.println("Enter Gender For Id "+resultSet.getInt(1));
            preparedStatement1.setString(1,bufferedReader.readLine());
            preparedStatement1.setInt(2,resultSet.getInt(1));
            preparedStatement1.executeUpdate();
        }
    }
}
