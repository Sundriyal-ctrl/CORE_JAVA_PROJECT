package Dao.Pojo;

public class EmployeeDao {
    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String toString()
   {
       System.out.println("----------------------------------");
       System.out.println("["+id+"  "+name+"]");
       System.out.println("----------------------------------");
       return "";
   }


}
