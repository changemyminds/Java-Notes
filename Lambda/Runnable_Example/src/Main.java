public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.oldRunnable();
        m.newRunnable();
    }

    public void oldRunnable()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Study...");
                System.out.println("Java 8 previous writing");
            }
        }).start();
    }

    public void newRunnable()
    {
        new Thread(() -> {
            System.out.print("Study...");
            System.out.println("Java 8 writing lambda !");
        }).start();
    }
}

