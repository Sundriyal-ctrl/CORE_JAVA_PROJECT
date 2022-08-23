package Day19;

public class EmployeeData
{
    int id;
    String name;
    float salary;

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "[ ID : "+id+" Name : "+name+"  Salary : "+salary+"]";
    }
}
