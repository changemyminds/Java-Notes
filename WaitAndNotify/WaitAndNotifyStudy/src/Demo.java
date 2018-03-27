import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
        Clerk clerk = new Clerk();
        Consumer consumer = new Consumer(clerk);
        Producer producer = new Producer(clerk);
        System.out.println("=== producer starting work ===");
        producer.produce();

        System.out.println("=== consumer come in ===");
        consumer.shopping();


        try {
            Thread.sleep(15000);
            System.out.println("=== consumer leave ===");
            consumer.exit();

            Thread.sleep(500);
            System.out.println("=== producer take a rest ===");
            producer.rest();

            Thread.sleep(500);
            System.out.println("=== clerk get the storage ===");
            List<String> storage = clerk.getStorage();
            for (String item: storage) {
                System.out.println(item);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
