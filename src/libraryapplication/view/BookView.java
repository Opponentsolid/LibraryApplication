/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.AVItem;
import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Book;
import java.util.ArrayList;

public class BookView {
    public BookView() {

    }

    public static void displaySingleBook(Book s) {
        System.out.println("-------------------------");
        System.out.println(">>Displaying Book " + s.getID() +  "'s Details");
        System.out.println(">>Title:     " + s.getTitle());
        System.out.println(">>Cost:      " + s.getCost());
        System.out.println(">>Is issued: " + s.getIssued());
        System.out.println(">>Location:  " + s.getLocation());
        System.out.println(">>Type:      " + s.getType());
        System.out.println(">>Author:    " + s.getAuthor());
        System.out.println(">># of pages:" + s.getNumPages());
        System.out.println(">>Publisher: " + s.getPublisher());
    }

    public static void displayAllBooks(ArrayList<BorrowableItem> sList) {
        if(sList.isEmpty()) {
            System.out.println("Books empty");
            System.out.println("\n");
        } else {
            System.out.println("Books");
            System.out.println("\n");
            for(BorrowableItem s : sList) {
                if (s instanceof Book) {
                    displaySingleBook((Book) s);
                }
            }
        }
    }
}
