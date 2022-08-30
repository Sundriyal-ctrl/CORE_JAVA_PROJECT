package databaseday1.BeanClass;

import databaseday1.anotations.ColumnName;
import databaseday1.anotations.IdName;
import databaseday1.anotations.TableName;

@TableName(TableName = "KuchBhii")
public class Employee
{
    @IdName(id = "Id")
    public  int id;

    @ColumnName(ColName = "Name")
    public String name;

    public String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
