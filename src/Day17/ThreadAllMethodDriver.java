package Day17;

/**
 * Write a program of 3 Thread Object using runnable interface try to access all method of Thread class
 *
 *
 * @Author anuj sundriyal
 */

class ThreadAllMethodUse implements Runnable
{
    public void run()
    {
        //print thread name
        System.out.println(Thread.currentThread().getName());
        //print thread state(new,runnable,running,wait sleep,terminated)
        System.out.println(Thread.currentThread().getState());
        //print thread id
        System.out.println(Thread.currentThread().getId());
        //print thread priority(1,5,10)
        System.out.println(Thread.currentThread().getPriority());
        //print thread is alive or not
        System.out.println(Thread.currentThread().isAlive());
        //print true or false if thread is daemon(which execute at the background)
        System.out.println(Thread.currentThread().isDaemon());
        try{
            System.out.println("Wait for 1 second");
            //Thread is sleep for 1 second
            Thread.sleep(1000);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class ThreadAllMethodDriver {
    public static void main(String[] args) {
        ThreadAllMethodUse threadAllMethodUse = new ThreadAllMethodUse();
        Thread thread = new Thread(threadAllMethodUse);
        Thread thread1 = new Thread(threadAllMethodUse);
        thread.start();
        thread1.start();
    }
}
/*
OUTPUT
Thread-0
Thread-1
RUNNABLE
RUNNABLE
11
5
12
5
true
true
false
false
Wait for 1 second
Wait for 1 second
 */