package Day19;
import java.util.HashMap;



/**
 * when we have hashmap and suppose on the name bases we have object o1 and o2 having same
 * String value ="Anuj"
 * What will be the size of Hashmap
 *
 * &#064;Author  anuj sundriyal
 */
class Student
{
    int id;
    String name;

    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class CheckSizeOfHashMap
{
    HashMap<Student,String> h;
    Student student ;
    void sizeChecker()
    {


        student = new Student(10,"Anuj");
        student.id=10;
        student.name="Anuj";
       h = new HashMap<>();
       h.put(student,"Anuj");
       student= new Student(20,"Anuj");
       h.put(student,"Anuj");
        System.out.println(h);

    }
}
public class HashMapSize {
    public static void main(String[] args) {
      new CheckSizeOfHashMap().sizeChecker();
    }
}

/*
OUTPUT
Size of Hashmap is 2
 */