package Day16.allInputWays;

import java.io.Console;

class ConsoleInputClass
{
    DataClass dataClass = new DataClass();
    void enterConsole()
    {
        Console c = System.console();
        dataClass.id=Integer.parseInt(c.readLine());

        dataClass.name= c.readLine();
        System.out.println("===========Console Output================");
        System.out.println(dataClass);
    }
}
public class ConsoleDriver {
   void consoleCallingMethod()
   {
       new ConsoleInputClass().enterConsole();
   }
}
