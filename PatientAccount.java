import java.util.*;

public class PatientAccount {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int phoneNumber;
    private String homeAddress;
    private final int userID;

    public PatientAccount(String firstName, String lastName, String password, String email, int phoneNumber, String homeAddress, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public int getUserID() {
        return userID;
    }

    public String getAccountDetails() {
        return "//// Account Details of Patient: " + userID +
        "\n// Name: " + firstName + " " + lastName +
        "\n// Email Address: " + email +
        "\n// Phone Number: " + phoneNumber +
        "\n// Home Address: " + homeAddress + "\n";
    }
}
