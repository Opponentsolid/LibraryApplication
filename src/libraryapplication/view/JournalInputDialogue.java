/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Journal;
import java.util.Scanner;

public class JournalInputDialogue {
    public JournalInputDialogue() {

    }

    public Journal inputJournalItem() {
        Scanner s = new Scanner(System.in);
        Journal journal;
        String title;
        int id;
        float cost;
        boolean issued;
        String location;
        String type;
        int issueNo;
        int numPages;
        String publisher;
        String subject;


        System.out.println("Journal Input");
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
        type = "Journal";
        s.nextLine();
        System.out.println("6. Issue Number: ");
        issueNo = s.nextInt();
        System.out.println("7. Number of pages: ");
        numPages = s.nextInt();
        System.out.println("8. Publisher: ");
        publisher = s.nextLine();
        s.nextLine();
        System.out.println("9. Subject: ");
        subject = s.nextLine();

        journal = new Journal(cost, id, issued, location, title, type, issueNo, numPages, publisher, subject);
        return journal;
    }

    public int inputJournalID() {
        Scanner s = new Scanner(System.in);
        int JournalID;

        System.out.println("Please enter required Journal ID: ");
        JournalID = s.nextInt();

        return JournalID;
    }

    public void editJournal(BorrowableItem s) {
        Scanner scan = new Scanner(System.in);

        float cost;
        boolean issued;
        String location;

        System.out.println("Editing Journal " + s.getID());
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
