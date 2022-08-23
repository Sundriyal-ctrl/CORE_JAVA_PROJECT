package Day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MenuClass {
    EmployeeData employeeData =null;
    ArrayList<EmployeeData> arrayList = new ArrayList<>();
    ArrayList<EmployeeData> copyList =null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void showMenu()
    {

        boolean b=true;

        while(b)
        {
            try {

                System.out.println("========Menu=========\n1) For Add Data\n====Sorting===\n2) By ID\n" +
                        "3)By Name\n4)By Salary\n5) Show Data\n6) for exit)\n7) According to Salary\n8) Get Employee By startwith character");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice){
                    case 1:
                        this.addData();
                        copyList = new ArrayList<>();
                        copyList.addAll(arrayList);
                        break;
                    case 2:
                        System.out.println("=============Employeee Sorted By Id============");

                        Collections.sort(copyList,new CompareById());
                        this.showData(copyList);
                        break;
                    case 3:
                        System.out.println("==============Employee Sorted By Name==========");
                        Collections.sort(copyList, new CompareByName());
                        this.showData(copyList);
                        break;
                    case 4:
                        System.out.println("=============Employee Sorted By Salary==========");
                        Collections.sort(copyList, new CompareBySalary());
                        this.showData(copyList);
                        break;
                    case 5:
                        System.out.println("=======Print Original Data========");
                        this.showData(arrayList);
                        break;
                    case 6:
                        b=false;
                        break;
                    case 7:
                        System.out.println("Enter Min salary");
                        float salary = Float.parseFloat(bufferedReader.readLine());
                        List<EmployeeData> list=copyList.stream().filter(s->s.getSalary()>salary).collect(Collectors.toList());
                        this.showData(list);
                        break;
                    case 8:
                        System.out.println("Enter Alphabet Employee Name start with Alphabet");
                        char startwith=bufferedReader.readLine().charAt(0);
                        List<EmployeeData> list1=copyList.stream().filter(s->s.getName().charAt(0)==startwith)
                                .collect(Collectors.toList());
                        this.showData(list1);
                        break;
                    default:
                        System.err.println("Wrong Choice");

                }
            }catch(IOException ioException)
            {
                System.err.println(ioException.getMessage());
            }
        }

    }
    void showData(List<EmployeeData> arrayList)
    {
        System.out.println("\n");
        for (EmployeeData employeeData1 : arrayList)
        {
            System.out.println(employeeData1);
        }
        System.out.println("\n");
    }
  void addData()throws IOException
  {
      System.err.println("Enter Number of Employee You Want to add");
      int numberofemployee=Integer.parseInt(bufferedReader.readLine());
      int condition=0;
      while(condition<numberofemployee) {
          employeeData = new EmployeeData();
          System.err.println("Enter Employee Id");
          employeeData.setId(Integer.parseInt(bufferedReader.readLine()));
          System.err.println("Enter Employee Name");
          employeeData.setName(bufferedReader.readLine());
          System.err.println("Enter Employee Salary");
          employeeData.setSalary(Float.parseFloat(bufferedReader.readLine()));
          System.err.println("Employeee Added Successfully");
          arrayList.add(employeeData);
          condition++;
          System.err.println("======================================================================");
      }
  }
}
