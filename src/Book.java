public class Book extends Item implements Borrowable {
    private String author;
    private boolean isBorrowed;

    public Book(String id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
        this.isBorrowed = false;
    }

    @Override
    public void borrowItem() throws ItemNotAvailableException, ItemAlreadyBorrowedException {
        if (isBorrowed) {
            throw new ItemAlreadyBorrowedException("The book " + getTitle() + " is already borrowed.");
        }
        isBorrowed = true;
    }

    @Override
    public void returnItem() throws ItemNotAvailableException {
        if (!isBorrowed) {
            throw new ItemNotAvailableException("The book " + getTitle() + " was not borrowed.");
        }

    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        String str = "DVD{" + "author: '" + author + '\'';
        if(isBorrowed){
            str+=" is borrowed.";
        }
        else
            System.out.println(" is not borrowed.");
        return str;
    }
}
