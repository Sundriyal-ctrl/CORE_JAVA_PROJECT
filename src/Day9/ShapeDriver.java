package Day9;

/**
 * CREATE A CLASS NAMED SHAPE, WHICH CONTAINS ONLY SINGLE
 * METHOD,calculateArea0. THIS METHOD SHOULD HAVE "N" NUMBER OF
 * PARAMETERS FOR DIFFERENT SHAPES LIKE FOR|
 * CIRCLE,RECTANGLE, TRIANGLE
 * @Author Anuj Sundriyal
 */
class Shape
{
    void calculateArea(Object... o)
    {
        System.out.println("Shape is nothing");
    }
}
class Circle extends Shape
{
    void calculateArea(Object... o)
    {
        System.out.println("Area of Circle "+Math.PI*(int)o[0]);
    }

}
class Rectangle extends Shape{
    void calculateArea(Object... o)
    {
        System.out.println("Area of Rectangle "+(int)o[0]*(int)o[1]);
    }
}
class Triangle extends Shape
{
    void calculateArea(Object... o)
    {
        int a=(int)1/2*((int)o[0] * (int)o[1]);
        System.out.println("Area of Triangle "+a);
    }
}
public class ShapeDriver {
    public static void main(String[] args) {
        Shape s=null;
        s = new Circle();
        s.calculateArea(10);
        s = new Rectangle();
        s.calculateArea(10,20);
        s = new Triangle();
        s.calculateArea(10,20);
    }
}

/*
OUTPUT
Area of Circle 31.41592653589793
Area of Rectangle 200
Area of Triangle 0
 */