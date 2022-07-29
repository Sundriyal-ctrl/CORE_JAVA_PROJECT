package Day9;

/**
 * Write a program for Addition operation,
 * Class Addition{
 * /add method overioading for addo
 * Class Varargs_Addition
 * /use varargs for add method
 * Class MainApplication{
 * //access above classes in mainO
 * @Author Anuj Sundriyal
 */
class Addition
{
    void addTwo(int a,int b){
        System.out.println("Sum of 2 number of class Addition");
        System.out.println(a+b);
    }
    void addThree(int a,int b,int c)
    {
        System.out.println("Sum of 3 number of class Addition");
        System.out.println(a+b+c);
    }
}
class Varargs
{
    void addAny(int... a){
        int sum=0;
        for(int s: a)
        {
            sum+=s;
        }
        System.out.println("Varargs Addition Method of "+a.length+" sum");
    }
}
public class AdditionDriver {
    public static void main(String[] args) {
        System.out.println("===============Addition Class=====================");
        Addition addition = new Addition();
      addition.addTwo(10,20);
      addition.addThree(10,20,30);
        System.out.println("===============Varags class ======================");
      Varargs varargs = new Varargs();
      varargs.addAny(10,20,30,40);
      varargs.addAny(10,20);

    }
}
/*
OUTPUT
   Sum of 2 number of class Addition 30
        Sum of 3 number of class Addition 60
        ===============Varags class ======================
        Varargs Addition Method of 4 sum
        Varargs Addition Method of 2 sum

 */