package Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class CsvToExcelConverter
{
    void csvToExcel()
    {
        try{
        BufferedReader csvfile = new BufferedReader(new FileReader("Data.csv"));

        BufferedWriter excelfile = new BufferedWriter(new FileWriter("excelData.xls"));
        String s =null;
        //fetch csv file data and insert data into excel file
        while((s=csvfile.readLine())!=null)
        {
            excelfile.write(s);
            excelfile.newLine();
        }
        System.out.println("============excel file data==================");
        //now fetch data from excel

        csvfile.close();
        excelfile.close();

        } catch(Exception e) {
}
    }
}
public class CsvToExcelDriver {
    public static void main(String[] args) {
        CsvToExcelConverter csvToExcelConverter = new CsvToExcelConverter();
        csvToExcelConverter.csvToExcel();
    }

}
