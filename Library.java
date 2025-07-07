/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 *
 */
public class Library {
    private LibraryItem[] items;
    private int itemCount;

    public Library(int maxSize) {
        items = new LibraryItem[maxSize];
        itemCount = 0;
    }

    public void addBook(IBook book, int quantity) {
        if (itemCount < items.length) {
            items[itemCount] = new LibraryItem(book, quantity);
            itemCount++;
        }
    }

    public void printInventory() {
        for (int i = 0; i < itemCount; i++) {
            IBook book = items[i].getBook();
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Quantity: " + items[i].getQuantity());
            System.out.println("---");
        }
    }
}
