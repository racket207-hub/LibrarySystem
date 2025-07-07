public class LibraryItem {
    private IBook book;
    private int quantity;

    public LibraryItem(IBook book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public IBook getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }
}
