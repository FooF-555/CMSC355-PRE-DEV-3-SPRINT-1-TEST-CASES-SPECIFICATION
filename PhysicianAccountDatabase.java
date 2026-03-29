import java.util.*;
import javax.sound.sampled.SourceDataLine;


public class PhysicianAccountDatabase {
    //////////// Database field
    private ArrayList<PhysicianAccount> database;

    //////////// Constructor
    public PhysicianAccountDatabase() {
        database = new ArrayList<>();
    }

    //////////// Add/Delete Functions
    public void addToDatabase(PhysicianAccount givenAccount) {
        database.add(givenAccount);
    }

    public void deleteFromDatabase(PhysicianAccount givenAccount) {
        for (PhysicianAccount account: database) {
            if (account.equals(givenAccount)) {
                database.remove(givenAccount);
                break;
            }
        }
    }

    //////////// Search Functions
    public void searchByFirstName(String givenFirstName) {
        for (PhysicianAccount account: database) {
            if (account.getFirstName().equals(givenFirstName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByLastName(String givenLastName) {
        for (PhysicianAccount account: database) {
            if (account.getLastName().equals(givenLastName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByFullName(String givenFullName) {
        for (PhysicianAccount account: database) {
            if (account.getFullName().equals(givenFullName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByEmail(String givenEmail) {
        for (PhysicianAccount account: database) {
            if (account.getEmail().equals(givenEmail)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByPhoneNum(int givenPhoneNum) {
        for (PhysicianAccount account: database) {
            if (account.getPhoneNumber() == givenPhoneNum) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByID(int givenID) {
        for (PhysicianAccount account: database) {
            if (account.getPhysicianID() == givenID) {
                account.getAccountDetails();
                System.out.println();
            }
        } 
    }

    //////////// Other
    
    public void displayDatabase() {
        System.out.println("//////// Physician Account Database ////////\n" +
                           "----------------------------------");
        for (PhysicianAccount account: database) {
            account.getAccountDetails();
            System.out.println();
        }
    }
}

