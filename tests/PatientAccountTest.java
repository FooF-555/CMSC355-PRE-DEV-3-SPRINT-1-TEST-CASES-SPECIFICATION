package tests;

import static org.junit.jupiter.api.Assertions.*;
import production.*;

class PatientAccountTest {

    @org.junit.jupiter.api.Test
    void getAccountDetails() {
        PatientAccount acc = new PatientAccount("first", "last", "pass", "mail", 2, "gen", "01/01/1900", 804808888, "123rd", 2);

        assertEquals(2, acc.getUserID());
    }
}