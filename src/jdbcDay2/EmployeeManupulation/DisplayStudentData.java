package jdbcDay2.EmployeeManupulation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayStudentData {
    public void displayStudent(PreparedStatement preparedStatement,int id) throws SQLException {
        System.out.println("=========================Employeee Record==============================");
        preparedStatement.setInt(1,id);
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(resultSet.getInt(1)+"     "+resultSet.getString(2)
            +"    "+resultSet.getString(3)+"    "+resultSet.getDate(4)+"    "+
                    resultSet.getInt(5)+"     "+resultSet.getFloat(6)+"    "+
                    resultSet.getString(7));
        }
    }
    public void displayStudents(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("=========================Employeee Record==============================");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(resultSet.getInt(1)+"     "+resultSet.getString(2)
                    +"    "+resultSet.getString(3)+"    "+resultSet.getDate(4)+"    "+
                    resultSet.getInt(5)+"     "+resultSet.getFloat(6)+"    "+
                    resultSet.getString(7));
        }
    }
    public void displayStudentWhoIsFromPuneAndSalaryIs2000(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("=========================Employeee Record==============================");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(resultSet.getInt(1)+"     "+resultSet.getString(2)
                    +"    "+resultSet.getString(3)+"    "+resultSet.getDate(4)+"    "+
                    resultSet.getInt(5)+"     "+resultSet.getFloat(6)+"    "+
                    resultSet.getString(7));
        }
    }
}
