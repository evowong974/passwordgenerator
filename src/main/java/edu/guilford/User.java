package edu.guilford;

public class User {
    // attributes
    private String firstName;
    private String lastName;
    private String email;
    private String favoriteColor;
    private int favoriteNumber;
    private String favoriteAnimal;

    // constructors
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.favoriteColor = "";
        this.favoriteNumber = 0;
        this.favoriteAnimal = "";


    }

    public User(String firstName, String lastName, String email, String favoriteColor, int favoriteNumber, String favoriteAnimal) { 
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favoriteColor = favoriteColor;
        this.favoriteNumber = favoriteNumber;
        this.favoriteAnimal = favoriteAnimal;
    }

    // getters and setters
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

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }


    // Write a generatePassword method that generates a password based on the user's favorite first name, last name, favorite color, favorite number, and favorite animal.
    public String generatePassword(String firstName, String lastName, String favoriteColor, int favoriteNumber, String favoriteAnimal) {
        // this method declares the variable "password" and assigns it
        // the value of the concatenation of the 
        // first letter of the user's first name, last name, favorite color, favorite number, and favorite animal.
        String password = this.firstName.substring(0, 1) + this.lastName.substring(0, 1) + this.favoriteColor.substring(0, 1) + favoriteNumber + this.favoriteAnimal.substring(0, 1);
        return password;

    }
    // Write a method that encrypts the user's password using the AES class.
    public String encryptPassword(String password) {
        // this method declares the variable "encryptedPassword" and assigns it
        // the value of the concatenation of the 
        // first letter of the user's first name, last name, favorite color, favorite number, and favorite animal.
        String encryptedPassword = AES.encrypt(password, "password");
        return encryptedPassword;

    }
    
    // Write a method that stores an encrypted version of the user's password whenever the user's password is generated.
    public String storePassword(String password) {
        // this method declares the variable "encryptedPassword" and assigns it
        // the value of the concatenation of the 
        // first letter of the user's first name, last name, favorite color, favorite number, and favorite animal.
        String encryptedPassword = this.firstName.substring(0, 1) + this.lastName.substring(0, 1) + this.favoriteColor.substring(0, 1) + favoriteNumber + this.favoriteAnimal.substring(0, 1);
        return encryptedPassword;


    }








    

}
