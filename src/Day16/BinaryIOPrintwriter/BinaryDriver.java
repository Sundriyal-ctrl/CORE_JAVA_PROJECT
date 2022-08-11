package Day16.BinaryIOPrintwriter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Binary Input and Output
 *
 * @Author anuj sundriyal
 */
class BinaryStreamClass
{
    void BinaryRead()
    {
        System.out.println("==============Writing output=================");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("binaryinput.txt"));
            int a;
            while((a=bufferedInputStream.read())!=-1)
            {
                System.out.print((char)a);
            }
            bufferedInputStream.close();
            }
            catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
    }
    void BinaryWriting()
    {
        System.out.println("================Enter Data Into File====================");
        Scanner s= new Scanner(System.in);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("binaryinput.txt"));
            bufferedOutputStream.write(s.nextLine().getBytes());
            bufferedOutputStream.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class BinaryDriver {
    public static void main(String[] args) {
        BinaryStreamClass binaryStreamClass = new BinaryStreamClass();
        binaryStreamClass.BinaryWriting();
        binaryStreamClass.BinaryRead();
    }
}
/*
OUTPUT

================Enter Data Into File====================
Anuj Sundriyal How Are You
==============Writing output=================
Anuj Sundriyal How Are You
 */