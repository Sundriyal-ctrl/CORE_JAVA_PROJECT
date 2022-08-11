package Day16.allInputWays;

import sun.print.resources.serviceui_zh_TW;

import java.util.Scanner;

/**
 * WRITE A PROGRAM FOR ACCEPTING DETAILS (acceptDetails0) OF AN EMPLOYEE AND
 * DISPLAY ALL DETAILS(displayDetails(0)
 * USE ALL 4 WAYS
 * =>CREATE SEPARATE FILES FOR EVERY
 * WAY(SCANNER,BUFFEREDREADER,CONSOLE,CLI)
 */

class SetData
{
    DataClass dataClass = new DataClass();
    Scanner s = new Scanner(System.in);
    void settingDataWithScanner()
    {
        System.out.println("================Enter Data with Scanner Class================");
        System.out.println("Enter Id");
        dataClass.id=Integer.parseInt(s.nextLine());
        System.out.println("Enter Name");
        dataClass.name= s.nextLine();
        System.out.println("===========Scanner Output================");
        System.out.println(dataClass);
    }
}
public class ScannerInputDriver {
    void callingMainMethod()
    {
      new SetData().settingDataWithScanner();
    }

}
