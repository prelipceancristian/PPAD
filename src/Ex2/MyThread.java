package Ex2;

public class MyThread extends Thread{

    public int Counter;

    public MyThread(){}

    public void run() {
        while(true)
        {
            Counter++;
        }
    }

    public static void main()
    {
        MyThread maxThread = new MyThread();
        maxThread.setName("Max priority thread");
        maxThread.setPriority(Thread.MAX_PRIORITY);
        MyThread minThread = new MyThread();
        minThread.setName("Min priority thread");
        minThread.setPriority(Thread.MIN_PRIORITY);
        maxThread.start();
        minThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(maxThread.getName() + ": " + maxThread.Counter);
        System.out.println(minThread.getName() + ": " + minThread.Counter);
    }
}
