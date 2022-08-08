package Day13;

/**
 * use of assert
 * @Author anuj sundriyal
 */

public class AssertionDriver {
    public static void main(String[] args) {
        int a=90;
        assert a<18:"Age less than 18";
        System.out.println("Age is correct "+a);
    }
}
/*
OUTPUT
Exception in thread "main" java.lang.AssertionError: Age less than 18
	at Day13.AssertionDriver.main(AssertionDriver.java:11)
 */