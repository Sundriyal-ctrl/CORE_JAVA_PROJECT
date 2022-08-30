package jdk8Topics.objectClass;

public class ObjectClassMethodUsedMenu {
    public static void main(String[] args)throws Exception {
        useObjectClassMethods useObjectClassMethods = new useObjectClassMethods("Java");
        useObjectClassMethods useObjectClassMethods1 = new useObjectClassMethods("Python");
        System.out.println("========Check two object equals or not==========");
        System.out.println(useObjectClassMethods.equals(useObjectClassMethods1));
        System.out.println("============Object Cloning================");
        useObjectClassMethods1=(useObjectClassMethods) useObjectClassMethods.clone();
        System.out.println("==============print Hashcode====================");
        System.out.println(useObjectClassMethods.hashCode());
        System.out.println("==============Overding ToString=================");
        System.out.println(useObjectClassMethods);
        System.out.println("============Finalize is running================");
        useObjectClassMethods.finalize();


    }
}
/*
OUTPUT

========Check two object equals or not==========
true
============Object Cloning================
==============print Hashcode====================
2147483647
==============Overding ToString=================
Java
============Finalize is running================
Hello i am finalize
 */