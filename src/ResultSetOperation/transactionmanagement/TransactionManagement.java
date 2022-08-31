package ResultSetOperation.transactionmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Random;

public class TransactionManagement {
    Random random = new Random();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void buyProduct() throws IOException, SQLException, InterruptedException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
        connection.setAutoCommit(false);
        boolean condition=true;

        while(condition) {
            System.out.println("1) For Chips Rs 10");
            System.out.println("2) For Biscuit Rs 20");
            System.out.println("3) For Salt Rs 300");
            System.out.println("Enter what do you want");
            int choice=Integer.parseInt(bufferedReader.readLine());
            switch(choice)
            {
                case 1:
                    System.out.println("How Many Chips Packet you want");
                    int numberOfPacket=Integer.parseInt(bufferedReader.readLine());
                    this.payment(10*numberOfPacket,connection);
                    break;
                case 2:
                    System.out.println("Enter Number Of Biscuit Packet You want");
                    int numberOfPacket1=Integer.parseInt(bufferedReader.readLine());
                    this.payment(20*numberOfPacket1,connection);
                    break;
                case 3:
                    System.out.println("Enter Number Of salt Packet You want");
                    int numberOfPacket2=Integer.parseInt(bufferedReader.readLine());
                    this.payment(300*numberOfPacket2,connection);
                    break;
                case 4:
                    condition=false;
                    break;
            }
        }
    }
    void payment(int pay,Connection connection) throws IOException, InterruptedException, SQLException {
        System.out.println("=================PAYTM KARO==========================");
        System.out.println("You Have to Pay "+pay);
        int x = 1 + (int) (Math.random() * 10);
        int enteramount=Integer.parseInt(bufferedReader.readLine());
        if(enteramount<pay || enteramount>pay) {
            System.out.println("Do not close the program wait...............");
            Thread.sleep(10000);

            PreparedStatement preparedStatement1 = connection.prepareStatement("select *from ShopKeeperAccount");
            ResultSet resultSet = preparedStatement1.executeQuery();
            resultSet.next();
            int amount=resultSet.getInt(2);
            PreparedStatement preparedStatement = connection.prepareStatement("update  ShopKeeperAccount set Balance=?");
            preparedStatement.setInt(1,amount+enteramount);
            preparedStatement.executeUpdate();
            ResultSet resultSet1=preparedStatement1.executeQuery();
            resultSet1.next();
            System.out.println("Current Account Balance Before Rollback "+resultSet1.getInt(2));
            System.out.println("Sorry Wrong Amount you are entered");
            System.out.println("Roll Back processing is on going..............................");
            Thread.sleep(10000);
            connection.rollback();
            ResultSet resultSet2=preparedStatement1.executeQuery();
            resultSet2.next();
            System.out.println("Current Account Balance After Rollback "+resultSet2.getInt(2));
        }
        else {
            System.out.println("Payment Process is on going Do not close the program................");
            if((x*1000)>3000) {
                Thread.sleep(x * 1000);
                PreparedStatement preparedStatement1 = connection.prepareStatement("select *from ShopKeeperAccount");
                ResultSet resultSet = preparedStatement1.executeQuery();
                resultSet.next();
                int amount = resultSet.getInt(2);
                PreparedStatement preparedStatement = connection.prepareStatement("update  ShopKeeperAccount set Balance=?");
                preparedStatement.setInt(1, amount + pay);
                preparedStatement.executeUpdate();
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                resultSet1.next();
                System.out.println("Current Account Balance Before Rollback "+resultSet1.getInt(2));
                System.out.println("Sorry Wrong Amount you are entered");
                System.out.println("Roll Back processing is on going..............................");
                Thread.sleep(10000);
                connection.rollback();
                ResultSet resultSet2=preparedStatement1.executeQuery();
                resultSet2.next();
                System.out.println("Current Account Balance After Rollback "+resultSet2.getInt(2));

            }
            else {
                Thread.sleep(x * 1000);
                PreparedStatement preparedStatement1 = connection.prepareStatement("select *from ShopKeeperAccount");
                ResultSet resultSet = preparedStatement1.executeQuery();
                resultSet.next();
                int amount = resultSet.getInt(2);
                PreparedStatement preparedStatement = connection.prepareStatement("update  ShopKeeperAccount set Balance=?");
                preparedStatement.setInt(1, amount + pay);
                preparedStatement.executeUpdate();
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                resultSet1.next();
                System.out.println("Current Account Balance Before Rollback "+resultSet1.getInt(2));
                connection.commit();
                ResultSet resultSet2=preparedStatement1.executeQuery();
                resultSet2.next();
                System.out.println("Current Account Balance After Rollback "+resultSet2.getInt(2));
                System.out.println("payment Dono Successfully");
            }
        }


    }

    public static void main(String[] args) {
        try {
            new TransactionManagement().buyProduct();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
