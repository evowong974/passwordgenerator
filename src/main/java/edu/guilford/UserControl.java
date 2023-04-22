package edu.guilford;

public class UserControl 
{
    public static void main( String[] args )
    {
    // Instantiate a User object with information provided by the user

    User user1 = new User("John", "Doe", "doe232@guilford.edu", "blue", 42, "dog");

    // Instantiate the second User object with information provided by the user

    User user2 = new User("Jane", "Sans", "sans@guilford.edu", "lavender", 13, "cat");

    // Print the first name, last name, email, favorite color, favorite number and favorite animal for the first and second User object

    System.out.println("The first name and last name for the first user is: " + user1.getFirstName() + " " + user1.getLastName() + " " + "\n" + "First user's email: " + user1.getEmail() + " " + "\n" + "First user's favorite color: " + user1.getFavoriteColor() + " " + "\n" + "First user's favorite number: " + user1.getFavoriteNumber() + " " + "\n" + "First user's favorite animal: " + user1.getFavoriteAnimal());
    
    System.out.println("The first name and last name for the second user is: " + user2.getFirstName() + " " + user2.getLastName() + " " + "\n" + "Second user's email: " + user2.getEmail() + " " + "\n" + "Second user's favorite color: " + user2.getFavoriteColor() + " " + "\n" + "Second user's favorite number: " + user2.getFavoriteNumber() + " " + "\n" + "Second user's favorite animal: " + user2.getFavoriteAnimal());
    


    // Generate the password for the first and second User objects based on their first name, last name, favorite color and favorite number
    
    String password1 = user1.generatePassword("John", "Doe", "doe232@guilford.edu", 12, "cat");

    String password2 = user2 .generatePassword("Jane", "Sans", "sans@guilford.edu", 13, "dog");


    // Encrypt the password for the first and second User object using the AES class

    String encryptedPassword1 = AES.encrypt(password1, "password");

    String encryptedPassword2 = AES.encrypt(password2, "password");


    // Print the password for the first User object and the second User object

    System.out.println("The password for the first user is: " + password1);

    System.out.println("The password for the second user is: " + password2);


    // Print the encrypted password for the first User object and the second User object

    System.out.println("The encrypted password for the first user is: " + encryptedPassword1);

    System.out.println("The encrypted password for the second user is: " + encryptedPassword2);


    // Print the decrypted password for the first User object and the second User object

    System.out.println("The decrypted password for the first user is: " + AES.decrypt(encryptedPassword1, "password"));

    System.out.println("The decrypted password for the second user is: " + AES.decrypt(encryptedPassword2, "password"));



    



    


    }
}
