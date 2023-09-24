package practice13;

import java.io.*;
import java.util.Scanner;

public class FileTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation (1-5):");
            System.out.println("1. Write to file");
            System.out.println("2. Read information from file");
            System.out.println("3. Replace information in file");
            System.out.println("4. Append text to file");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Read the newline character after the number input

            switch (choice) {
                case 1:
                    writeToFile(scanner);
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    replaceInFile(scanner);
                    break;
                case 4:
                    appendToFile(scanner);
                    break;
                case 5:
                    System.out.println("Program is terminated.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void writeToFile(Scanner scanner) {
        System.out.println("Enter text to write to the file (type 'exit' to finish):");

        try (FileWriter fileWriter = new FileWriter("src/practice13/test.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Data has been successfully written to 'test.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try (FileReader fileReader = new FileReader("src/practice13/test.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            System.out.println("File contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceInFile(Scanner scanner) {
        System.out.println("Enter the text to replace in the file:");

        try (FileReader fileReader = new FileReader("src/practice13/test.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            System.out.println("Enter the text to replace:");
            String toReplace = scanner.nextLine();

            System.out.println("Enter the replacement text:");
            String replacement = scanner.nextLine();

            fileContent = new StringBuilder(fileContent.toString().replace(toReplace, replacement));

            try (FileWriter fileWriter = new FileWriter("src/practice13/test.txt");
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                bufferedWriter.write(fileContent.toString());
                System.out.println("Information has been successfully replaced in 'test.txt'");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(Scanner scanner) {
        System.out.println("Enter text to append to the end of the file (type 'exit' to finish):");

        try (FileWriter fileWriter = new FileWriter("src/practice13/test.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Data has been successfully appended to 'test.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

