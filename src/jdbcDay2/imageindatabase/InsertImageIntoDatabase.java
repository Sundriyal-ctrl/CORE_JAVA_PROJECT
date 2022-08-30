package jdbcDay2.imageindatabase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertImageIntoDatabase {
    void insertImage()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
            PreparedStatement preparedStatement =con.prepareStatement("insert into image(id,image1) values(?,?)");
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Coditas\\IdeaProjects\\Practices\\src\\OIP.jpg");
            preparedStatement.setBlob(2,fileInputStream);
            preparedStatement.setInt(1,2);
            preparedStatement.execute();
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream("loss.jpg");
            preparedStatement = con.prepareStatement("select * from image");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                fileOutputStream.write(resultSet.getBytes(2));
            }
            fileOutputStream.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {

    }
}
