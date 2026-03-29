package production;

import java.util.*;

public class PatientAccountDatabase {
    //////////// Database field
    private ArrayList<PatientAccount> database;

    //////////// Constructor
    public PatientAccountDatabase() {
        database = new ArrayList<>();
    }

    //////////// Add/Delete Functions
    public void addToDatabase(PatientAccount givenAccount) {
        database.add(givenAccount);
    }

    public void deleteFromDatabase(PatientAccount givenAccount) {
        for (PatientAccount account: database) {
            if (account.equals(givenAccount)) {
                database.remove(givenAccount);
                break;
            }
        }
    }

    //////////// Search Functions
    public String searchByFirstName(String givenFirstName) {
        for (PatientAccount account: database) {
            if (account.getFirstName().equals(givenFirstName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
        return "not found";
    }

    public void searchByLastName(String givenLastName) {
        for (PatientAccount account: database) {
            if (account.getLastName().equals(givenLastName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByFullName(String givenFullName) {
        for (PatientAccount account: database) {
            if (account.getFullName().equals(givenFullName)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByEmail(String givenEmail) {
        for (PatientAccount account: database) {
            if (account.getEmail().equals(givenEmail)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByAge(int givenAge) {
        for (PatientAccount account: database) {
            if (account.getAge() == givenAge) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByGender(String givenGender) {
        for (PatientAccount account: database) {
            if (account.getGender().equals(givenGender)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByDOB(String givenDOB) {
        for (PatientAccount account: database) {
            if (account.getDateOfBirth().equals(givenDOB)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByPhoneNum(int givenPhoneNum) {
        for (PatientAccount account: database) {
            if (account.getPhoneNumber() == givenPhoneNum) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByHome(String givenHomeAddress) {
        for (PatientAccount account: database) {
            if (account.getHomeAddress().equals(givenHomeAddress)) {
                account.getAccountDetails();
                System.out.println();
            }
        }
    }

    public void searchByID(int givenID) {
        for (PatientAccount account: database) {
            if (account.getUserID() == givenID) {
                account.getAccountDetails();
                System.out.println();
            }
        } 
    }

    //////////// Other
    
    public void displayDatabase() {
        System.out.println("//////// Patient Account Database ////////\n" +
                           "----------------------------------");
        for (PatientAccount account: database) {
            account.getAccountDetails();
            System.out.println();
        }
    }
}

