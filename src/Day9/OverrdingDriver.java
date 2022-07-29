package Day9;

/**
 * Practically prove, After changing the return type, overriding happens or not?
 * @Author Anuj Sundriyal
 */
class GrandFather
{
    static Object getObject(){
        return new GrandFather();
    }
    public void show(){}
}
class Parent extends  GrandFather
{
    static Parent getObject()
    {
        return new Parent();
    }
    public void show()
    {
        System.out.println("Hey i am Parent Class Object");
    }

}
class Child extends GrandFather
{
    static Child getObject()
    {
        return new Child();
    }
    public void show()
    {
        System.out.println("Hey i am Child Class");
    }
}
public class OverrdingDriver {
    public static void main(String[] args) {
      GrandFather g=null;
      g = Parent.getObject();
      g.show();
      g = Child.getObject();
      g.show();
    }
}

/*
OUTPUT
Hey i am Parent Class Object
Hey i am Child Class
 */