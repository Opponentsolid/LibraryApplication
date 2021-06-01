package libraryapplication.view;

//This code formats the programs headers based on the college and current screen
public class Header {
    public Header() {

    }

    public void displayHeader(String companyName, String screenName) {
        System.out.println("");
        System.out.println(companyName + "\t\t\t" + screenName);
        System.out.println("");
    }

    public void displayError(int errorNo, String errorMsg) {
        System.out.println("");
        System.out.println("Error No:" + errorNo + " - " + errorMsg);
        System.out.println("");

    }

    public static void displayMessage(String message) {
        System.out.println("");
        System.out.println(message);
        System.out.println("");
    }
}
