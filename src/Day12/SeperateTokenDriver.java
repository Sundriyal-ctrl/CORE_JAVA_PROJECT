package Day12;

import java.util.StringTokenizer;
/*
Seperator operator and operands
@Author anuj sundriyal
 */
class Token
{
   void sep(String s)
   {
       StringTokenizer stringTokenizer = new StringTokenizer(s,"[+%()*/]");
       System.out.println("================Operands==================");
       while(stringTokenizer.hasMoreElements())
       {
           System.out.println(stringTokenizer.nextToken());
       }
       System.out.println("=================Operators================");
       StringTokenizer stringTokenizer1 = new StringTokenizer(s,"[3 20 2 20 2]");
       while(stringTokenizer1.hasMoreElements())
       {
           System.out.println(stringTokenizer1.nextToken());
       }
   }
}
public class SeperateTokenDriver {
    public static void main(String[] args) {
        new Token().sep("3 + ( 20 % 2 ) * ( 20 / 2 )");
    }
}
/*
OUTPUT
================Operands==================
3
20
2
20
2
=================Operators================
+
(
%
)
*
(
/
)
 */