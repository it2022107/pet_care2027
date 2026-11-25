package com.example.pet_care.core.model;

import java.io.File;
import java.time.Instant;

/**
 * TO BE CHANGED, NOT THE FINAL FORM, NOT EVEN CLOSE
 * these params are only for the purpose of the UI/log in,log out/register
 * Done before DB schema so params are not final
 */

public class Veterinarian {

    private Long id; // auto generated once db is implemented

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String expertise; //TODO change me to enum!!!!!!!!

    private String rawPassword;

    //Variables so that the vet can prove that he is a vet

    //Maybe to be changed, dk if File is the best data type for these

    private File photoOfId;

    private File photoOfLicence;

    private File PhotoOfDegree;

    private Instant createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public File getPhotoOfId() {
        return photoOfId;
    }

    public void setPhotoOfId(File photoOfId) {
        this.photoOfId = photoOfId;
    }

    public File getPhotoOfLicence() {
        return photoOfLicence;
    }

    public void setPhotoOfLicence(File photoOfLicence) {
        this.photoOfLicence = photoOfLicence;
    }

    public File getPhotoOfDegree() {
        return PhotoOfDegree;
    }

    public void setPhotoOfDegree(File photoOfDegree) {
        PhotoOfDegree = photoOfDegree;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Veterinarian(Long id, String firstName, String lastName, String email, String phoneNumber,
                        String expertise, String rawPassword, File photoOfId, File photoOfLicence,
                        File photoOfDegree, Instant createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.expertise = expertise;
        this.rawPassword = rawPassword;
        this.photoOfId = photoOfId;
        this.photoOfLicence = photoOfLicence;
        this.PhotoOfDegree = photoOfDegree;
        this.createdAt = createdAt;
    }

    public Veterinarian() {}

    @Override
    public String toString() {
        return "Veterinarian{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                ", expertise='" + expertise + '\'' +
                ", rawPassword='" + rawPassword + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
