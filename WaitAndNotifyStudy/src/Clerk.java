import java.util.ArrayList;
import java.util.List;

public class Clerk
{
    private final int size = 10;
    List<String> listProduct = new ArrayList<>();


    public synchronized void setProduct(String product)
    {
        if(product == null || product.length() == 0)
            return;

        while(listProduct.size() >= 10)
        {
            System.out.println("Clerk products full...");
            try {
                wait();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }

        notify();
        System.out.println("Clerk have the product...");
        listProduct.add(product);
    }

    public synchronized String getProduct()
    {
        while (listProduct.size() == 0)
        {
            System.out.println("Clerk has no product...");
            try {
                wait();
            } catch (InterruptedException e) {
                //e.printStackTrace();
                return null;
            }
        }

        notify();
        System.out.println("Clerk sell...");

        String item = listProduct.get(listProduct.size() - 1);
        listProduct.remove(item);
        return item;
    }

    public synchronized List<String> getStorage()
    {
        return listProduct;
    }
}
