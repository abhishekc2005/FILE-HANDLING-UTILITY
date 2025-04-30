import java.io.*;
import java.util.Scanner;

/*
 *Student Name-Abhishek Choudhary
 * Date-30/04/2025
 *
 *Internship Task 1 :
 * FileHandlingUtility
 * This Java program provides basic file operations:
 * 1. Writing to a file
 * 2. Reading from a file
 * 3. Modifying the contents of a file
  */
    class FileHandlingUtility {

    static Scanner scanner = new Scanner(System.in);

    // Write to a file
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }

    // Read from a file
    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Modify the file content (append new text)
    public static void modifyFile(String filename, String newText) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("\n" + newText);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }
    }

    // Main method to interact with the utility
    public static void main(String[] args) {
        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();

        System.out.println("Choose operation:\n1. Write\n2. Read\n3. Modify");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter text to write: ");
                String text = scanner.nextLine();
                writeFile(filename, text);
                break;
            case 2:
                readFile(filename);
                break;
            case 3:
                System.out.print("Enter text to append: ");
                String newText = scanner.nextLine();
                modifyFile(filename, newText);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
 /*How to run :
  *
  *Run the program
  * Enter the filename you want to work with
  * Choose an operation (1,2,or 3)as prompted
  */
