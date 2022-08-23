package Day19;

import java.util.Comparator;

public class CompareByName implements Comparator<EmployeeData>
{
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.name.compareTo(o2.name);
    }
}
