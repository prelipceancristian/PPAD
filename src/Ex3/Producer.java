package Ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run()
    {
        List<String> messages = new ArrayList<>();
        messages.add("Message 1");
        messages.add("Message 2");
        messages.add("Message 3");
        for (String message : messages) {
            try {
                sharedResource.Send(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Producer done");
    }
}
