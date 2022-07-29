package Day8;

import java.util.Random;

/**
 *Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function display Label() in this
 * class to print Name and address of the company.
 * Derive Tablet, Syrup and Ointment classes from the Medicine class.
 * Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine.
 * [2:23 PM] For example, in case of tablets, it could be "store in a cool dry place", in case of
 * ointments it could be "for external use only" etc. Create a class TestMedicine. Write main function to do the following:
 * Declare an array of Medicine references of size 10 Create a medicine object of the type as decided by a randomly generated integer
 * in the range 1 to 3.
 * Refer Java API Documentation to find out random generation features. Check the polymorphic behavior of the displayLabel() method
 */
abstract class Medicine
{
  abstract void displayLabel(String Name,String Address);
}
class Tablet extends Medicine{
    public void displayLabel(String Name,String Address)
    {
        System.out.println("Name : "+Name+"  Address : "+Address);
    }
}
class Syrup extends Medicine
{
    public void displayLabel(String Name,String Address)
    {
        System.out.println("Name : "+Name+"  Address : "+Address);
    }
}
//class Ointment extends Medicine
//{
//    public void displayLabel()
//    {
//        String Name="Ointm"
//        System.out.println("Name : "+Name+"  Address : "+Address);
//    }
//}
//public class MedicineDriver {
//    public void MedicineDetails()
//    {
//        Medicine medicine[] = new Medicine[10];
//        Random r= new Random();
//        for (int i=0;i<10;i++)
//        {
//            switch (r.nextInt(3))
//            {
//                case 0:
//                    medicine[i] = new Tablet();
//                    break;
//                case 1:
//                    medicine[i] = new Ointment();
//                    break;
//                case 2:
//                    medicine[i] = new Syrup();
//
//            }
//        }
//        for (int i = 0 ; i < medicine.length ; i++ )
//        {
//            medicine[i].displayLabel();
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
