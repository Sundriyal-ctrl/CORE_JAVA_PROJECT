package Day13;
class ToCast
{
    void show()
    {
        System.out.println("Hello i am show method");
    }
}
class FromCast extends ToCast
{
    void display()
    {
        System.out.println("Hello i am display method");
    }
}
public class ClassCastDriver {
    //this method throw ClassCastException
    void check()
    {
        System.out.println("From check method here exception  is not handled");
        ToCast toCast  = new ToCast();
        FromCast fromCast = (FromCast) toCast;
    }
    void display()
    {
        try
        {
            ToCast toCast  = new ToCast();
            FromCast fromCast = (FromCast) toCast;
        }catch(Exception e)
        {
            System.out.println("From display Method and exception is handled "+e.getMessage());
        }
        finally
        {
            System.out.println("After Exception in display method ");
        }
    }
    public static void main(String[] args) {
     ClassCastDriver classCastDriver = new ClassCastDriver();
     classCastDriver.display();
     classCastDriver.check();
    }
}
/*
                                               OUTPUT
From display Method and exception is handled Day13.ToCast cannot be cast to Day13.FromCast
After Exception in display method
From check method here exception  is not handled
Exception in thread "main" java.lang.ClassCastException: Day13.ToCast cannot be cast to Day13.FromCast
	at Day13.ClassCastDriver.check(ClassCastDriver.java:22)
	at Day13.ClassCastDriver.main(ClassCastDriver.java:42)

 */