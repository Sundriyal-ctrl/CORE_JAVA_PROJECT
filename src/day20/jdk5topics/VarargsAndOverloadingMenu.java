package day20.jdk5topics;

/**
 * write a program for addition operation
 */
class AddtionMethodOverloading
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
class VarargsAdditionOverloading
{
    void add(int... value)
    {
        int sum=0;
        for(int getvalue : value)
        {
            sum+=getvalue;
        }
        System.out.println(sum);
    }
}
public class VarargsAndOverloadingMenu {
    public static void main(String[] args) {
        System.out.println("========Overloading of addition  Method===========");
        AddtionMethodOverloading addtionMethodOverloading = new AddtionMethodOverloading();
        addtionMethodOverloading.add(10,20);
        addtionMethodOverloading.add(30,20,40);
        System.out.println("=========Addition with the help of Varargs=========");
        VarargsAdditionOverloading varargsAdditionOverloading = new VarargsAdditionOverloading();
        varargsAdditionOverloading.add(10,20,30);
        varargsAdditionOverloading.add(30,50,20,90,87);
    }
}
/*
 OUTPUT
 ========Overloading of addition  Method===========
30
90
=========Addition with the help of Varargs=========
60
277
 */