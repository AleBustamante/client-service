package com.client_service.client_service;

public class User {

    private String firstName;
    private String lastNamePaternal;
    private String lastNameMaternal;
    private String documentId;

    public User(String firstName, String lastNamePaternal, String lastNameMaternal, String documentId) {
        this.firstName = firstName;
        this.lastNamePaternal = lastNamePaternal;
        this.lastNameMaternal = lastNameMaternal;
        this.documentId = documentId;
    }

    // Getters y setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamePaternal() {
        return lastNamePaternal;
    }

    public void setLastNamePaternal(String lastNamePaternal) {
        this.lastNamePaternal = lastNamePaternal;
    }

    public String getLastNameMaternal() {
        return lastNameMaternal;
    }

    public void setLastNameMaternal(String lastNameMaternal) {
        this.lastNameMaternal = lastNameMaternal;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastNamePaternal='" + lastNamePaternal + '\'' +
                ", lastNameMaternal='" + lastNameMaternal + '\'' +
                ", documentId='" + documentId + '\'' +
                '}';
    }
}
