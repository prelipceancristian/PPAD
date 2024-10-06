package Ex3;

public class SharedResource {
    public String Content = "";
    public boolean Produce = false;

    public synchronized void Send(String content) throws InterruptedException {
        while(!Produce)
        {
            wait();
        }
        Produce = false;
        this.Content = content;
        notifyAll();
    }

    public synchronized String Receive() throws InterruptedException {
        while(Produce)
        {
            wait();
        }
        Produce = true;
        String result = this.Content;
        notifyAll();
        return result;
    }
}
