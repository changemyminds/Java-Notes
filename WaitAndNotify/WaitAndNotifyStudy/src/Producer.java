import java.util.Random;

public class Producer
{
    private Clerk mClerk = null;
    private Thread mThread = null;
    private Boolean mIsThreadStop = false;
    private String[] mProducts = new String[]{"book", "pencil", "pencil case", "erasers", "pen",
                                              "kettle", "Correction Tape"};

    public Producer(Clerk clerk)
    {
        mClerk = clerk;
    }

    public void produce()
    {
        if(mThread != null || mClerk == null)
            return;

        mThread = new Thread(() -> {
            while(!mIsThreadStop) {
                try {
                    Random random = new Random();
                    int index = random.nextInt(mProducts.length);

                    System.out.println("Producer is starting produce "+ mProducts[index] + "...");
                    Thread.sleep((index + 1) * 400);

                    mClerk.setProduct(mProducts[index]);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
            }
        });

        mThread.start();
    }

    public void rest()
    {
        if(mThread != null && mThread.isAlive())
        {
            mIsThreadStop = true;
            mThread.interrupt();
            mThread = null;
        }

        System.out.println("Producer need to take a rest...");
    }
}
