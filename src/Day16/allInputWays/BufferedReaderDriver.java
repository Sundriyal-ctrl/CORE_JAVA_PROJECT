package Day16.allInputWays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class BufferedInputData
{
    DataClass dataClass = new DataClass();
    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    void settingDataWithScanner()
    {
        try {
            System.out.println("================Enter Data with Buffered Class================");
            System.out.println("Enter Id");
            dataClass.id = Integer.parseInt(s.readLine());
            System.out.println("Enter Name");
            dataClass.name = s.readLine();
            System.out.println("===========Buffered Output================");
            System.out.println(dataClass);
        }catch(Exception e)
        {

        }
    }
}
public class BufferedReaderDriver {
    void settingDataWithScanner()
    {
        new BufferedInputData().settingDataWithScanner();
    }
}
