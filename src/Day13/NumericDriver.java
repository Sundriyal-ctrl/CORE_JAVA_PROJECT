package Day13;

import java.util.Locale;

/**
 try to add Numeric data in String Data type then handle this exception
@Author anuj sundriyal
 */
class NumericValueHandler
{
    //this method throw number format exception and default exception is handle
    void GetValue(String data)
    {
        int a = Integer.parseInt(data);

        System.out.println(a);
    }
    void GetDisplay(String data)
    {
        try {
            int a = Integer.parseInt(data);
            System.out.println(a);
        }catch(Exception e)
        {
            System.out.println("Exception raise in GetDisplay "+e.getMessage());
        }
    }
}
public class NumericDriver {
    public static void main(String[] args) {
        NumericValueHandler numericValueHandler = new NumericValueHandler();
        System.out.println("Inside Display method ");
        numericValueHandler.GetDisplay("anuj");
        System.out.println("Inside  Get method ");
        numericValueHandler.GetValue("anuj");

    }
}
/*
OUTPUT
Inside Display method
Exception raise in GetDisplay For input string: "anuj"
Inside  Get method
Exception in thread "main" java.lang.NumberFormatException: For input string: "anuj"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Day13.NumericValueHandler.GetValue(NumericDriver.java:14)
	at Day13.NumericDriver.main(NumericDriver.java:35)
 */
