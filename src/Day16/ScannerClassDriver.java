package Day16;

import java.util.Scanner;

/**
 * EXECUTE SIMPLE SCANNER EXAMPLE FOR STUDENT(ID, NAME,MARKS)
 * CASE1=>ACCEPT DATA IN NAME,ID,MARKS SEQUENCE
 * >USING nextLine() method
 * CASE2->ACCEPT DATA IN ID,MARKS,STRING SEQUENCE
 *
 * @Author anuj sundriyal
 */
class DataClass
{
    private String Name;
    private int id;
    private float marks;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public String toString()
    {
        return "Name : "+Name+"\nId : "+id+"\n Marks : "+marks;
    }

}
class ScannerInput
{
    DataClass dataClass = new DataClass();
    Scanner s = new Scanner(System.in);
    void case1AcceptData()
    {
        System.out.println("==============Take Input Case 1==============");
        System.out.println("Enter Name");
        dataClass.setName(s.nextLine());
        System.out.println("Enter Id");
        dataClass.setId(s.nextInt());
        System.out.println("Enter Marks");
        dataClass.setMarks(s.nextFloat());
        System.out.println("==============Case 1 Output===============");
        System.out.println(dataClass);

    }
    void case2AcceptData()
    {
        System.out.println("==============Take Input Case 2==============");
        System.out.println("Enter id");
        dataClass.setId(s.nextInt());
        System.out.println("Enter Marks");
        dataClass.setMarks(s.nextFloat());
        System.out.println("Enter Name");
        dataClass.setName(s.nextLine());
        System.out.println("==============Case 2 Output===============");
        System.out.println(dataClass);
    }
}
public class ScannerClassDriver {
    public static void main(String[] args) {
      ScannerInput scannerInput = new ScannerInput();
      scannerInput.case1AcceptData();
      scannerInput.case2AcceptData();
    }
}
/*
OUTPUT
==============Take Input Case 1==============
Enter Name
Anuj Sundriyal
Enter Id
12
Enter Marks
56
==============Case 1 Output===============
Name : Anuj Sundriyal
Id : 12
 Marks : 56.0
==============Take Input Case 2==============
Enter id
12
Enter Marks
45
Enter Name
==============Case 2 Output===============
Name :
Id : 12
 Marks : 45.0
 */