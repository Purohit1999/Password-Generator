import java.util.Random;
import java.util.Scanner;
/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */


/**
 * A Java program to generate a random password.
 * The program takes the desired password size from the user
 * and generates a secure random password of the specified length.
 */
public class PasswordGenerator {

    /**
     * Generates a random password of the specified size.
     *
     * @param size The length of the password to be generated.
     * @return A randomly generated password.
     */
    public static String generatePassword(int size) {
        // Collection of characters that can be used in the password
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
                + "!@#$%^&*()_-+=<>?/|{}[]~`;:'\"\\,.";

        // StringBuilder is used for better performance while appending characters
        StringBuilder password = new StringBuilder();

        // Create an object of the Random class
        Random random = new Random();

        // Loop to generate each character of the password
        for (int i = 0; i < size; i++) {
            // Generate a random index within the range of the characters string
            int index = random.nextInt(characters.length());

            // Append the character at the random index to the password
            password.append(characters.charAt(index));
        }

        // Convert StringBuilder to String and return the password
        return password.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the password
        System.out.print("Enter the desired password length: ");
        int size = scanner.nextInt();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Validate the input size to ensure it's reasonable
        if (size < 1) {
            System.out.println("Password length must be at least 1 character.");
            return;
        }

        // Call the generatePassword method to create the password
        String password = generatePassword(size);

        // Print the generated password to the console
        System.out.println("Generated Password: " + password);
    }
}

