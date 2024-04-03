package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Moe", "Green");
        owner.setCity("Kargil");
        owner.setTelephone("995566");

        assertAll("Person Tests",
        () -> assertAll("Person Properties",
                () -> assertTrue(owner.getId()==1l,  () -> "Id not same"),
                () -> assertEquals("Green", owner.getLastName(),() ->"Last Name not same"),
                () -> assertEquals(owner.getFirstName(), "Moe", () -> "First Name not same")),
        () -> assertAll("Owner Properties",
                () -> assertEquals("995566", owner.getTelephone(), () -> "Telephone Galat"),
                () -> assertEquals("Kargil", owner.getCity(), () -> "City Galat"))
        );
    }
}
