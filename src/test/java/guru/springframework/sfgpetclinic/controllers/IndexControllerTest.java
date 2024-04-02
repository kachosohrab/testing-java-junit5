package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void beforeEach() {
        indexController = new IndexController();
    }

    @Test
    void testIndex() {
        assertEquals("index", indexController.index(), "Wrong view returned");
        assertNotEquals("indexController", indexController.index(), 
        () -> "These can not be same");
    }

    @Test
    void testOupsHandler() {
        assertTrue("notimplemented".equals(indexController.oupsHandler()),
        "This is not right");
    }
}
