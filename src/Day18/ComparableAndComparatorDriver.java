package Day18;

import java.util.*;

class Employee implements Comparator<Employee>{

    int id;
    String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.name.length()>o2.name.length())
            return 1;
        else if(o1.name.length()<o2.name.length())
            return -1;
        else
            return 0;
    }
}

class Employee2 implements Comparable<Employee2>
{
    int id;
    String name;
    long salary;
   Employee2()
   {

   }
    Employee2(int id,String name,long salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public int compareTo(Employee2 o) {
         if(o.salary<15000)
             return 1;
         else
             return 0;
    }
}
class ComparableAndComparator
{

  void performSortingOnId()
  {
      System.out.println("===========Sorting on Id===============");
      Comparable comparable = new Employee2();
      TreeSet<Employee2> treeset = new TreeSet();

      treeset.add(new Employee2(10,"Anuj",12000));
      treeset.add(new Employee2(20,"Shailesh",16000));
      treeset.add(new Employee2(21,"Akash",20000));
      Iterator<Employee2> iterator = treeset.iterator();

      while(iterator.hasNext())
      {
          Employee2 employee =iterator.next();
          System.out.println(employee.id+"  "+employee.name);
      }

  }
    //case 2 on the behave of name
  void performSortingOnName()
  {
      System.out.println("=========Sorting On Name=================");
      HashSet<Employee> hashSet = new HashSet<>();
      hashSet.add(new Employee(12,"Akash"));
      hashSet.add(new Employee(23,"Anuj"));
      hashSet.add(new Employee(90,"Elephant"));
      TreeSet<Employee> treeSet = new TreeSet(hashSet);
      Iterator<Employee> iterator = treeSet.iterator();

      while(iterator.hasNext())
      {
          Employee employee =iterator.next();
          System.out.println(employee.id+"  "+employee.name);
      }
  }
}
public class ComparableAndComparatorDriver {
    public static void main(String[] args) {
        new ComparableAndComparator().performSortingOnId();
    }
}
