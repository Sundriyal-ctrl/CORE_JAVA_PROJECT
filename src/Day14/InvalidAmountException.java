package Day14;

public class InvalidAmountException extends Exception
{
    InvalidAmountException()
    {
        super();
    }
    InvalidAmountException(String exp)
    {
        super(exp);
    }
    InvalidAmountException(Throwable e , String exp)
    {
        super(exp,e);
    }
    InvalidAmountException(Throwable e)
    {
        super(e);
    }
    public String toString()
    {
        String s = getClass().getName();
        String message = "Invalid Amount Exception";
        return (message != null) ? (s + ": " + message) : s;
    }
    public String  getMessage()
    {
        return "Amount is invalid More than original Amount";
    }
    public void  printStackTrace()
    {
        printStackTrace(System.err);
    }
}
