package Day7;
import java.util.Scanner;
class Employee
{
    //static because for all employee Company name is same
    final static String CompanyName = "Coditas";
    String EmpName,Position,salary;
    Address a;
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpName='" + EmpName + '\'' +
                ", Position='" + Position + '\'' +
                ", salary='" + salary + '\'' +
                ", a=" + a +
                '}';
    }

   //Address Nested class which hold all the address attribute like city  area house no.
    class Address
    {

        String city , area, houseNo;
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", area='" + area + '\'' +
                    ", houseNo='" + houseNo + '\'' +
                    '}';
        }


    }

}
public class TestEmployee {
    public void displayEmployeeDetail(Employee[] e)
    {
        for (int i=0;i<e.length;i++)
        {
            System.out.println("========================Employee "+(i+1)+" Details======================");
            System.out.println(e[i]);
        }
    }
    public static void takeInput(Employee employeeArray[],Employee employees,Employee.Address address,Scanner s)
    {
        for(int i=0;i<employeeArray.length;i++)
        {
            employees = new Employee();
            address = employees.new Address();
            System.out.println("Enter Employee "+(i+1)+" Name");
            employees.setEmpName(s.next());
            System.out.println("Enter Employee "+(i+1)+" House Number");
            address.setHouseNo(s.next());
            System.out.println("Enter Employee "+(i+1)+" City");
            address.setCity(s.next());
            System.out.println("Enter Employee "+(i+1)+" Area");
            address.setArea(s.next());
            System.out.println("Enter Employee "+(i+1)+" Position");
            employees.setPosition(s.next());
            System.out.println("Enter Employee "+(i+1)+" Salary");
            employees.setSalary(s.next());
            employees.setA(address);
            employeeArray[i]=employees;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee employeeArray[]=new Employee[2];
        Employee employees=null;
        Employee.Address address =null;
        takeInput(employeeArray,employees,address,s);

        new TestEmployee().displayEmployeeDetail(employeeArray);
    }
}
