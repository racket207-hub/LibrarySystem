/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 * si crea un array di 10 elementi col nome di Library
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        /**
         * si assegna il nome alle due variabili sul libro stampato e sul libro digitale
         */
        PrintedBook pb = new PrintedBook("1984", "George Orwell", 328);
        EBook eb = new EBook("Digital Fortress", "Dan Brown", 356, 1.5);

        library.addBook(pb, 2);
        library.addBook(eb, 5);

        library.printInventory();
    }
}
