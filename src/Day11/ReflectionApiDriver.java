package Day11;
/**
 * 2)use of class Class for check methods , construtor , fields and
 * 3)try to access private field of class
 * @Author Anuj Sundriyal
 */

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class ReflectionApi
{
   public int a=10;
   private int b=20;
   public String name="Anuj";
   public void show()
   {
       System.out.println("Show method");
   }
   public ReflectionApi()
    {

    }
    public ReflectionApi(int a)
    {

    }
}
public class ReflectionApiDriver {
    static void display()throws Exception
    {
        ReflectionApi reflectionApi = new ReflectionApi();
        Class c = Class.forName("Day11.ReflectionApi");
        Constructor constructor[] = c.getConstructors();
        System.out.println("===================Constructor==============");
        for (Constructor constructor1: constructor)
        {
            System.out.println(constructor1);
        }
        System.out.println("=====================Method==============");
        Method[] methods  = c.getMethods();
        for(Method method : methods)
        {
            System.out.println(method);
        }
        System.out.println("====================Field==============");
        Field field[] = c.getFields();

        for(Field f : field)
        {
            System.out.println(f+"   "+f.getModifiers());
        }
        System.out.println("===================Private Field=========");
        Field f1=c.getDeclaredField("b");
        f1.setAccessible(true);
        System.out.println(f1);

    }

    public static void main(String[] args)throws Exception {
        ReflectionApi api = new ReflectionApi();
        ReflectionApiDriver.display();
    }
}
/*
OUTPUT
===================Constructor==============
public Day11.ReflectionApi()
public Day11.ReflectionApi(int)
=====================Method==============
public void Day11.ReflectionApi.show()
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public java.lang.String java.lang.Object.toString()
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()
====================Field==============
public int Day11.ReflectionApi.a   1
public java.lang.String Day11.ReflectionApi.name   1
===================Private Field=========
private int Day11.ReflectionApi.b
 */