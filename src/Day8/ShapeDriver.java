package Day8;

import java.util.Random;

/**
 * Create an abstract class shape with abstract method void area(); create 4 more classes
 * circle, cylinder, square and rectangle
 *            shape
 *      circle     cylinder
 *  square             rectangle
 * SHAPE is parent for circle and square,
 * and circle is parent for cylinder,rectangle is child
 * of square.
 *  Override the area() in all the classes Create an array of references of type shape
 *  in TestShape class and print the area of different types of shapes.
 * @Author Anuj Sundriyal
 */
abstract class Shape1
{
  abstract void area();
}
class circle extends Shape1{
    public  void area()
    {
        int radius =2;
        System.out.println(Math.PI*radius*radius);
    }
}
class square extends Shape1{
    public void area()
    {
        int side=3;
        System.out.println(side*side);
    }
}
class cylinder extends circle
{
  public void area()
  {
      int r=10,h=2;
      System.out.println(2*Math.PI*r*h);
  }
}
class rectangle extends square
{
   public void area()
   {
       int l=10,b=2;
       System.out.println(l*b);
   }
}
class A
{
    public void show(){}
}
class B extends A
{
    public void show(int a){}
}
public class ShapeDriver {

    public static void main(String[] args) {
      B b = new B();
      b.show(10);
    }
}

/*
OUTPUT
12.566370614359172
12.566370614359172
125.66370614359172
12.566370614359172
12.566370614359172
 */