package jdbcDay2.StudentManupulation;

import databaseday1.MenuClass.MenuDriver;
import jdbcDay2.EmployeeManupulation.InsertQueryPreparation;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MenuDriven {
    PreparedStatement preparedStatement;

    BufferedReader bufferedReader;
    MenuDriven()
    {
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
    public void showMenu()
    {
        boolean condition=true;
        try{
            while(condition)
            {
                System.out.println("==================================================================");
                System.out.println("1) For Alter Table");
                System.out.println("2) For Only Record Who are in Third Year");
                System.out.println("3) For Record Whose Id is in range 1-10 For Record Whose Id is in range 1-10");
                System.out.println("4) For Exit");
                System.out.println("==================================================================");
                System.out.println("Enter Choose");
                switch (Integer.parseInt(bufferedReader.readLine()))
                {
                    case 1:
                        new AlterStudentTable().alterStudentAddGenderColumn(preparedStatement);
                        break;
                    case 2:
                        new FetchStudentData().fetchStudentWhoAreInTYAndHavingPercentage70(preparedStatement);
                        break;
                    case 3:
                        new FetchStudentData().fetchStudentWhoseIdInRangeOneToTen(preparedStatement);
                        break;
                    case 4:
                        condition=false;
                        break;
                    default:
                        System.out.println("Wrong Choice");
                        break;
                }
            }
        }catch(Exception exception)
        {
            Logger.getLogger("Logger   "+exception.getMessage());
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        new MenuDriven().showMenu();
    }
}
