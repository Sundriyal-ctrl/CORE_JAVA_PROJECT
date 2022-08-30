package jdbcDay2.EmployeeManupulation;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
    void deleteStudentWhoLeftOrganization(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.executeUpdate();
        System.out.println("Employee Deleted Successfully Who Left the Organization");
    }
}
