import java.util.*;

public class PatientAccount {
    // Patient Fields
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int age;
    private String gender;
    private String dateOfBirth; // In the form of MM/DD/YYYY
    private int phoneNumber;
    private String homeAddress;
    private final int userID;

    // Constructor
    public PatientAccount(String firstName, String lastName, String password, String email, int age, String gender, String dateOfBirth, int phoneNumber, String homeAddress, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.userID = userID;
    }

    /////// Getter Methods
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
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

    ///////////////////////////////////////////
    /// Getting patient details
    public String getAccountDetails() {
        return "//// Account Details of Patient: " + userID +
        "\n// Name: " + firstName + " " + lastName +
        "\n// Email Address: " + email +
        "\n// Age: " + age +
        "\n// Gender: " + gender +
        "\n// Date of Birth: " + dateOfBirth +
        "\n// Phone Number: " + phoneNumber +
        "\n// Home Address: " + homeAddress + "\n";
    }
}
