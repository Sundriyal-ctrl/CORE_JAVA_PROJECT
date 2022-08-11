package Day16.allInputWays;

import java.util.Scanner;

class SetDataForBuffered
{
    DataClass dataClass = new DataClass();

    void settingDataWithCla(String args[])
    {


        dataClass.id=Integer.parseInt(args[0]);

        dataClass.name= args[1];
        System.out.println("===========Command Line Argument Output================");
        System.out.println(dataClass);
    }
}
public class CommandLineArgumentDriver {
   void callingCMD(String args[])
   {
       new CommandLineArgumentDriver().callingCMD(args);
   }
}
