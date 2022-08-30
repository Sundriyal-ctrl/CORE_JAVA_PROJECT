package jdbcDay2.StudentManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class FetchStudentData {
    void fetchStudentWhoAreInTYAndHavingPercentage70(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement=ConnectionMaker.getConnectionInstance().
                prepareStatement("select *from Student where year=3 && percentage>70");
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData r=resultSet.getMetaData();
        System.out.println("========================================================");
        System.out.format("%15s %15s %15s %15s %15s\n",r.getColumnName(1),r.getColumnName(2),r.getColumnName(3),r.getColumnName(4),
        r.getColumnName(5));
        while(resultSet.next())
        {
            System.out.format("%14d %14s %14d %14d %14s",resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5));
            System.out.println();
        }
    }

    void fetchStudentWhoseIdInRangeOneToTen(PreparedStatement preparedStatement) throws SQLException, IOException {
        preparedStatement=ConnectionMaker.getConnectionInstance().
                prepareStatement("select *from Student where id<=10");
        ResultSet resultSet = preparedStatement.executeQuery();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ResultSetMetaData r=resultSet.getMetaData();
        PreparedStatement preparedStatement1 = ConnectionMaker.getConnectionInstance().prepareStatement("update" +
                " Student set name=? where Gender=?");
        System.out.println("========================================================");
        System.out.format("%15s %15s %15s %15s %15s\n",r.getColumnName(1),r.getColumnName(2),r.getColumnName(3),r.getColumnName(4),
                r.getColumnName(5));
        while(resultSet.next())
        {
            //for(int i=0;i<3;i++)
              //  new AddStudent().addStudentData(preparedStatement,bufferedReader);
            if(resultSet.getString(6).equals("M"))
            {
                preparedStatement.setString(1,  "Mr."+resultSet.getString(2));
            }
            else {
                preparedStatement.setString(1,  "Ms."+resultSet.getString(2));

            }
            System.out.format("%14d %14s %14d %14d %14s\n",resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5));
        }
    }

}
