package Day11;
/*
lazy int
 */
class DataBaseConnection
{

    static DataBaseConnection singletonClass;
    private DataBaseConnection()
    {

    }
    static DataBaseConnection getObject()
    {
        if(singletonClass == null)
        {
            singletonClass = new DataBaseConnection();
        }
        return singletonClass;
    }

}
public class EkHeObjectBnega {
    public static void main(String[] args) {
        DataBaseConnection s = DataBaseConnection.getObject();
        DataBaseConnection s1 = DataBaseConnection.getObject();
        System.out.println(s);
        System.out.println(s1);
    }
}
