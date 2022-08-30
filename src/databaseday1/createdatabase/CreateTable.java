package databaseday1.createdatabase;

import databaseday1.BeanClass.Employee;
import databaseday1.Connection.ConnectionMaker;
import databaseday1.anotations.ColumnName;
import databaseday1.anotations.IdName;
import databaseday1.anotations.TableName;
import databaseday1.insertdata.DataInsertion;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Statement;


public class CreateTable {
    public TableName tableName;
    public  IdName idName;
    public String ColumnName[]={};
    public String ColumnType[]={};
    static CreateTable createTable = null;
    private CreateTable(){}
    public static CreateTable getInstance()
    {
        if(createTable==null)
            createTable=new CreateTable();
        return createTable;
    }
    public String IdData="";
    public String MakeTable(){
         Employee employee = new Employee();
         Class c = employee.getClass();
         Field field[] = c.getDeclaredFields();
         tableName= (TableName) c.getDeclaredAnnotation(TableName.class);

         String tName=tableName.TableName();
         ColumnName=new String[field.length];
         ColumnType= new String[field.length];

         int counter=0;
        for(Field field1 : field)
        {
            databaseday1.anotations.ColumnName columnName= field1.getDeclaredAnnotation(ColumnName.class);
            if(columnName!=null)
            {
                ColumnName[counter]=columnName.ColName();
                String fieldType=field1.getType().getTypeName();
                if(fieldType.equals("java.lang.String"))
                ColumnType[counter]="varchar";
                else if(fieldType.equals("int"))
                ColumnType[counter]="int";
                counter++;
            }
            idName =field1.getDeclaredAnnotation(IdName.class);
            if(idName!=null)
            {
                IdData= idName.id();
            }
        }

        String query="create  table "+tName+"(";
        if(IdData.length()>0)
        {
            query=query+""+IdData+" int primary key,";
        }
        StringBuilder mainQuery= new StringBuilder();
        for(int i=0;i< ColumnType.length;i++)
        {

            if(ColumnName[i]!=null && !ColumnType[i].equals("int"))
                mainQuery.append(ColumnName[i]+" "+ColumnType[i]+"(233),");
            else if(ColumnName[i]!=null && ColumnType[i].equals("int"))
                mainQuery.append(ColumnName[i]+" "+ColumnType[i]+",");
        }

        mainQuery.append(");");
        String MainQueryExcute=query+mainQuery;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MainQueryExcute);
        stringBuilder.deleteCharAt(stringBuilder.length()-3);
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }


}
