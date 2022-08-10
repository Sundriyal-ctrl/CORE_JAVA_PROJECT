package Day15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Get data from two file and insert that two file data into third one and read third file data
 *
 *
 * @Author anuj sundriyal
 */

public class SequenceClass {
    SequenceInputStream addTwoFileDataInOne=null;
    FileInputStream file1 = null;
    FileInputStream file2 = null;
    FileOutputStream file1AndFile2Data = null;
    FileInputStream bufferedInputStream3 =null;

    void insertDataIntoThirdFile(String firstdata,String seconddata)
    {
        System.out.println("=================TWO FILE DATA INSERTED INTO ONE=================");

        int j;
        try {

            //this statement is used to add data in both file before fetching data from both file

            this.addDataInBothFile(firstdata,seconddata);

            file1 = new FileInputStream("firstfile1.txt");

            file2 = new FileInputStream("secondfile2.txt");

            addTwoFileDataInOne = new SequenceInputStream(file1,file2);

            file1AndFile2Data = new FileOutputStream("file3.txt");

            //get data from firstfile1.txt and secondfile2.txt and add both file data into file3

            while ((j = addTwoFileDataInOne.read()) != -1) {
                file1AndFile2Data.write(j);

            }
            //close all open file
            addTwoFileDataInOne.close();

            file1.close();

            file2.close();

            file1AndFile2Data.close();

        }catch(Exception e)
        {
            System.out.println("insert Data into third file error "+e.getMessage());
        }
    }
    void readThirdFileData()
    {

        System.out.println("=================READING TWO FILE DATA IN ONE FILE=================");

        try {

            bufferedInputStream3 = new FileInputStream("file3.txt");

            int j;
            //read data from thrid file

            while ((j =  bufferedInputStream3.read()) != -1) {
                System.out.print((char)j);
            }
            //close third file connection

            bufferedInputStream3.close();

        } catch (Exception e) {
            System.out.println("Error in reading third file "+e.getMessage());
        }
    }

    //Write Data into both file
    void addDataInBothFile(String firstdata,String seconddata)
    {
        try {


             FileOutputStream file1 = new FileOutputStream("firstfile1.txt");

             FileOutputStream file2 = new FileOutputStream("secondfile2.txt");

             file1.write(firstdata.getBytes());

             file2.write(seconddata.getBytes());

             file1.close();

             file2.close();
            } catch (Exception e) {
              System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SequenceClass sequenceClass = new SequenceClass();
        System.out.println("Enter one Alphabet for file1.txt");
        String file1data = scanner.next();
        System.out.println("Enter one Alphabet for file2.txt");
        String filedata2 = scanner.next();
        sequenceClass.insertDataIntoThirdFile(file1data+" ",filedata2+" ");
        sequenceClass.readThirdFileData();
    }
}
/*
 OUTPUT

Enter one Alphabet for file1.txt
Anuj
Enter one Alphabet for file2.txt
Sundriyal
=================TWO FILE DATA INSERTED INTO ONE=================
=================READING TWO FILE DATA IN ONE FILE=================
Anuj Sundriyal
Process finished with exit code 0
 */