package Day11;
import java.lang.reflect.Field;
/**
This is show singleton design pattern with eager intilization because because is already created and project
and static is created once
 */
 class A
{
    private static A a = new A();
    private A(){}
    public static A getInstance()
    {
        return a;
    }
}
/*
this B is the example of lazy intilization object is created on demand
 */
class B
{
   private static B b;
   private B(){}
   public static B getInstance()
   {
       if(b==null)
           b= new B();
       return b;
   }
}
public class FinalizedRunning {
    public static void main(String args[]) {
        System.out.println(A.getInstance());
        System.out.println(A.getInstance());
    }
}
