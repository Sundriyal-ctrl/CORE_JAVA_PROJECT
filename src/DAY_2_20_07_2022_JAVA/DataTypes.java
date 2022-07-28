package DAY_2_20_07_2022_JAVA;

public class DataTypes {
    public void byteCheck()
    {
        byte num1 =0 , num2 = 9 ,num3 = 10;
        //num1=num2+num3;// error occur because there is a chance of exceeding the byte range
        System.out.println(num1);
    }
    public void shortCheck()
    {
        short num1 =0 ,num2 = 4,num3 = 9;
        //num1 = num2 + num3;// error occur because there is a chance of exceeding the short range
        System.out.println(num1);
    }
    public void intCheck()
    {
        int num1 =0 ,num2 =4 , num3 =9 ;
        num1=num2+num3;
        System.out.println(num1);
    }

    public void   longCheck()
    {
        long num1 =0 ,num2 =4 , num3 =9 ;
        num1=num2+num3;
        System.out.println(num1);
    }
    public void floatCheck()
    {
        float num1 =0.0f ,num2 =4.9f , num3 =9.8f ;
        num1=num2+num3;
        System.out.println(num1);
    }
    public void doubleCheck()
    {
        double num1 =0.0d ,num2 =4.9d , num3 =9.8d ;
        num1=num2+num3;
        System.out.println(num1);
    }

    public static void main(String[] args) {
        DataTypes d=new DataTypes();
        d.byteCheck();
        d.intCheck();
        d.doubleCheck();
        d.floatCheck();
        d.longCheck();
        d.shortCheck();
    }

}
