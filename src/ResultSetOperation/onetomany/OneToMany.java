package ResultSetOperation.onetomany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OneToMany {
    void getData()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select teacher.name,student.name from Teacher  join student on teacher.id=student.teacherid");
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
        new OneToMany().getData();
    }
}
/*
OUTPUT
Lata   Aarti
Lata   kriti
Lata   preeti
Lata   Dhriti
Lata   Smriti
Latika   Souamya
Latika   Gaurang
Latika   Unmesh
 */