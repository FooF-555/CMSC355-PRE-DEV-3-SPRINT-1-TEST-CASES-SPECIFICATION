package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import production.PatientAccount;
import production.PatientAccountDatabase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PatientAccountDatabaseTest {
    PatientAccountDatabase Db = null;
    PatientAccount acc = null;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void initDb(){
        Db = new PatientAccountDatabase();
        acc = new PatientAccount("first", "last", "pass", "mail", 2, "gen", "01/01/1900", 804808888, "123rd", 2);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

    }

    @Test
    void addToDatabase() {
        Db.addToDatabase(acc);
        Db.searchByFirstName("first");
        assertEquals(output.toString(), acc.getAccountDetails());
    }

    @Test
    void deleteFromDatabase() {
        Db.deleteFromDatabase(acc);
        assertEquals(Db.searchByFirstName("first"), "not found");
    }

    @Test
    void searchByFirstName() {
    }

    @Test
    void searchByLastName() {
    }

    @Test
    void searchByFullName() {
    }

    @Test
    void searchByEmail() {
    }

    @Test
    void searchByAge() {
    }

    @Test
    void searchByGender() {
    }

    @Test
    void searchByDOB() {
    }

    @Test
    void searchByPhoneNum() {
    }

    @Test
    void searchByHome() {
    }

    @Test
    void searchByID() {
    }

    @Test
    void displayDatabase() {
        PrintStream out = System.out;
        String expected = "//////// Patient Account Database ////////\n" +
                "----------------------------------";

    }
}