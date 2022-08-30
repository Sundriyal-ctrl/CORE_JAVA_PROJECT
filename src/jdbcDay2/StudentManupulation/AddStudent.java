package jdbcDay2.StudentManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {
    public void addStudentData(PreparedStatement preparedStatement, BufferedReader bufferedReader) throws IOException, SQLException {
        preparedStatement=ConnectionMaker.getConnectionInstance().
                prepareStatement("insert into Student(id,name,year,percentage,city)values(?,?,?,?,?)");
        System.out.println("Enter Id");
        preparedStatement.setInt(1,Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Name");
        preparedStatement.setString(2,bufferedReader.readLine());
        System.out.println("Enter Year");
        preparedStatement.setInt(3,Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter percentage");
        preparedStatement.setInt(4,Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter city");
        preparedStatement.setString(2,bufferedReader.readLine());
        System.out.println("Row Inserted Successfully");
    }
}
