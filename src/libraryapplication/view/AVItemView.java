/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.BorrowableItem;
import libraryapplication.model.AVItem;

import java.util.ArrayList;

public class AVItemView {
    public AVItemView() {

    }

    public static void displaySingleAVItem(AVItem s) {
        System.out.println("-------------------------");
        System.out.println(">>Displaying Audio/Video item " + s.getID() + "'s Details");
        System.out.println(">>Title:     " + s.getTitle());
        System.out.println(">>Cost:      " + s.getCost());
        System.out.println(">>Is issued: " + s.getIssued());
        System.out.println(">>Location:  " + s.getLocation());
        System.out.println(">>Type:      " + s.getType());
        System.out.println(">>Duration:  " + s.getDuration());
        System.out.println(">>Format:    " + s.getFormat());
    }

    public static void displayAllAVItems(ArrayList<BorrowableItem> sList) {
        if (sList.isEmpty()) {
            System.out.println("Audio/Video empty");
            System.out.println("\n");
        } else {
            System.out.println("Audio/Video");
            System.out.println("\n");
            for (BorrowableItem s : sList) {
                if (s instanceof AVItem) {
                    displaySingleAVItem((AVItem) s);
                }
            }
        }
    }
}