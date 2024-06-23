public interface Borrowable {
    void borrowItem() throws ItemNotAvailableException, ItemAlreadyBorrowedException;
    void returnItem() throws ItemNotAvailableException;
}

