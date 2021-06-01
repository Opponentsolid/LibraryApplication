/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.AVItem;
import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Journal;

import java.util.ArrayList;

public class JournalView {
    public JournalView() {

    }

    public static void displaySingleJournal(Journal s) {
        System.out.println("-------------------------");
        System.out.println(">>Displaying Journal " + s.getID() + "'s Details<<");
        System.out.println(">>Title:     " + s.getTitle());
        System.out.println(">>Cost:      " + s.getCost());
        System.out.println(">>Is issued: " + s.getIssued());
        System.out.println(">>Location:  " + s.getLocation());
        System.out.println(">>Type:      " + s.getType());
        System.out.println(">>Issue No:  " + s.getissueNo());
        System.out.println(">># of pages:" + s.getNumPages());
        System.out.println(">>Publisher: " + s.getPublisher());
        System.out.println(">>Subject:   " + s.getSubject());
    }

    public static void displayAllJournals(ArrayList<BorrowableItem> sList) {
        if (sList.isEmpty()) {
            System.out.println("Journals empty");
        } else {
            System.out.println("Journals");
            for (BorrowableItem s : sList) {
                if (s instanceof Journal) {
                    displaySingleJournal((Journal) s);
                }
            }
        }
    }
}
