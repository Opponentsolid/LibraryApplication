/* Authored By Nicholas Phillimore */
package libraryapplication.model;

public class AVItem extends BorrowableItem {
    protected int duration;
    protected String format;

    //Local Object Constructor
    public AVItem() {
        super();

        duration = 0;
        format = "";
    }

    //Local Object Setter
    public AVItem(float cost, int id, boolean issued, String location, String title, String type, int duration, String format) {
        super(cost, id, issued, location, title, type);

        this.duration = duration;
        this.format = format;
    }

    //Getters for local model local variables
    public int getDuration() { return duration; }
    public String getFormat() { return format; }
}
