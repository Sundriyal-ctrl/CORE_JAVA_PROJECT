package Day16.BinaryIOPrintwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * PrintWriter Use
 *
 * @Author anuj sundriyal
 */
class PrintWriterInput
{
    void printWriterUse()
    {
        Scanner s = new Scanner(System.in);
        try
        {
            PrintWriter p = new PrintWriter("print.txt");
            BufferedReader fileReader = new BufferedReader(new FileReader("print.txt"));
            System.out.println("Enter String");
            p.write(s.nextLine());
            p.close();
            System.out.println("==============OUTPUT OF PRINT WRITER==============");
            System.out.println(fileReader.readLine());

            fileReader.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class PrintWriterDriver {
    public static void main(String[] args) {
        PrintWriterInput printWriterInput = new PrintWriterInput();
        printWriterInput.printWriterUse();
    }
}
/*
OUTPUT
Enter String
Hello i am anuj sundriyal
==============OUTPUT OF PRINT WRITER==============
Hello i am anuj sundriyal

 */