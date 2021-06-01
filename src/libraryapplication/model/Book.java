/* Authored By Nicholas Phillimore */
package libraryapplication.model;

public class Book extends BorrowableItem {
    protected String author;
    protected int numPages;
    protected String publisher;

    //Local Object Constructor
    public Book() {
        super();

        author = "";
        numPages = 0;
        publisher = "";
    }

    //Local Object Setter
    public Book(float cost, int id, boolean issued, String location, String title, String type, String author, int numPages, String publisher) {
        super(cost, id, issued, location, title, type);

        this.author = author;
        this.numPages = numPages;
        this.publisher = publisher;
    }

    //Getters for local model local variables
    public String getAuthor() {
        return author;
    }
    public int getNumPages() {
        return numPages;
    }
    public String getPublisher() {
        return publisher;
    }
}
