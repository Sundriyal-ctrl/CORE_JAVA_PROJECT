package Day17;

/**
 * What if we call run explicitly
 *
 * if will behave like a normal method
 *
 * @Author anuj sundriyal
 */
class  ExplicitlyCallRun extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ExplicitlyCallRunDriver {
    public static void main(String[] args) {
        ExplicitlyCallRun explicitlyCallRun = new ExplicitlyCallRun();
        explicitlyCallRun.run();
        explicitlyCallRun.run();
    }
}

/*
OUTPUT

main
main
 */