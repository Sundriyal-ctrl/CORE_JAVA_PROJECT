package jdk8Topics.StreamOperationMenu;

import javax.naming.Name;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee
{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return age;
    }

    public void setSalary(int age) {
        this.age = age;
    }
   public String toString()
   {
       return "["+id+" "+name+" "+age+"]";
   }


}
public class StreamOperation {
    void StreamMethodUse()
    {
        String list="Anuj Sun Rej Akash Usman Aditya";
        long count= Arrays.stream(list.split(" ")).filter(size->size.length()>3).count();
        System.out.println("=======Number of String Whose Length is greater than 3 ======\n"+count);



        String NameStartWithA= Arrays.stream(list.split(" ")).filter(name->name.startsWith("A")).collect(Collectors.joining(" "));
        System.out.println("============String where all name start with A==============");
        System.out.println(NameStartWithA);




        String Names="Anuj Ro Hello A Akash Jo";
        System.out.println("===========Hold only string whose length is greater than 2============");
        List a =Arrays.stream(Names.split(" ")).filter(name->name.length()>2).collect(Collectors.toList());
        System.out.println(a);




        System.out.println("====Convert String to Upper Case and Join it Again================");
        String kop=Arrays.stream(Names.split(" ")).map(name->name.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(kop);



        int arr[]={3,2,1,5,7,8};
        System.out.println("=============use count,min,max,average,sum=================");
        Arrays.stream(arr).forEach(value-> System.out.print(value+" "));
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        long count1=Arrays.stream(arr).count();
        int sum= Arrays.stream(arr).sum();
        double average= Arrays.stream(arr).average().getAsDouble();
        System.out.println("\nCount : "+count+"\nMax : "+max+"\nMin : "+min+"\nsum : "+sum+"\nAverage "+average);




        String list1="Anuj Sun Rej Akash Usman Aditya";
        String na= Arrays.stream(list.split(" ")).filter(size->size.length()>3).collect(Collectors.joining(" "));
        System.out.println(list1);
        System.out.println("=======String Whose Length is greater than 3 ======\n"+na);




        System.out.println("=========================================================================");
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee(10,"Java",12));
        hashSet.add(new Employee(20,"Python",31));
        hashSet.add(new Employee(13,"C-Sharp",40));
        System.out.println(hashSet);




        System.out.println("=======Details of employee whose age is greater than 30========");
        List<Employee> emp1=hashSet.stream().filter(emp->emp.getSalary()>30).collect(Collectors.toList());
        System.out.println(emp1);


        System.out.println("=====================================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str=null;
        try {
            str = scanner.nextLine();
            System.out.println(str.substring(1,str.length()));
        }catch(NullPointerException nullPointerException)
        {
            System.out.println("Do not enter null value\n Enter String again");
            str=scanner.nextLine();
            System.out.println(str.substring(1,str.length()));
        }
    }
    public static void main(String[] args) {
    new StreamOperation().StreamMethodUse();
    }
}
/*
OUTPUT
=======Number of String Whose Length is greater than 3 ======
4
============String where all name start with A==============
Anuj Akash Aditya
===========Hold only string whose length is greater than 2============
[Anuj, Hello, Akash]
====Convert String to Upper Case and Join it Again================
ANUJ,RO,HELLO,A,AKASH,JO
=============use count,min,max,average,sum=================
3 2 1 5 7 8
Count : 4
Max : 8
Min : 1
sum : 26
Average 4.333333333333333
Anuj Sun Rej Akash Usman Aditya
=======String Whose Length is greater than 3 ======
Anuj Akash Usman Aditya
=========================================================================
[[20 Python 31], [10 Java 12], [13 C-Sharp 40]]
=======Details of employee whose age is greater than 30========
[[20 Python 31], [13 C-Sharp 40]]
=====================================================================
Enter String
Java
ava
 */