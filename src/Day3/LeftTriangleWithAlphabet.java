package Day3;

import java.util.ArrayList;
import java.util.stream.Stream;
class S
{
    int sum=0;
  void show(final int a){

      System.out.println("A class "+a);
  }

}
class B1 extends  S
{
    void show(final int a)
    {
        System.out.println("B1 class "+a);
    }
}
public class LeftTriangleWithAlphabet {
    public static void main(String args[]) {
        S s;
        s=new S();
        s.show(10);
        s=new B1();
        s.show(20);

    }
}


