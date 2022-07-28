package SaticDemo;
import java.lang.reflect.Array;
import java.util.*;
class StudentClass {
    int count=0;
   public void FindDuplication(int From[])
   {

       for (int i = 0 ;i < From.length ;i++)
       {

           for (int j=i+1 ;j < From.length;j++)
           {
               if(From[i]==From[j] && From[i]!=-1) {

                   From[j]=-1;
                   count++;
                  // break;
               }
           }

       }
   }
 public int[] removeSecondOcc(int From[])
 {
     System.out.println(count);
     int arr[] = new int[From.length-count];
     int j=0;
     for (int i=0;i<arr.length;i++)
     {
         if(From[i]!=-1) {
             arr[j] = From[i];
             j++;
         }
     }
     return arr;
 }
}
public class OverloadStatic {

    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,3,5,1};

        StudentClass s =new StudentClass();
        s.FindDuplication(arr);
        arr=s.removeSecondOcc(arr);
        for (int s1 : arr)
            System.out.println(arr[s1]);
    }
}
