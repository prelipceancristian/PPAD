package Ex3;

public class Ex3 {
    public static void main()
    {
        SharedResource sharedResource = new SharedResource();
        Consumer consumer = new Consumer(sharedResource);
        Producer producer = new Producer(sharedResource);
        producer.start();
        consumer.start();
    }
}
