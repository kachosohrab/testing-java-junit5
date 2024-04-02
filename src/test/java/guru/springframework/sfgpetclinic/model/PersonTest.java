package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void groupedAssertion() {
        Person person = new Person(1l, "King", "Kong");
        assertAll("Person Assertions",
            () -> assertTrue(person.getId() == 1l, "Id is not same"),
            () -> assertEquals(person.getFirstName(), "King", "First Name not same"),
            () -> assertEquals(person.getLastName(), "Kong", "Last Name not same")
        );
    }
}
