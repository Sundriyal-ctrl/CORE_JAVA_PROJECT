package databaseday1.MenuClass;

public class Example {
    void showExample()
    {
        System.out.println("@TableName(TableName = \"EmployeeDetail1\")\n" +
                "public class Employee\n" +
                "{\n" +
                "    @ColumnName(ColName = \"Idd\")\n" +
                "    public  int id;\n" +
                "\n" +
                "    @ColumnName(ColName = \"Name\")\n" +
                "    public String name;\n" +
                "    @ColumnName(ColName = \"Address\")\n" +
                "    public String address;" +
                "\n}");
    }
}
