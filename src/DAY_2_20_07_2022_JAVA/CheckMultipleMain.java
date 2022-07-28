package DAY_2_20_07_2022_JAVA;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
//Rule 1=by default interface methods are =>public  and abstract
//Rule 2=by default interface variabale are public static final
// Rule 3 Can any interface contains  concrete
  // yes it  static and default then it possible
  //Default it is a enhancements from jdk1.8 
//  Interface uses "implements" keyword
//you can implements as many interface
//you cannot create object of interface
// once you implements an any interface you have as
abstract class Pattern
{
    abstract void nameOfPattern(String name);
}
interface a
{
    default void show()
    {
        System.out.println("Hello a");
    }

}
interface b extends a
{
    default void show()
    {
        System.out.println("Hello b");
    }
}
public class CheckMultipleMain implements b{


    public static void main(String[] args) {

       a c = new CheckMultipleMain();
       c.show();
    }


}
