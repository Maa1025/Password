package password;

import java.util.Scanner; // library 

public class Password { // class 

    public static void main(String[] args) {
       // Declare variables
       String correctPassword = "Pass123"; // Define correct password
       int maxAttempts = 3; // Maximum number allowed attempts
       int attempts = 0; // Number of attempts 
       Scanner input = new Scanner(System.in);
       
       while (attempts < maxAttempts) {
           System.out.print("Enter your password: ");
           String userInput = input.nextLine(); // Get user input
           attempts++;
           
           // Check if the entered password is correct
           if (userInput.equals(correctPassword)) {
               System.out.println("Access successful");
               break; // Exit the loop if password is correct
           } else {
               System.out.println("Incorrect Password");
               if (attempts < maxAttempts) {
                   System.out.println("You have " + (maxAttempts - attempts) + " attempt(s) left.");
               }
           }
           
           // If the maximum number of attempts is reached
           if (attempts == maxAttempts) {
               System.out.println("You have used all your chances. Access denied.");
           }
       }
       
       input.close(); // Close the scanner
    }
}


