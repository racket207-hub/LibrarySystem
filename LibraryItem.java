/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 * si inizializza la classe LibraryItem
 * e le sue variabili private book e quantity
 */
public class LibraryItem {
    private IBook book;
    private int quantity;

    /**
     * si inizializza il metodo con i seguenti parametri
     * @param book
     * @param quantity
     * e successivamente i usa il "this" perchè il nome usato è uguale al nome della variabile
     */
    public LibraryItem(IBook book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    /**
     * tramita il metodo getBook
     * @return book
     */
    public IBook getBook() {
        return book;
    }

    /**
     * tramite il metodo getQuantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
