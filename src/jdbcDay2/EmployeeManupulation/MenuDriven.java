package jdbcDay2.EmployeeManupulation;

import databaseday1.MenuClass.MenuDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MenuDriven {
    PreparedStatement preparedStatement;
    Connection connection;
    BufferedReader bufferedReader;
    MenuDriven()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
            bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        }catch(SQLException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
    void showMenu()
    {
        boolean condition=true;
        try{
             while(condition)
             {
                 System.out.println("==================================================================");
                 System.out.println("1) For Add Student");
                 System.out.println("2) For Display Specific Student");
                 System.out.println("3) For Display All Record");
                 System.out.println("4) For Alter City");
                 System.out.println("5) For Display Those who is from Pune and and Salary is Greater Than 20000");
                 System.out.println("6) For Update Student whose experience is More Than 3 Year");
                 System.out.println("7) For Delete Those who left Organization");
                 System.out.println("8) For Exit");
                 System.out.println("==================================================================");
                 System.out.println("Enter Choose");
                 switch (Integer.parseInt(bufferedReader.readLine()))
                 {
                     case 1:
                          new InsertQueryPreparation().PrepareQueryForInsert(preparedStatement,connection,bufferedReader);
                          break;
                     case 2:
                         System.out.println("Enter Employee Id");
                         int id=Integer.parseInt(bufferedReader.readLine());
                         new InsertQueryPreparation().displayEmployeeOne(preparedStatement,id,connection);
                         break;
                     case 3:
                         new InsertQueryPreparation().displayMultiple(preparedStatement,connection);
                         break;
                     case 4:
                         new InsertQueryPreparation().alterEmployeeWithCity(preparedStatement,connection);
                         break;
                     case 5:
                         new InsertQueryPreparation().displayEmployeeWhoAreFromPuneAndSalaryGreaterThan20000(preparedStatement,connection);
                         break;
                     case 6:
                         new InsertQueryPreparation().updateEmployeeWhoseExperienceIsGreaterThan3Year(preparedStatement,connection);
                         break;
                     case 7:
                         new InsertQueryPreparation().deleteEmployeeWhoLeftOrganization(preparedStatement,connection);
                         break;
                     case 8:
                         condition=false;
                         break;
                     default:
                         System.out.println("Wrong Choice");
                 }
             }
        }catch(Exception exception)
        {
            Logger.getLogger("Logger   "+exception.getMessage());
            System.out.println(exception.getMessage());
        }
    }
}
