package Day17;

/**
 * Method or block which is suitable or why
 *
 * so block is better than method because in block we do not need to make whole method as synchronized only
 * specific part need to be synchronized
 */

class SynchronizedMethodBlock implements Runnable
{
    public void run()
    {
        synchronized (this)
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName());
            }
        }
        System.out.println("Hello "+Thread.currentThread().getName());
    }
}
public class MethodBlockSuitabilityDriver {
    public static void main(String[] args) {
        SynchronizedMethodBlock synchronizedMethodBlock = new SynchronizedMethodBlock();

        Thread thread = new Thread(synchronizedMethodBlock);
        Thread thread1 = new Thread(synchronizedMethodBlock);
        thread.start();
        thread1.start();
    }
}

/*
OUTPUT
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
Hello Thread-1
Hello Thread-0
 */