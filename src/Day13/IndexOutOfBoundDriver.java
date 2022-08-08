package Day13;

/**
 * raise ArrayIndex Out of Bound exception
 * @Author anuj sundriyal
 */
class IndexOut
{
    //without exception
    void getException()
    {
        System.out.println("===========Inside getException Method===========");
        int arr[] = new int[10];
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        System.out.println("Sum : "+sum);
    }
    void getBound()
    {
        System.out.println("===========Inside getBound Method===========");
        int arr[] = new int[10];
        int sum=0;
        try {
            for (int i = 0; i < 11; i++)
                sum += arr[i];
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception in getBound "+e);
        }
    }
}
public class IndexOutOfBoundDriver {
    public static void main(String[] args) {
        IndexOut indexOut = new IndexOut();
        indexOut.getBound();
        indexOut.getException();
    }
}
/*
OUTPUT
===========Inside getBound Method===========
Exception in getBound java.lang.ArrayIndexOutOfBoundsException: 10
===========Inside getException Method===========
Sum : 0
 */