package Day12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
/*
Reorder the string on the behalf of length
@Author anuj sundriyal
 */
class Reorder
{
    String s1[];
    StringBuffer stringBuffer = new StringBuffer();
    int i=0;
    public String reor(String s)
    {
        StringTokenizer st = new StringTokenizer(s," ");
        s1 = new String[st.countTokens()];
        while(st.hasMoreElements())
        {
            s1[i++]=st.nextToken();

        }
        sortLength();
        for(int i=0;i<s1.length;i++)
            stringBuffer.append(s1[i]+" ");
        return stringBuffer.toString();
    }
    void sortLength()
    {
        Arrays.sort(s1, Comparator.comparingInt(String::length));

    }
}
public class ReOrderStringDriver {
    public static void main(String[] args) {
        Reorder reorder = new Reorder();
        String s1="Shailesh Anuj Rejul Sundriyal Ayushi";
        System.out.println("=================Before=================");
        System.out.println(s1);
        s1=reorder.reor(s1);
        System.out.println("====================After================");
        System.out.println(s1);

    }
}
/*
OUTPUT
=================Before=================
Shailesh Anuj Rejul Sundriyal Ayushi
====================After================
Anuj Rejul Ayushi Shailesh Sundriyal
 */
