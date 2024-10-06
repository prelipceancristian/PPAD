package Ex1;

public class MyThread extends Thread {
    public MyThread(String name) { super(name);}

    public boolean keepRunning = true;

    public void run()
    {
        System.out.println("Starting");
        while(keepRunning)
        {
            System.out.println("Running");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Stopped");
    }

    public static void Main()
    {
        MyThread t = new MyThread("MyThread");
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.keepRunning = false;
    }
}
