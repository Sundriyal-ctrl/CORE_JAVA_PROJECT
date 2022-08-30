package jdbcDay2.EmployeeManupulation;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterTable {
    public void AlterStudentTable(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.execute();
        System.out.println("Table Alter Successfully");
    }
}
