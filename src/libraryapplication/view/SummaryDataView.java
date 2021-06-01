/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.AVItem;
import libraryapplication.model.Book;
import libraryapplication.model.BorrowableItem;
import libraryapplication.model.Journal;

import java.util.*;

import static libraryapplication.view.AVItemView.displaySingleAVItem;
import static libraryapplication.view.BookView.displaySingleBook;
import static libraryapplication.view.JournalView.displaySingleJournal;


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
            System.out.print("Your sub-total is:");
            System.out.print(TotalCost);
            float insurance = TotalCost / 100 * 50;
            System.out.print("The tax for your order:");
            System.out.print(insurance);
            System.out.print("Your order total is:");
            System.out.print(TotalCost + insurance);
        }
    }

    public static void displayItem(ArrayList<BorrowableItem> itemList) {
        BorrowableItem item;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter required item type: ");
        String type = scan.next();
        System.out.println("\nPre-Array check------------");
        for(BorrowableItem s : itemList) {
            System.out.println("\nArray check------------");
            if(Objects.equals(type, s.getType())) {
                item = s;
                System.out.println("\nConfirm check------------");
                if (s.getType().equals("Journal")) {
                    System.out.println("\nJournal check------------");
                    JournalView.displaySingleJournal((Journal) item);
                } else if (s.getType().equals("Book")) {
                    System.out.println("\nBook check------------");
                    BookView.displaySingleBook((Book) item);
                } else if (s.getType().equals("\nAVItem------------")){
                    System.out.println("AV check");
                    AVItemView.displaySingleAVItem((AVItem) item);
                }
            }
        }
    }
}
