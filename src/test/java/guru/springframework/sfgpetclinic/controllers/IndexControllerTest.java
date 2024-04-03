package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import guru.springframework.sfgpetclinic.exceptions.ValueNotFoundException;


@Tag("controllers")
public class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void beforeEach() {
        indexController = new IndexController();
    }

    @DisplayName("Test Index")
    @Test
    void testIndex() {
        // assumeTrue("GU".equals("GUs"));
        assertEquals("index", indexController.index(), "Wrong view returned");
        
        assertNotEquals("indexController", indexController.index(), 
        () -> "These can not be same");
        
    }

    @DisplayName("Test Oups Handler")
    @Test
    void testOupsHandler() {
        // assertTrue("notimplemented".equals(indexController.oupsHandler()),
        // "This is not right");
        assertThrows(ValueNotFoundException.class, () -> {
            indexController.oupsHandler();
        },
        () -> "ValueNotFoundException is not raised");
    }
}
