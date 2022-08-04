package Day12;
class Coversion
{
    void con(char a[])
    {
        System.out.println("=============Array Printing=============");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
public class ConvertStringArrayDriver {
    public static void main(String[] args) {
        String s="Anuj Sundriyal Maharaj";
        System.out.println("================String printing===================");
        System.out.println(s);
        new Coversion().con(s.toCharArray());
    }
}
/*
OUTPUT
================String printing===================
Anuj Sundriyal Maharaj
=============Array Printing=============
A
n
u
j

S
u
n
d
r
i
y
a
l

M
a
h
a
r
a
j
 */
