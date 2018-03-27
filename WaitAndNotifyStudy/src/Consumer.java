public class Consumer
{
    private Clerk mClerk = null;

    private Thread mThread = null;
    private Boolean mIsThreadStop = false;

    public Consumer(Clerk clerk)
    {
        mClerk = clerk;
    }

    public void shopping()
    {
        if(mThread != null || mClerk == null)
            return;

        mThread = new Thread(() -> {
            while (!mIsThreadStop)
            {
                String product = mClerk.getProduct();
                if(product != null)
                    System.out.println("consumer buy the product = " + product);
            }

        });
        mThread.start();
    }

    public void exit()
    {
        if(mThread != null && mThread.isAlive())
        {
            mIsThreadStop = true;
            mThread.interrupt();
            mThread = null;
        }

        System.out.println("consumer exit...");
    }
}
