package Day8;

/**
 *Write a program in which you will declare an abstract class Vehicle inherits this class from
 * two classes car and truck using the method engine
 * in both display "car has good engine" and "truck has bad engine".
 * @Author Anuj Sundriyal
 */
//abstract class Vehicle with method engine and Vehicle class has 2 child class
abstract class Vechicle
{
    abstract void engine();
}
//Car class extends Vechicle class and override engine method
class Car extends Vechicle
{

    public void engine()
    {
        System.out.println("Car has Good Engine");
    }
}

class Truck extends Vechicle
{
    public void engine()
    {
        System.out.println("Truck has Bad Engine");
    }
}
public class DriverClass {
    public static void main(String[] args) {
        Vechicle vechicle;
        vechicle = new Car();
        vechicle.engine();
        vechicle = new Truck();
        vechicle.engine();
    }
}

//OUTPUT
//       Car has Good Engine
//        Truck has Bad Engine
//
//        Process finished with exit code 0