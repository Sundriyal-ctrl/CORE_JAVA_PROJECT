package Day14;


public class InsufficientBalanceException  extends Exception
{
    InsufficientBalanceException ()
    {
        super();
    }
    InsufficientBalanceException (String exp)
    {
        super(exp);
    }
    InsufficientBalanceException (Throwable e , String exp)
    {
        super(exp,e);
    }
    InsufficientBalanceException (Throwable e)
    {
        super(e);
    }
    public String toString()
    {
        String s = getClass().getName();
        String message = "Insufficient Amount Exception";
        return (message != null) ? (s + ": " + message) : s;
    }
    public String  getMessage()
    {
        return "Insufficient Amount Exception";
    }
    public void  printStackTrace()
    {
        printStackTrace(System.err);
    }
}