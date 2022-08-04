package Day12;
class RR
{
    char[] a;
    StringBuffer sf = new StringBuffer();
    String RpeaTR(String s)
    {
        a=s.toCharArray();
      for(int i=0;i<s.length();i++)
      {
          for(int j=i+1;j<s.length();j++)
          {
              if(a[i]==a[j])
              {
                  a[j]=' ';
              }
          }

      }
        for(char ss : a)
        {
            if(ss!=' ')
                sf.append(ss);
        }
      return sf.toString();
    }
}
public class RemoveRepeatDriver {
    public static void main(String[] args) {
        String ss="HelloHowAreYou";
        System.out.println("==========Before============");
        System.out.println(ss);
        System.out.println("========After===========");
        System.out.println(new RR().RpeaTR(ss));

    }
}
/*
OUTPUT
==========Before============
HelloHowAreYou
========After===========
HelowArYu
 */
