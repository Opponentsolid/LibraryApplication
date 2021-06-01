/* Authored By Nicholas Phillimore */
package libraryapplication.model;

public class BorrowableItem {
    private static int id;
    private float cost;
    private boolean issued;
    private String location;
    private String title;
    private String type;

    //Main Objects Constructor
    public BorrowableItem() {//Constructor.
        cost = 0;
        id = 0;
        issued = false;
        location = "";
        title = "";
        type = "";
    }
    //Main Object
    public BorrowableItem(float cost, int id, boolean issued, String location, String title, String type) {
        this.cost = cost;
        this.id = id;
        this.issued = issued;
        this.location = location;
        this.title = title;
        this.type = type;
    }
    //Set and Get Cost
    public void setCost(float cost) { this.cost = cost; }
    public float getCost() {
        return cost;
    }
    //Set and Get ID
    public void setID(int id) {
        this.id = id;
    }
    public static int getID() {
        return id;
    }
    //Set and Get Is Issued
    public void setIssued(boolean issued) {
        this.issued = issued;
    }
    public boolean getIssued() {
        return issued;
    }
    //Set and Get Location
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    //Set and Get Title
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    //Set and Get Type
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    //Used to display object details depending on the object type should output required information only
    public void displayObjectDetails(String duration, String format, String author, int numPages, String publisher, int issueNo, String subject) {
        System.out.println("Cost: " + cost);
        System.out.println("ID: " + id);
        System.out.println("Issued: " + issued);
        System.out.println("Location: " + location);
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        if (type.equals("Book")){
            System.out.println("Author: " + author);
            System.out.println("NumPages: " + numPages);
            System.out.println("Publisher: " + publisher);
        } else if (type.equals("Journal")) {
            System.out.println("IssueNo: " + issueNo);
            System.out.println("NumPages: " + numPages);
            System.out.println("Publisher: " + publisher);
            System.out.println("Subject: " + subject);
        } else {
            System.out.println("Duration: " + duration);
            System.out.println("Format: " + format);
        }
    }
}
