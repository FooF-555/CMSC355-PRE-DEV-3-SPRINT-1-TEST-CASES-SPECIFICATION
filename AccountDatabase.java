import java.util.*;
import javax.sound.sampled.SourceDataLine;


public class AccountDatabase {
    //////////// Database field
    private ArrayList<Account> database;

    //////////// Constructor
    public AccountDatabase() {
        database = new ArrayList<>();
    }

    //////////// Add/Delete Functions
    public void addToDatabase(Account givenAccount) {
        database.add(givenAccount);
    }

    public void deleteFromDatabase(Account givenAccount) {
        for (Account account: database) {
            if (account.equals(givenAccount)) {
                database.remove(givenAccount);
                break;
            }
        }
    }

    //////////// Search Functions
    public void searchByUsername(String givenUsername) {
        for (Account account: database) {
            if (account.getUsername().equals(givenUsername)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByEmail(String givenEmail) {
        for (Account account: database) {
            if (account.getEmail().equals(givenEmail)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByPhoneNum(int givenPhoneNum) {
        for (Account account: database) {
            if (account.getPhoneNumber() == givenPhoneNum) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByHome(String givenHomeAddress) {
        for (Account account: database) {
            if (account.getHomeAddress().equals(givenHomeAddress)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByUserID(int givenID) {
        for (Account account: database) {
            if (account.getUserID() == givenID) {
                account.getAccountDetails();
                System.out.println();
            }
        } 
    }

    //////////// Other
    
    public void displayDatabase() {
        System.out.println("//////// Account Database ////////\n" +
                           "----------------------------------");
        for (Account account: database) {
            account.getAccountDetails();
            System.out.println();
        }
    }
}
