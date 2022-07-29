package Day9;
/**
 Write a program using enum which will print following output
 Add enum RED('STOP"),GREEN("GO"),YELLOw"DRIVE VERY SLOW")
 Try to print values
 RED MEANS STOP
 GREEN MEANS GO
 YELLOW MEANS DRIVE VERY SLOw
 @Author Anuj Sundriyal
 */

 enum Traffic
{
    RED("STOP"),
    GREEN("GO"),
    YELLOW("DRIVE SLOW");


    private String url;

    Traffic(String ennAction) {
        this.url = ennAction;
    }

    public String getAction() {
        return url;
    }
}

public class EnumDriver {
    static void show()
    {
        for(Traffic env : Traffic.values())
        {
            System.out.println(env.name()+" Means "+env.getAction() );
        }
    }
    public static void main(String[] args) {
      EnumDriver.show();
    }
}


/*
OUTPUT
RED Means STOP
GREEN Means GO
YELLOW Means DRIVE SLOW
 */
