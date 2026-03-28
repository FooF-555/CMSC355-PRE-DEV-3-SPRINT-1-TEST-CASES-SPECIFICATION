import java.util.*;

public class Account {
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private String homeAddress;
    private final int userID;

    public Account(String username, String password, String email, int phoneNumber, String homeAddress, int userID) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.userID = userID;
    }

    //public void createAccount();

    public String getUsername() {
        return username;
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

    public void getAccountDetails() {
        System.out.println("/////// Account Details of User ///////" + userID +
        "\n// Username: " + username +
        "\n// Email Address: " + email +
        "\n// Phone Number: " + phoneNumber +
        "\n// Home Address: " + homeAddress + "\n");
    }
}
