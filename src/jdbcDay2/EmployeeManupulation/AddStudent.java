package jdbcDay2.EmployeeManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {
    void addStudentData(PreparedStatement preparedStatement, EmployeeData employeeData, BufferedReader bufferedReader) throws IOException, SQLException {
        System.out.println("Enter id");
        employeeData.setId(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Student Name");
        employeeData.setName(bufferedReader.readLine());
        System.out.println("Enter Designation");
        employeeData.setDesignation(bufferedReader.readLine());
        System.out.println("Enter dateofJoining example 1999-07-12");
        String doj=bufferedReader.readLine();
        employeeData.setDateOfJoining(Date.valueOf(doj));
        System.out.println("Enter Experience");
        employeeData.setExperience(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Employee Salary");
        employeeData.setSalary(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Status example working or left");
        employeeData.setStatus(bufferedReader.readLine());
        preparedStatement.setInt(1,employeeData.getId());
        preparedStatement.setString(2,employeeData.getName());
        preparedStatement.setString(3,employeeData.getDesignation());
        preparedStatement.setDate(4,Date.valueOf(employeeData.getDateOfJoining().toString()));
        preparedStatement.setInt(5,employeeData.getExperience());
        preparedStatement.setFloat(6,employeeData.getSalary());
        preparedStatement.setString(7,employeeData.getStatus());
        preparedStatement.executeUpdate();
        System.out.println("Employee Inserted Successfully");
    }
}
