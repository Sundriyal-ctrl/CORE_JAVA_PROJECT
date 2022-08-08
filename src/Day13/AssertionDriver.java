package Day13;

/**
 * use of assert
 * @Author anuj sundriyal
 */
class AssertClass
{
    void show(int a)
    {
        assert a<18:"Age less than 18";
        System.out.println("Age is correct "+a);
    }
}
public class AssertionDriver {
    public static void main(String[] args) {
        AssertClass assertClass = new AssertClass();
        assertClass.show(12);
    }
}
/*
OUTPUT
Age is correct 12
 */