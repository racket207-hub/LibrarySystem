/**
 * @author Salvatore Garufi
 * @since 07/07/2025ù
 * si inizializza la classe PrintedBook implementando dalla classe IBook
 * e le sue variabili stringa title, title;
 * e la sua varabile int pages;
 */
public class PrintedBook implements IBook {
    private String title;
    private String author;
    private int pages;

    /**
     * si inizializza il metodo PrintedBook usando i seguenti parametri che abbiamo precedentemente inizzializzato
     * e si usa il "this" per via dello stesso nome tra parametri e variabili
     * @param title
     * @param author
     * @param pages
     */
    public PrintedBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    /**
     * tramite il metodo getTitle
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * tramite il metodo getAuthor
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * tramite il metodo getPages
     * @return pages
     */
    public int getPages() {
        return pages;
    }
}
