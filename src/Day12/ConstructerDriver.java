package Day12;
/**
Reinitialize the values of class
 @Author anuj sundriyal
 */
class ReInt
{
    int emp_id;

    @Override
    public String toString() {
        return "ReInt{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_sal=" + emp_sal +
                '}';
    }

    String emp_name;
    String emp_address;
    float emp_sal;
    public ReInt(int emp_id, String emp_name, String emp_address, float emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_sal = emp_sal;
    }



}
public class ConstructerDriver {
    public static void main(String[] args) {
     ReInt reInt = new ReInt(1,"Anuj","Uttarakhand",12342.4f);
        System.out.println(reInt);

    }
}
/*
OUTPUT
ReInt{emp_id=1, emp_name='Anuj', emp_address='Uttarakhand', emp_sal=12342.4}
 */
