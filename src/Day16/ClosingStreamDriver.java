package Day16;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Closing Streams is important or not? Explain by writing code
 *
 * @Author anuj sundriyal
 */
public class ClosingStreamDriver {
    void withOutClosingStreamProblem()
    {
        try
        {
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("Hello anuj sundriyal");
            FileReader fileReader = new FileReader("myfile.txt");
            int a;
            while((a=fileReader.read())!=-1)
            {
                System.out.print((char)a);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    void withClosingStreamProblem()
    {
        try
        {
            FileWriter fileWriter = new FileWriter("myfile.txt");

            fileWriter.write("Hello anuj sundriyal");
            fileWriter.close();
            FileReader fileReader = new FileReader("myfile.txt");
            int a;
            while((a=fileReader.read())!=-1)
            {
                System.out.print((char)a);
            }

            fileReader.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
      ClosingStreamDriver closingStreamDriver = new ClosingStreamDriver();
        System.out.println("============Without Closing===============");
      closingStreamDriver.withOutClosingStreamProblem();
        System.out.println("============With closing==================");
      closingStreamDriver.withClosingStreamProblem();

    }
}
/*
OUTPUT
============Without Closing===============
============With closing==================
Hello anuj sundriyal
 */