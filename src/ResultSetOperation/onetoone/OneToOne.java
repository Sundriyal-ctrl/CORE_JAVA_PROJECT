package ResultSetOperation.onetoone;

/**
 * Fetch data in OneToOne Relationship
 *
 * @author anuj sundriyal
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OneToOne {
    void getData()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select student.name ,teacher.name from student inner join teacher on student.teacher_id = teacher.id");
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
        new OneToOne().getData();
    }
}
/*
OUTPUT
Anuj   Lata
Rejul   Latika
 */