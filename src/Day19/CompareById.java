package Day19;

import java.util.Comparator;

class CompareById implements Comparator<EmployeeData>
{
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.id-o2.id;
    }
}