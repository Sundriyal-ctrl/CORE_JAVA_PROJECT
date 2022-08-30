package databaseday1.MenuClass;

import databaseday1.Connection.ConnectionMaker;
import databaseday1.createdatabase.CreateTable;
import databaseday1.insertdata.DataInsertion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuDriver {
    public void showMenu()
    {
        boolean condition=true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(condition!=false)
        {
            System.out.println("1) For Create Table");
            System.out.println("2) For Insert Data");
            System.out.println("3) For Update Data");
            System.out.println("4) For Delete Data");
            System.out.println("5) For Delete Table");
            System.out.println("Enter Operation Number Which you want to perform");
            try {
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch(choice)
                {
                    case 1:
                        CreateTable.getInstance().MakeTable();
                        System.out.println("Table Created Successfully");
                        break;
                    case 2:
                         new DataInsertion().insertDataIntoDatabase(new ConnectionMaker()
                         ,"1","'Anuj'");
                         break;
                    case 3:
                        condition=false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

            }catch(Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new MenuDriver().showMenu();
    }
}
