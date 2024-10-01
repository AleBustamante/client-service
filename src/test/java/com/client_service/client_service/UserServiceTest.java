package com.client_service.client_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateUser_success() {
        User user = userService.createUser("Juan", "Perez", "Lopez", "12345678");
        assertNotNull(user, "El usuario debería crearse correctamente.");
        assertEquals("Juan", user.getFirstName());
    }

    @Test
    public void testCreateUser_invalidDocumentId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser("Juan", "Perez", "Lopez", "abc123");
        });

        assertEquals("Datos del usuario no válidos.", exception.getMessage());
    }

    @Test
    public void testCreateUser_missingFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser("", "Perez", "Lopez", "12345678");
        });

        assertEquals("Datos del usuario no válidos.", exception.getMessage());
    }
}
