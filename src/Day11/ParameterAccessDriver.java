package Day11;
import java.lang.reflect.Method;

/**
 * 4) Use reflection api for getting parameterized method
 */
class ParameterMethod
{
    void show()
    {

    }
    public void GetData(int a)
    {
        System.out.println("Hello display method one parameter a : "+a);
    }
    public void GetData(String FirstName,String lastName)
    {
        System.out.println("Hello 2 parameter method "+FirstName+" "+lastName);
    }
}
public class ParameterAccessDriver {
    public void display()throws Exception
    {

        ParameterMethod parameterMethod = new ParameterMethod();
        Class c = Class.forName("Day11.ParameterMethod");
        Method method = c.getDeclaredMethod("GetData",new Class[]{int.class});
        method.invoke(parameterMethod,12);
        System.out.println(method);
    }

    public static void main(String[] args)throws  Exception {

        new ParameterAccessDriver().display();
    }
}
/*
OUTPUT
Hello display method one parameter a : 12
public void Day11.ParameterMethod.GetData(int)
 */