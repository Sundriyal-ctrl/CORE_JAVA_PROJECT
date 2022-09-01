package Dao.MainClasses;

import Dao.curdoperation.CrudOperationImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuDriven {
    void showMenu()
    {
        boolean condition=true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(condition)
        {
            System.out.println("1) For Create Database" +
                    "\n2) For Insert Data\n3) For Delete All" +
                    "\n4) For Update\n5) For Fetch Particular Data\n" +
                    "6) For Multiple Fetching\n7) For Exit");
            System.out.println("Enter Your Choice");
            try {
                switch (Integer.parseInt(bufferedReader.readLine())) {
                    case 1:
                        new CrudOperationImpl().create();
                        break;
                    case 2:
                        new CrudOperationImpl().insert();
                        break;
                    case 3:

                        System.out.println("=====================================================");
                        System.out.println("Enter Id For Deleting");
                        new CrudOperationImpl().delete(Integer.parseInt(bufferedReader.readLine()));
                        break;
                    case 4:
                        new CrudOperationImpl().update();
                        break;
                    case 5:
                        System.out.println("Enter Employee Id");
                        new CrudOperationImpl().fetchOne(Integer.parseInt(bufferedReader.readLine()));
                        break;
                    case 6:
                        new CrudOperationImpl().fetchAll();
                        break;
                    case 7:
                        condition=false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new MenuDriven().showMenu();
    }
}
