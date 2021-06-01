/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Book;
import java.util.Scanner;

public class BookInputDialogue {
    public BookInputDialogue() {

    }

    public Book inputBookItem() {
        Scanner s = new Scanner(System.in);
        Book book = null;
        String title;
        int id;
        float cost;
        boolean issued;
        String location;
        String type;
        String author;
        int numPages;
        String publisher;


        System.out.println("Book Input");
        System.out.println("Please enter the following details: ");
        System.out.println("1. Title: ");
        title = s.nextLine();
        System.out.println("2. ID: ");
        id = s.nextInt();
        System.out.println("3. Cost: ");
        cost = s.nextFloat();
        System.out.println("4. Issued(True/False): ");
        issued = s.nextBoolean();
        System.out.println("5. Location: ");
        location = s.nextLine();
        type = "Book";
        s.nextLine();
        System.out.println("6. Author: ");
        author = s.nextLine();
        System.out.println("7. Number of pages: ");
        numPages = s.nextInt();
        s.nextLine();
        System.out.println("8. Publisher: ");
        publisher = s.nextLine();

        book = new Book(cost, id, issued, location, title, type, author, numPages, publisher);
        return book;
    }

    public int inputBookID() {
        Scanner s = new Scanner(System.in);
        int BookID;

        System.out.println("Please enter required Book ID: ");
        BookID = s.nextInt();

        return BookID;
    }

    public void editBookItems(BorrowableItem s) {
        Scanner scan = new Scanner(System.in);

        float cost;
        boolean issued;
        String location;

        System.out.println("Editing Book " + s.getID());
        System.out.println("Please enter new cost: ");
        cost = scan.nextFloat();

        System.out.println("Is item still issued: ");
        issued = scan.nextBoolean();

        scan.nextLine();
        System.out.println("Please enter new location: ");
        location = scan.nextLine();

        s.setCost(cost);
        s.setIssued(issued);
        s.setLocation(location);
    }
}
