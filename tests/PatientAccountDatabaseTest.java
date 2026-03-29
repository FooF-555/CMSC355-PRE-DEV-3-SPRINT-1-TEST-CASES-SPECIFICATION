package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import production.PatientAccount;
import production.PatientAccountDatabase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PatientAccountDatabaseTest {
    PatientAccountDatabase Db = null;
    PatientAccount acc = null;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void initDb(){
        Db = new PatientAccountDatabase();
        acc = new PatientAccount("first", "last", "pass", "mail", 2, "gen", "01/01/1900", 804808888, "123rd", 2);
        PrintStream ps = new PrintStream(output);
        System.setOut(ps);

    }

    @Test
    void addToDatabase() {
        Db.addToDatabase(acc);

        assertEquals(acc, Db.searchByFirstName("first"));
    }

    @Test
    void deleteFromDatabase() {
        Db.deleteFromDatabase(acc);
        assertNotEquals(acc, Db.searchByFirstName("first"));
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
        Db.addToDatabase(acc);
        ArrayList<PatientAccount> patientAccounts = Db.displayDatabase();
        assertEquals(acc, patientAccounts.get(0));

    }
}