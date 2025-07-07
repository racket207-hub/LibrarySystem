/**
 * @author Salvatore Garufi
 * @since 07/07/2025
 * 
 *
 */
public class EBook implements IBook {
    private String title;
    private String author;
    private int pages;
    private double fileSizeMB;

    public EBook(String title, String author, int pages, double fileSizeMB) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.fileSizeMB = fileSizeMB;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
