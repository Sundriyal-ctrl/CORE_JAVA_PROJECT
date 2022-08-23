package Day17;

/**
 * What if we restart any thread?
 *
 *if we restart any thread we will get IllegalThreadStateException
 *
 * @Author anuj sundriyal
 */
class RestartThread implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class RestartThreadDriver {
    public static void main(String[] args) {
        RestartThread restartThread  = new RestartThread();
        Thread thread = new Thread(restartThread);
        thread.start();
        thread.start();
    }
}

/*
OUTPUT

Thread-0
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:710)
	at Day17.RestartThreadDriver.main(RestartThreadDriver.java:20)

 */