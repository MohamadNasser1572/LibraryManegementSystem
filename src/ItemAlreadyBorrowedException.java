public class ItemAlreadyBorrowedException extends Exception {
    public ItemAlreadyBorrowedException(String message) {
        System.out.println("Item is already borrowed.");
    }
}
