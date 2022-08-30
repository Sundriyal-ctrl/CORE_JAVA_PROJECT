package jdbcDay2.EmployeeManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
    void updateStudentWhoseExperienceGreaterThan3Year(PreparedStatement preparedStatement, BufferedReader bufferedReader) throws SQLException, IOException {
        System.out.println("Enter Id which you want to update");
        preparedStatement.setInt(1,1000);
        preparedStatement.setInt(2,Integer.parseInt(bufferedReader.readLine()));
        preparedStatement.executeUpdate();
        System.out.println("Employee Updated Successfully");
    }
}
