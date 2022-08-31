package ResultSetOperation.manytomany;

/**
 * fetch many to many to many realationship data
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManyToMany {
    void getData()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select teacher.name,student.name from teacher left join teacherstudent on teacher.id=teacherstudent.sid left join student on student.id=teacherstudent.tid;");
            while(resultSet.next())
            {
                System.out.println(resultSet.getString(1)+"   "+resultSet.getString(2));
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ManyToMany().getData();
    }
}
/*
OUTPUT
Lata   Anuj
Lata   Shailesh
Lata   Rejul
Latika   Anuj
Latika   Shailesh
Latika   Rejul
anuj   Anuj
anuj   Rejul
 */