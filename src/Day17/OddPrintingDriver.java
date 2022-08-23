package Day17;

/**
 * use the runnable interface to convert the following class into a thread. you want the thread to print all
 * the odd numbers u to its bound
 *
 * @Author anuj sundriyal
 */

class PrintOddNumber implements  Runnable
{
    //print all odd number from 0 to 10
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            if(i%2!=0)
                System.out.println(i+" is a Odd number");
        }
    }
}
public class OddPrintingDriver {
    public static void main(String[] args) {
        PrintOddNumber printOddNumber = new PrintOddNumber();
        Thread thread = new Thread(printOddNumber);
        thread.start();
    }
}
/*
OUTPUT

1 is a Odd number
3 is a Odd number
5 is a Odd number
7 is a Odd number
9 is a Odd number
 */
