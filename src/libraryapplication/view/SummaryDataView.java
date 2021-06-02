/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.AVItem;
import libraryapplication.model.Book;
import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Journal;

import java.util.*;


public class SummaryDataView {
    public static void viewAllItems(ArrayList<BorrowableItem> itemList) {
        if (!itemList.isEmpty()) {
            BookView.displayAllBooks(itemList);
            JournalView.displayAllJournals(itemList);
            AVItemView.displayAllAVItems(itemList);
        } else {
            System.out.print("Item list has no entries.");
        }
    }

    public static void viewTotalCost(ArrayList<BorrowableItem> itemList) {
        float TotalCost = 0;
        if (itemList.isEmpty()) {
            System.out.println("No items added.");
        } else {
            for (BorrowableItem s : itemList) {
                TotalCost = TotalCost + s.getCost();
            }
            System.out.print("Your sub-total is:\n");
            System.out.print(TotalCost + "\n");
            float insurance = TotalCost / 100 * 50;
            System.out.print("The insurance cost for your order:\n");
            System.out.print(insurance + "\n");
            System.out.print("Your order total is:\n");
            System.out.print(TotalCost + insurance + "\n");
        }
    }

    public static int inputItemID() {
        Scanner s = new Scanner(System.in);
        int ItemID;

        System.out.println("Please enter required Item ID: ");
        ItemID = s.nextInt();

        return ItemID;
    }

    public static void displayItem(BorrowableItem s) {
        System.out.println(">>Displaying Item " + s.getID() + "'s Details<<");
        System.out.println(">>Title:     " + s.getTitle());
        System.out.println(">>Cost:      " + s.getCost());
        System.out.println(">>Is issued: " + s.getIssued());
        System.out.println(">>Location:  " + s.getLocation());
        System.out.println(">>Type:      " + s.getType());
        if (s instanceof Journal) {
            System.out.println(">>Issue No:  " + ((Journal) s).getissueNo());
            System.out.println(">># of pages:" + ((Journal) s).getNumPages());
            System.out.println(">>Publisher: " + ((Journal) s).getPublisher());
            System.out.println(">>Subject:   " + ((Journal) s).getSubject());
        } else if (s instanceof Book) {
            System.out.println(">>Author:    " + ((Book) s).getAuthor());
            System.out.println(">># of pages:" + ((Book) s).getNumPages());
            System.out.println(">>Publisher: " + ((Book) s).getPublisher());
        } else if (s instanceof AVItem) {
            System.out.println(">>Duration:  " + ((AVItem) s).getDuration());
            System.out.println(">>Format:    " + ((AVItem) s).getFormat());
        }
    }
}
