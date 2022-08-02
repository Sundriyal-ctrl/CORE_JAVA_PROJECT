package Day11;

/**
 * 1)Chaining Constructer
 * @Author Anuj Sundriyal
 */
class ConstructorChaining
{
    ConstructorChaining()
    {
        this(1,"Anuj");
        System.out.println("Hello i am default constructor");
    }
    ConstructorChaining(int a,String name)
    {
        this("Anuj");
        System.out.println("Hello i am 2 parameter Constructer "+a+"   "+name);
    }
    ConstructorChaining(String name)
    {
        System.out.println("Hello i am one parameter Constructor "+name);
    }
}
public class ConstructorDriver {
    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
/*
OUTPUT
Hello i am one parameter Constructor Anuj
Hello i am 2 parameter Constructer 1   Anuj
Hello i am default constructor
 */