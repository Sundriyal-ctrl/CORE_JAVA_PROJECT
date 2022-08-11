package Day16.allInputWays;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
/**
 * WRITE A PROGRAM FOR ACCEPTING DETAILS (acceptDetails0) OF AN EMPLOYEE AND
 * DISPLAY ALL DETAILS(displayDetails(0)
 * USE ALL 4 WAYS
 * =>CREATE SEPARATE FILES FOR EVERY
 * WAY(SCANNER,BUFFEREDREADER,CONSOLE,CLI)
 */

public class MainInputDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ByteArrayInputStream b;

        System.out.println("Enter Condition\n1)For Scanner\n2)For Buffered\n3)Command Line Argument\n4 for exit\n");
        while(true)
        {
            System.out.println("Enter Choice");
            int a = scanner.nextInt();
            switch(a)
            {
                case 1:
                    new ScannerInputDriver().callingMainMethod();
                    break;
                case 2:
                    new BufferedReaderDriver().settingDataWithScanner();
                    break;
                case 3:
                    new  CommandLineArgumentDriver().callingCMD(args);
                    break;
                case 4:
                    new ConsoleDriver().consoleCallingMethod();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
/**
 * Enter Condition
 * 1)For Scanner
 * 2)For Buffered
 * 3)Command Line Argument
 * 4 for exit
 *
 * Enter Choice
 * 1
 * ================Enter Data with Scanner Class================
 * Enter Id
 * 23
 * Enter Name
 * Anuj Sundriyal
 * ===========Scanner Output================
 * Id : 23
 * Name : Anuj Sundriyal
 * Enter Choice
 * 2
 * ================Enter Data with Buffered Class================
 * Enter Id
 * 56
 * Enter Name
 * Sundriyal
 * ===========Buffered Output================
 * Id : 56
 * Name : Sundriyal
 * Enter Choice
 *
 *
 */
