package Day3;

import java.util.Arrays;
class Bank
{
  static float rateOfInterest=7.5F;
   int money;


    private String name,Address;
    private long moneydeposit, MoneyWithdrawal;
    private long AccountNumber;
    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Bank.rateOfInterest = rateOfInterest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getMoneydeposit() {
        money+=moneydeposit;
        return moneydeposit;
    }

    public void setMoneydeposit(long moneydeposit) {
        this.moneydeposit = moneydeposit;
    }

    public long getMoneyWithdrawal() {
        money-=MoneyWithdrawal;
        return MoneyWithdrawal;
    }

    public void setMoneyWithdrawal(long moneyWithdrawal) {
        MoneyWithdrawal = moneyWithdrawal;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", moneydeposit=" + moneydeposit +
                ", MoneyWithdrawal=" + MoneyWithdrawal +
                ", AccountNumber=" + AccountNumber +
                '}';
    }


}
public class LeftTriangleWithAlphabet {
    public static void main(String args[]) {
     Bank bank = new Bank();
     bank.setAccountNumber(1231432l);
     bank.setAddress("Upper Nathanpur");
     bank.setMoneydeposit(1000);
     bank.setMoneyWithdrawal(100);
     bank.setName("Anuj Sundriyal");
        System.out.println(bank);
    }
}


