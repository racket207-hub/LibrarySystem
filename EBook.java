/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 */

/**
 * si inizializza la classe Ebook che implementa la classe IBook
 */
public class EBook implements IBook {
    /**
     *  si inizializzano le seguenti variabili
     */
    private String title;
    private String author;
    private int pages;
    private double fileSizeMB;

/**
* Si usa la classe Ebook con i parametri che abbiamo inizializzato precedentemente
 */
    public EBook(String title, String author, int pages, double fileSizeMB) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.fileSizeMB = fileSizeMB;
    }

    /**
     * Input getTitle()
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     *  input getAuthor()
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * input getPages()
     * @return pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * input getFileSizeMB()
     * @return fileSizeMB
     */
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
