package Day17;

class SynchronizedMethod implements Runnable
{
    public synchronized void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread().getName());
    }
}
class SynchronizedBlock implements Runnable
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
    }
}
public class SynchronizationIntoBlockDriver {
    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        System.out.println("=============Synchronized Method===========");
        Thread thread = new Thread(synchronizedMethod);
        Thread thread1 = new Thread(synchronizedMethod);
        thread.start();
        thread1.start();
        SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
        System.out.println("=============Synchronized Block=============");
        Thread thread2 = new Thread(synchronizedBlock);
        Thread thread3 = new Thread(synchronizedBlock);
        thread2.start();
        thread3.start();
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
=============Synchronized Block=============
Thread-2
Thread-2
Thread-2
Thread-2
Thread-2
Thread-3
Thread-3
Thread-3
Thread-3
Thread-3
 */