package com.client_service.client_service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public User createUser(String firstName, String lastNamePaternal, String lastNameMaternal, String documentId) {
        // Validar datos de usuario
        if (validateUserDetails(firstName, lastNamePaternal, lastNameMaternal, documentId)) {
            User user = new User(firstName, lastNamePaternal, lastNameMaternal, documentId);
            users.add(user);
            System.out.println("Usuario creado: " + user);
            return user;
        } else {
            throw new IllegalArgumentException("Datos del usuario no válidos.");
        }
    }

    public List<User> getAllUsers() {
        return users;
    }

    private boolean validateUserDetails(String firstName, String lastNamePaternal, String lastNameMaternal, String documentId) {
        // Validar que los datos no estén vacíos y que el documento de identidad tenga el formato correcto
        return !firstName.isEmpty() && !lastNamePaternal.isEmpty() && !documentId.isEmpty() && documentId.matches("\\d+");
    }
}
