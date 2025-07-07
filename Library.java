/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 * inizializzazione delle seguenti variabili
 */
public class Library {
    private LibraryItem[] items;
    private int itemCount;

    public Library(int maxSize) {
        items = new LibraryItem[maxSize];
        itemCount = 0;
    }

    /**
     * creazione di un metodo pubblico usando i seguenti variabili
     * @param book
     * @param quantity
     * il metodo presenta il seguente if "itemCount < items.length" nella quale incrementa il valore
     * di  itemCount++ se è vero.
     */
    public void addBook(IBook book, int quantity) {
        if (itemCount < items.length) {
            items[itemCount] = new LibraryItem(book, quantity);
            itemCount++;
        }
    }
/**
 * Creazione di un array in base al valore di itemCount
 * che stamperà le frasi riportate in seguito
 */
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
