package Day12;
/*
remove space and print index 5 value
 */
class Trimm
{
    void removeSpce(String s)
    {
        String p=s.trim();
        System.out.println("After");
        System.out.println(p);
        System.out.println("Fifth index unicode \n"+p.codePointAt(5));
    }
}
public class SpaceRemoveDriver {
    public static void main(String[] args) {
        String s=" Helloo Anuj ";
        System.out.println("Before \n"+s);

        new Trimm().removeSpce(s);
    }
}
/*
OUTPUT
Before
 Helloo Anuj
After
Helloo Anuj
Fifth index unicode
111
 */