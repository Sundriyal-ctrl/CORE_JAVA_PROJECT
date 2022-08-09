package Day14;
import java.util.Scanner;
/**
 * 1 Write a program for::below cases to handle wrong operations done by customers in
 * deposit, and withdrawal operations.
 * Case 1)CREATE an InvalidAmountException if the user enters zero or -ve amount in deposit
 * and withdraw operations
 * Case 2)I hrow InsufficientBalanceException if the user enters the amount greater than the
 * balance in case of withdrawing operations
 *
 * @Author anuj sundriyal
 *
 */

class AccountClass
{
    long balance=130000;
    void WithdrawalAmount(long amount)  {
        try{
          if(amount<=0)
            throw new InvalidAmountException("Invalid Amount not allowed "+amount);
          else if(amount>balance)
            throw new InsufficientBalanceException("Amount is not valid Your Balance is "+balance);
          else {
            balance -= amount;
            System.out.println(amount + " is withdrawal from your account and Now account balance is " + balance);
        }
        }catch(InvalidAmountException | InsufficientBalanceException e)
        {
            e.printStackTrace();
        }
    }
    void deposit(long amount){
        try{
            if(amount<=0)
                throw new InvalidAmountException("Invalid Amount not allowed "+amount);
            else {
                balance += amount;
                System.out.println(amount + " is deposit now balance " + balance);
            }
        }catch(InvalidAmountException e)
        {
            System.err.println(e.getMessage());
        }

    }
}
public class ExceptionDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountClass accountClass = new AccountClass();

        System.out.println("Enter Operation\n1)for deposit\n2)for withdrawal");

        while(true) {

            int choice = scanner.nextInt();
            long balance = scanner.nextLong();
            switch(choice) {

                case 1:
                    System.out.println("Enter Deposit Amount");
                    accountClass.deposit(balance);
                    break;
                case 2:
                    System.out.println("Enter Withdrawal Amount");
                    accountClass.WithdrawalAmount(balance);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
