/* Authored By Nicholas Phillimore */
package libraryapplication.model;

public class Journal extends BorrowableItem {
    protected int issueNo;
    protected int numPages;
    protected String publisher;
    protected String subject;

    //Local Object Constructor
    public Journal() {//Constructor.
        super();

        issueNo = 0;
        numPages = 0;
        publisher = "";
        subject = "";
    }

    //Local Object Setter
    public Journal(float cost, int id, boolean issued, String location, String title, String type, int issueNo, int numPages, String publisher, String subject) {
        super(cost, id, issued, location, title, type);

        this.issueNo = issueNo;
        this.numPages = numPages;
        this.publisher = publisher;
        this.subject = subject;
    }

    //Getters for local model local variables
    public int getissueNo() {
        return issueNo;
    }
    public int getNumPages() {
        return numPages;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getSubject() {
        return subject;
    }
}
