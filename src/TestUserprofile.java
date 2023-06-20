/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Autobiography");
        System.out.println("4. Mystery");
        System.out.println("5. Based on true events");
        System.out.print("Enter the choice number: ");
        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String genre;
        if (genreChoice == 1) {
            genre = "Action";
        } else if (genreChoice == 2) {
            genre = "Comedy";
        } else if (genreChoice == 3) {
            genre = "Autobiography";
        } else if (genreChoice == 4) {
            genre = "Mystery";
        } else if (genreChoice == 5) {
            genre = "Based on true events";
        } else {
            genre = "Invalid choice";
        }

        System.out.println("User profile created:");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

