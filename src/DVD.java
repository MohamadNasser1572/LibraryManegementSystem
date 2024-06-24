public class DVD extends Item implements Borrowable {
    private final String director;
    private boolean isBorrowed;

    public DVD(String id, String title, int year, String director) {
        super(id, title, year);
        this.director = director;
        this.isBorrowed = false;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void borrowItem() throws ItemNotAvailableException, ItemAlreadyBorrowedException {
        if (isBorrowed) {
            throw new ItemAlreadyBorrowedException("This DVD " + getType() + " is already borrowed.");
        }
        isBorrowed = true;
    }

    @Override
    public void returnItem() throws ItemNotAvailableException {
        if (!isBorrowed) {
            throw new ItemNotAvailableException("This DVD was not borrowed.");
        }
        isBorrowed = false;
    }

    @Override
    public String getType() {
        return "DVD";
    }

    @Override
    public String toString() {
        String str = "DVD{" + "director: '" + director + '\'';
        if (isBorrowed) {
            str += " is borrowed.";
        } else {
            str += " is not borrowed.";
        }
        return str + "}";
    }
}
