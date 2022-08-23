package Day19;

import java.util.Comparator;

class CompareBySalary implements Comparator<EmployeeData>
{
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return (int)o1.salary-(int)o2.salary;
    }
}
