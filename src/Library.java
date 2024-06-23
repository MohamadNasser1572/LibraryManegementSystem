import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void returnItem(Item item) {
        try {
            if (item instanceof Borrowable) {
                ((Borrowable) item).returnItem();
                System.out.println(item.getTitle() + " has been returned.");
            } else {
                System.out.println(item.getTitle() + " cannot be returned.");
            }
        } catch (ItemNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    public void borrowItem(Item item) {
        try {
            if (item instanceof Borrowable) {
                ((Borrowable) item).borrowItem();
                System.out.println(item.getTitle() + " has been borrowed.");
            } else {
                System.out.println(item.getTitle() + " cannot be borrowed.");
            }
        } catch (ItemNotAvailableException | ItemAlreadyBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }

}
