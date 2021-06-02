/* Authored By Nicholas Phillimore */
package libraryapplication.controller;

//import tools
import java.util.ArrayList;
import java.util.Objects;

//import local java files
import com.sun.tools.javac.Main;
import libraryapplication.view.*;
import libraryapplication.model.*;

import static libraryapplication.view.SummaryDataView.*;

public class LibraryApplication {

    //Declare private variables
    private final Header header;
    private final MainMenuView mainMenu;
    private final AVItemInputDialogue avInput;
    private final BookInputDialogue bookInput;
    private final JournalInputDialogue journalInput;
    private SummaryDataView itemIDInput;
    private final AVItemView avItemView;
    private final BookView bookView;
    private final JournalView journalView;

    //Create library array list for all items
    private final ArrayList<BorrowableItem> itemList;

    //Create object variables
    public LibraryApplication() {
        mainMenu = new MainMenuView();
        header = new Header();
        itemList = new ArrayList();
        avInput = new AVItemInputDialogue();
        avItemView = new AVItemView();
        bookInput = new BookInputDialogue();
        bookView = new BookView();
        journalInput = new JournalInputDialogue();
        journalView = new JournalView();
    }

    //Main Menu, can access each sub-menu
    public void runMainMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Library", "Main Menu");

            //Takes input of users choice on main menu
            choice = mainMenu.displayMainMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-7, if 7 is selected
            //the "quit" becomes true and the program will be brought to an end
            switch (choice) {
                case 1:
                    //Book
                    BookInputDialogue();
                    break;
                case 2:
                    //Audio/Video
                    AVItemInputDialogue();
                    break;
                case 3:
                    //Journal
                    JournalInputDialogue();
                    break;
                case 4:
                    //Basket
                    viewAllLibraryItems();
                    break;
                case 5:
                    //Cost
                    findItem();
                    break;
                case 6:
                    //Search for item on ID
                    viewTotal();
                    break;
                case 7:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    //Sub-Menus, can access each specified tool(4 each)
    public BorrowableItem BookInputDialogue() {
        Book book = new Book();

        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        header.displayHeader("Library", "Book Menu");

        choice = mainMenu.displayBookMenu();

        //Takes user input
        while (!quit) {
            switch (choice) {
                case 1: {
                    inputBook();
                    choice = 5;
                    break;
                }
                case 2: {
                    editBook();
                    choice = 5;
                    break;
                }
                case 3: {
                    deleteBook();
                    choice = 5;
                    break;
                }
                case 4: {
                    viewAllBooks();
                    choice = 5;
                    break;
                }
                case 5: {
                    System.out.println("Exiting Menu");
                    quit = true;
                    break;
                }
                default: {
                    header.displayError(1, "Incorrect selection");
                    choice = mainMenu.displayBookMenu();
                    break;
                }
            }
        }
        return book;
    }
    public BorrowableItem AVItemInputDialogue() {
        AVItem avItem = new AVItem();

        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        header.displayHeader("Library", "Audio/Video Menu");

        choice = mainMenu.displayAVMenu();

        //Takes user input

        while (!quit) {

            switch (choice) {
                case 1: {
                    inputAVItem();
                    choice = 5;
                    break;
                }
                case 2: {
                    editAVItem();
                    choice = 5;
                    break;
                }
                case 3: {
                    deleteAVItem();
                    choice = 5;
                    break;
                }
                case 4: {
                    viewAllAVItem();
                    choice = 5;
                    break;
                }
                case 5: {
                    System.out.println("Exiting Menu");
                    quit = true;
                    break;
                }
                default: {
                    header.displayError(1, "Incorrect selection");
                    choice = mainMenu.displayAVMenu();
                    break;
                }
            }
        }
        return avItem;
    }
    public BorrowableItem JournalInputDialogue() {
        Journal journal = new Journal();

        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        header.displayHeader("Library", "Journal Menu");

        choice = mainMenu.displayJournalMenu();

        //Takes user input

        while (!quit) {

            switch (choice) {
                case 1: {
                    inputJournal();
                    choice = 5;
                    break;
                }
                case 2: {
                    editJournal();
                    choice = 5;
                    break;
                }
                case 3: {
                    deleteJournal();
                    choice = 5;
                    break;
                }
                case 4: {
                    viewAllJournals();
                    choice = 5;
                    break;
                }
                case 5: {
                    System.out.println("Exiting Menu");
                    quit = true;
                    break;
                }
                default: {
                    header.displayError(1, "Incorrect selection");
                    choice = mainMenu.displayJournalMenu();
                    break;
                }
            }
        }
        return journal;
    }

    //Book tools, adds, alters, removes and views all Book objects
    public void inputBook() {
        BorrowableItem borrowableitem;

        borrowableitem = bookInput.inputBookItem();

        itemList.add(borrowableitem);
    }
    public void editBook() {
        BorrowableItem BookToEdit = null;
        int BookID;
        BookView.displayAllBooks(itemList);
        BookID = bookInput.inputBookID();

        for(BorrowableItem s : itemList)
        {
            if(Objects.equals(BookID, s.getID()))
            {
                BookToEdit = s;
            }
        }

        BookView.displaySingleBook((Book) BookToEdit);
        bookInput.editBookItems(BookToEdit);
        Header.displayMessage("Book Edited");
    }
    public void deleteBook() {
        int BookID;
        BookView.displayAllBooks(itemList);
        BookID = bookInput.inputBookID();
        int index = 0;

        for(BorrowableItem s : itemList)
        {
            if(Objects.equals(BookID, s.getID()))
            {
                index = itemList.indexOf(s);
            }
        }

        itemList.remove(index);

        Header.displayMessage("Book Deleted");
    }
    public void viewAllBooks()  {
        BookView.displayAllBooks(itemList);
    }

    //Audio/Video tools, adds, alters, removes and views all Audio/Video objects
    public void inputAVItem() {
        BorrowableItem borrowableitem;

        borrowableitem = avInput.inputAVItem();

        itemList.add(borrowableitem);
    }
    public void editAVItem() {
        BorrowableItem AVItemToEdit = null;
        int AVItemID;
        AVItemView.displayAllAVItems(itemList);
        AVItemID = avInput.inputAVItemID();

        for(BorrowableItem s : itemList)
        {
            if(Objects.equals(AVItemID, s.getID()))
            {
                AVItemToEdit = s;
            }
        }

        AVItemView.displaySingleAVItem((AVItem) AVItemToEdit);
        avInput.editAVItems(AVItemToEdit);
        Header.displayMessage("Audio/Video Item Edited");
    }
    public void deleteAVItem() {
        int AVItemID;
        AVItemView.displayAllAVItems(itemList);
        AVItemID = avInput.inputAVItemID();
        int index = 0;

        for(BorrowableItem s : itemList)
        {
            if(Objects.equals(AVItemID, s.getID()))
            {
                index = itemList.indexOf(s);
                //studentList.remove(s);
            }
        }

        itemList.remove(index);

        Header.displayMessage("Audio/Video Item Deleted");
    }
    public void viewAllAVItem() {
        AVItemView.displayAllAVItems(itemList);
    }

    //Journal tools, adds, alters, removes and views all Journal objects
    public void inputJournal() {
        BorrowableItem borrowableitem;

        borrowableitem = journalInput.inputJournalItem();

        itemList.add(borrowableitem);
    }
    public void editJournal() {
        BorrowableItem JournalToEdit = null;
        int JournalID;
        JournalView.displayAllJournals(itemList);
        JournalID = journalInput.inputJournalID();
        for(BorrowableItem s : itemList) {
            if(Objects.equals(JournalID, s.getID())) {
                JournalToEdit = s;
            }
        }

        JournalView.displaySingleJournal((Journal) JournalToEdit);
        journalInput.editJournal(JournalToEdit);
        Header.displayMessage("Audio/Video Item Edited");
    }
    public void deleteJournal() {
        int JournalID;
        JournalView.displayAllJournals(itemList);
        JournalID = journalInput.inputJournalID();
        int index = 0;

        for(BorrowableItem s : itemList)
        {
            if(Objects.equals(JournalID, s.getID()))
            {
                index = itemList.indexOf(s);
            }
        }

        itemList.remove(index);

        Header.displayMessage("Journal Item Deleted");
    }
    public void viewAllJournals() {
        JournalView.displayAllJournals(itemList);
    }

    //View and search functions, allows viewing of input objects
    public void viewAllLibraryItems() {
        viewAllItems(itemList);
    }

    //User tool to search for an item on ID
    public void findItem() {
        BorrowableItem ItemToView = null;
        int ItemID;
        SummaryDataView.viewAllItems(itemList);
        ItemID = inputItemID();
        for (BorrowableItem s : itemList) {
            if (Objects.equals(ItemID, s.getID())) {
                ItemToView = s;
            }
        }
        SummaryDataView.displayItem(ItemToView);
    }

    //User specific tools, allows users to perform actions based on the current session
    public void viewTotal() {
        viewTotalCost(itemList);
    }

    //This starts the main program, starting at >runMainMenu()<
    public static void main(String[] args) {
        LibraryApplication la = new LibraryApplication();
        la.runMainMenu();
    }
}
//Current noted testing issues
//Program does will not output multiple entries if multiple