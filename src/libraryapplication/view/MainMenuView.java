/* Authored By Nicholas Phillimore */
package libraryapplication.view;

import java.util.Scanner;

public class MainMenuView {

    public MainMenuView() {

    }

    //Method for displaying the main menu, dictates the text to be output
    public int displayMainMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Main Menu");
        System.out.println("");
        System.out.println("1. Book");
        System.out.println("2. Audio/Video");
        System.out.println("3. Journal");
        System.out.println("4. Display all items");
        System.out.println("5. Find item with ID");
        System.out.println("6. Calculate Cost");
        System.out.println("7. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    //Method for displaying the book menu, dictates the text to be output
    public int displayBookMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Book Menu");
        System.out.println("");
        System.out.println("1. Add item");
        System.out.println("2. Modify item");
        System.out.println("3. Remove item");
        System.out.println("4. View items");
        System.out.println("5. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    //Method for displaying the audio/video menu, dictates the text to be output
    public int displayAVMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Audio/Video Menu");
        System.out.println("");
        System.out.println("1. Add item");
        System.out.println("2. Modify item");
        System.out.println("3. Remove item");
        System.out.println("4. View items");
        System.out.println("5. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    //Method for displaying the journal menu, dictates the text to be output
    public int displayJournalMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Journal Menu");
        System.out.println("");
        System.out.println("1. Add item");
        System.out.println("2. Modify item");
        System.out.println("3. Remove item");
        System.out.println("4. View items");
        System.out.println("5. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }
    //Method for displaying the journal menu, dictates the text to be output
    public int displaySearchMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Search Menu");
        System.out.println("What type of item are you searching for?");
        System.out.println("");
        System.out.println("1. Books");
        System.out.println("2. Journals");
        System.out.println("3. Audio/Video");
        System.out.println("4. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }
}
