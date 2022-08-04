package Day12;
/*
Accept 5 names of string count the length and as per their length assign their order
@Author Anuj Sundriyal
 */
class Replace
{
    void Replacee(String s)
    {
        String s1=null;
        for(int i=0;i<s.length();i++)
        {
            s1=String.valueOf(s.charAt(i));
            if(s1.equalsIgnoreCase("a")||s1.equalsIgnoreCase("e")||s1.equalsIgnoreCase("i")||
            s1.equalsIgnoreCase("o")|| s1.equalsIgnoreCase("u"))
            {
                int a=s1.charAt(0);
                char ss= (char) (a+1);
                s=s.replace(s1.charAt(0),ss);
            }
        }
        System.out.println("================After====================");
        System.out.println(s);
    }
}
public class ReplaceDriver {
    public static void main(String[] args) {
    Replace replace = new Replace();
    String s="Aarti  Rejul Sundriyal";

        System.out.println("================Before===============\n "+s);
    replace.Replacee("Aarti");

    }
}
/*
OUTPUT
================Before===============
 Aarti
================After====================
Bbrtj
 */
