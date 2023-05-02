import java.util.ArrayList;
import java.util.List;

public class ShoppingStore {
    public static void main(String[] args) {
        List<IStoreItem> items = new ArrayList<>();
        items.add(new Book("1234", 20.01, 0.08));
        items.add(new Book("5678", 345, 0.08));
        items.add(new Coffee("Espresso", 300, 0.092, false));
        items.add(new Coffee("Starbucks", 400, 0.099, true));
        items.add(new Tea("Curtis", 50, 0.003, true));

        IStoreVisitor visitor = new StoreVisitor();

        double totalCost = 0;
        for (IStoreItem item : items) {
            totalCost += item.accept(visitor);
        }

        System.out.println("Total cost = " + totalCost);
    }
}
