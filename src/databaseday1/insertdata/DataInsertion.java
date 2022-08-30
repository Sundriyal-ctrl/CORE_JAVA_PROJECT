package databaseday1.insertdata;

import databaseday1.BeanClass.Employee;
import databaseday1.Connection.ConnectionMaker;
import databaseday1.anotations.TableName;
import databaseday1.createdatabase.CreateTable;

import java.sql.*;

public class DataInsertion {
    public void insertDataIntoDatabase(ConnectionMaker con,String... values) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        CreateTable createTable = CreateTable.getInstance();
        Employee employee = new Employee();
        Class c = employee.getClass();
        createTable.tableName= (TableName) c.getDeclaredAnnotation(TableName.class);
        String tName=createTable.tableName.TableName();
        stringBuilder.append("Insert into "+tName+"(");
        if(createTable.IdData.length()>0)
        {
            stringBuilder.append(createTable.IdData);
        }
        for(int i=0;i<createTable.ColumnName.length;i++)
        {
            if(createTable.ColumnName[i]!=null)
                stringBuilder.append(","+createTable.ColumnName[i]);
        }
        stringBuilder.append(") values(");
        for(int counter =0;counter<values.length;counter++)
        {
            stringBuilder.append(values[counter]+",");
        }
        stringBuilder.append(")");
        stringBuilder.deleteCharAt(stringBuilder.length()-2);
        Connection c1=con.getConnection("anuj");
        Statement statement = c1.createStatement();
        DatabaseMetaData databaseMetaData = c1.getMetaData();
        ResultSet resultSet = databaseMetaData.getTables(null,null,tName,null);
        if(resultSet.next()){
            statement.execute(stringBuilder.toString());
        }
        else {
            statement.execute(CreateTable.getInstance().MakeTable());
            statement.execute(stringBuilder.toString());
        }

        System.out.println(stringBuilder);

    }
}
