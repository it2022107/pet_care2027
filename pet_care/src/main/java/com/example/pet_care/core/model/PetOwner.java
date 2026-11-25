package com.example.pet_care.core.model;

import java.time.Instant;

/**
 * To be changed, only created for ui (log in/log out) purposes
 * Pet owner params are to be changed
 * Created before the creation of db schema so it is to BE CHANGED !!!!!!!
 */

public class PetOwner {

    private Long id;  // auto generated once db is implemented

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String petName;

    private String petType; //TODO change me to enum!!!!!

    private String rawPassword;

    private Instant createdAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }


    public PetOwner(Long id, String firstName, String lastName,
                    String email, String phoneNumber, String petName,
                    String petType, String rawPassword,
                    Instant createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.petName = petName;
        this.petType = petType;
        this.rawPassword = rawPassword;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "PetOwner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", rawPassword='" + rawPassword + '\'' +
                '}';
    }
}
