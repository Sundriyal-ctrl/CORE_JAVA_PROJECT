package jdk8Topics.objectClass;

import java.util.ArrayList;

public class useObjectClassMethods {
    String name;
    useObjectClassMethods()
    {}

    useObjectClassMethods(String name)
    {
        this.name=name;
    }
    //return hashcode value of class
    public int hashCode()
    {
       return Integer.MAX_VALUE;
    }

    public String toString()
    {
        return name;
    }
    //we can't override method getClass becauase getClass method is final inside Object Class
//    public Object getClass()
//    {
//        return null;
//    }

    //this equals method return false if object are same other return true
    public boolean equals(useObjectClassMethods obj)
    {
        if(obj!=this)
            return true;
        return false;
    }
    protected Object clone()throws CloneNotSupportedException
    {
      return new useObjectClassMethods();
    }
    protected void finalize()
    {
        System.out.println("Hello i am finalize");
    }
}
