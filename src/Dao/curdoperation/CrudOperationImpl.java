package Dao.curdoperation;

import Dao.ConnectionMaker.ConnectionProvider;
import Dao.Pojo.EmployeeDao;
import databaseday1.insertdata.DataInsertion;
import jdk.jfr.internal.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CrudOperationImpl  implements crudoperationinterface{

    @Override
    public void create() {
        try {
            Connection connection = ConnectionProvider.getInstance();
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet tableexits=databaseMetaData.getTables(null,null,"Dao",null);
            if(tableexits.next())
                System.out.println("Table exists");
            else {
                PreparedStatement preparedStatement=connection.prepareStatement("create table Dao(id int primary key,name varchar(233))");
                if(preparedStatement.execute())
                {
                    System.out.println("Table Created Successfully");
                }
            }

         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
    }

    @Override
    public void insert() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Connection connection = ConnectionProvider.getInstance();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into Dao values(?,?)");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet tableexits=databaseMetaData.getTables(null,null,"Dao",null);
            if(tableexits.next())
            {
                System.out.println("Enter Id");
                preparedStatement.setInt(1,Integer.parseInt(bufferedReader.readLine()));
                System.out.println("Enter Name");
                preparedStatement.setString(2,bufferedReader.readLine());
                if(preparedStatement.execute())
                {
                    System.out.println("Data Inserted Successfully");
                }
                else {
                    System.out.println("Data not Inserted");
                }
            }
            else {
                this.create();
                this.insert();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Connection connection = ConnectionProvider.getInstance();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from Dao where id=?");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet tableexits=databaseMetaData.getTables(null,null,"Dao",null);
            if(tableexits.next())
            {
                preparedStatement.setInt(1,id);
                if(preparedStatement.execute())
                {
                    System.out.println("Data Delete Successfully");
                }
                else {
                    System.out.println("Data not Delete");
                }
            }
            else {
                System.out.println("Table not exists");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Connection connection = ConnectionProvider.getInstance();
            PreparedStatement preparedStatement=connection.prepareStatement("update Dao set name=? or city=? where id=?");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet tableexits=databaseMetaData.getTables(null,null,"Dao",null);
            if(tableexits.next())
            {
                PreparedStatement preparedStatement1=connection.prepareStatement("select *from Dao where id=?");
                System.out.println("Enter Id You Want to Update");
                preparedStatement1.setInt(1,Integer.parseInt(bufferedReader.readLine()));
                ResultSet resultSet=preparedStatement1.executeQuery();
                if(resultSet.next()) {
                    System.out.println("Enter which attribute you want to update\n name or city");
                    switch (bufferedReader.readLine()) {
                        case "name":
                            System.out.println("Enter New Name");
                            preparedStatement.setString(1, bufferedReader.readLine());
                            System.out.println("Name Updated Successfully");
                            break;
                        case "city":
                            System.out.println("Enter New City");
                            preparedStatement.setString(2, bufferedReader.readLine());
                            System.out.println("City Updated Successfully");
                            break;
                        default:
                            System.out.println("Wrong Choice");
                            break;

                    }
                    preparedStatement.executeUpdate();
                }
                else {
                    System.out.println("Id Does not exists");
                }
            }
            else {
                System.out.println("table not exists");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void fetchOne(int id ) {
       HashSet<EmployeeDao> hashSet=this.getResultSet();
       List<EmployeeDao> list=hashSet.stream().filter(s->s.getId()==id).collect(Collectors.toList());
        System.out.println(list);
    }

    @Override
    public void fetchAll() {
        HashSet<EmployeeDao> hashSet=this.getResultSet();
        hashSet.stream().forEach(System.out::println);
    }
    public HashSet<EmployeeDao> getResultSet()
    {
        HashSet<EmployeeDao> hashSet = new HashSet<>();
        EmployeeDao employeeDao =null;
        try {
            Connection connection=ConnectionProvider.getInstance();
            ResultSet resultSet=connection.prepareStatement("select *from Dao").executeQuery();
            while(resultSet.next())
            {
                employeeDao= new EmployeeDao();
                employeeDao.setId(resultSet.getInt(1));
                employeeDao.setName(resultSet.getString(2));
                hashSet.add(employeeDao);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        return hashSet;
    }

}
