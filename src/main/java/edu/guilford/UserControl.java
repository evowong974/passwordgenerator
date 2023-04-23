package edu.guilford;

public class UserControl 
{
    public static void main( String[] args )
    {
    // Instantiate a User object with information provided by the user

    User user1 = new User();
    user1.obtainUser1Info();
    

    // Instantiate the second User object with information provided by the user

    User user2 = new User();
    user2.obtainUser2Info(); 

    
    // Generate the password for the first and second User objects based on their first name, last name, favorite color and favorite number
    
    user1.generatePassword();

    user2.generatePassword();

    // Print out the generated passwords for the first and second User objects

    System.out.println("\n" + "The password for the first user is: " + user1.getThePassword());

    System.out.println("The password for the second user is: " + user2.getThePassword());
    
    // Set the last 3 characters of the password as the secret key for encryption

    String secretPassword1 = user1.getThePassword().substring(user1.getThePassword().length() - 3);

    String secretPassword2 = user2.getThePassword().substring(user2.getThePassword().length() - 3);

    // Print out the two secret keys

    System.out.println("\n" + "The secret key for the first user is: " + secretPassword1);

    System.out.println("The secret key for the second user is: " + secretPassword2);



    // Encrypt the password for the first and second User object using the AES class
 
    String encryptPassword1 = AES.encrypt(user1.getThePassword(), secretPassword1);

    String encryptPassword2 = AES.encrypt(user2.getThePassword(), secretPassword2);


    // Print out the encrypted passwords for the first and second User objects

    System.out.println("\n" + "The encrypted password for the first user is: " + encryptPassword1);

    System.out.println("The encrypted password for the second user is: " + encryptPassword2);


    // Decrypt the password for the first and second User object using the AES class

    String decryptPassword1 = AES.decrypt(encryptPassword1, secretPassword1);

    String decryptPassword2 = AES.decrypt(encryptPassword2, secretPassword2);


    // Print the decrypted password for the first User object and the second User object

    System.out.println("\n" + "The decrypted password for the first user is: " + decryptPassword1);

    System.out.println("The decrypted password for the second user is: " + decryptPassword2);



    



    


    }
}
