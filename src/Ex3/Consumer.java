package Ex3;

public class Consumer extends Thread {

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run()
    {
        while(true)
        {
            try {
                String message = sharedResource.Receive();
                System.out.println(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
