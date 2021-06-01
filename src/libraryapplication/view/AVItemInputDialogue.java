/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import libraryapplication.model.BorrowableItem;
import libraryapplication.model.AVItem;
import java.util.Scanner;

public class AVItemInputDialogue {
    public AVItemInputDialogue() {

    }

    public AVItem inputAVItem() {
        Scanner s = new Scanner(System.in);
        AVItem avItem;
        String title;
        int id;
        float cost;
        boolean issued;
        String location;
        String type;
        int duration;
        String format;

        System.out.println("Audio or Video item Input");
        System.out.println("Please enter the following details: ");
        System.out.println("1. Title: ");
        title = s.nextLine();
        System.out.println("2. ID: ");
        id = s.nextInt();
        System.out.println("3. Cost: ");
        cost = s.nextFloat();
        System.out.println("4. Issued(True/False): ");
        issued = s.nextBoolean();
        s.nextLine();
        System.out.println("5. Location: ");
        location = s.nextLine();
        type = "Audio/Video";
        System.out.println("6. Duration: ");
        duration = s.nextInt();
        s.nextLine();
        System.out.println("7. Format: ");
        format = s.nextLine();

        avItem = new AVItem(cost, id, issued, location, title, type, duration, format);
        return avItem;
    }

    public int inputAVItemID() {
        Scanner s = new Scanner(System.in);
        int AVItemID;

        System.out.println("Please enter required Audio Video Item ID: ");
        AVItemID = s.nextInt();

        return AVItemID;
    }

    public void editAVItems(BorrowableItem s) {
        Scanner scan = new Scanner(System.in);

        float cost;
        boolean issued;
        String location;

        System.out.println("Editing Audio/Video item " + s.getID());
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
