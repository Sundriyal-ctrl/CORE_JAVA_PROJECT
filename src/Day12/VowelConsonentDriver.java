package Day12;
/*
count total number of vowel and consonent
@Author Anuj sundriyal
 */
class Check
{
    int vcount=0;
    int ccount=0;
     String s;
    void checkvc(String s1)
    {
        for(int i=0;i<s1.length();i++)
        {
            s=String.valueOf(s1.charAt(i));
            if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e")|| s.equalsIgnoreCase("i")||
            s.equalsIgnoreCase("o")|| s.equalsIgnoreCase("u")){
                vcount++;
            } else if (s.equals(" ")) {
                continue;
            }
            else
            {
                ccount++;
            }

        }
        System.out.println("Total Vowel "+vcount+"   \n"+"Total Consonent "+ccount);
    }
}
public class VowelConsonentDriver {
    public static void main(String[] args) {
      String s="Sundriyal";
      new Check().checkvc(s);
    }
}
/*
OUTPUT
Total Vowel 3
Total Consonent 6
 */
