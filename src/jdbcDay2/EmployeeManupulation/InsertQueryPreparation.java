package jdbcDay2.EmployeeManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueryPreparation {
    public void PrepareQueryForInsert(PreparedStatement preparedStatement, Connection connection, BufferedReader bufferedReader) throws SQLException, IOException {
        preparedStatement=connection.prepareStatement("insert into Employee(id,name,designation," +
                "dateOfJoining,experience,salary,status)values(?,?,?,?,?,?,?)");
        EmployeeData employeeData= new EmployeeData();
        new AddStudent().addStudentData(preparedStatement,employeeData,bufferedReader);
    }
    public void displayEmployeeOne(PreparedStatement preparedStatement,int id,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("select *from Employee where id=?");
        new DisplayStudentData().displayStudent(preparedStatement,id);
    }
    public void displayMultiple(PreparedStatement preparedStatement,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("select *from Employee");
        new DisplayStudentData().displayStudents(preparedStatement);

    }
    public void displayEmployeeWhoAreFromPuneAndSalaryGreaterThan20000(PreparedStatement preparedStatement,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("select *from Employee where city='Pune' and salary>20000");
        new DisplayStudentData().displayStudentWhoIsFromPuneAndSalaryIs2000(preparedStatement);
    }
    public void alterEmployeeWithCity(PreparedStatement preparedStatement,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("Alter Table Employee Add city varchar(233)");
        new AlterTable().AlterStudentTable(preparedStatement);
    }
    public  void updateEmployeeWhoseExperienceIsGreaterThan3Year(PreparedStatement preparedStatement,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("Update Employee set Salary=Salary+1000 where experience >3");
       new AlterTable().AlterStudentTable(preparedStatement);
    }

    public void deleteEmployeeWhoLeftOrganization(PreparedStatement preparedStatement,Connection connection) throws SQLException {
        preparedStatement=connection.prepareStatement("Delete from Employee where status='left'");
        new DeleteStudent().deleteStudentWhoLeftOrganization(preparedStatement);
    }
}
