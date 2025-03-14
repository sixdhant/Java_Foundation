package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) {
        // Static file path and directory path
        String filePath = "Test.txt";
        String dirName = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java\\Block\\";
        File file = new File(filePath);

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("File Name: " + file.getName());
            System.out.println("File Length: " + file.length() + " bytes");
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
        } else {
            System.out.println("File does not exist. Creating a new file...");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }

        // Write to file
        try (FileWriter writer = new FileWriter(file)) {
            String content = "Hello, this is a test file created by Java!";
            writer.write(content);
            System.out.println("Content written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Create a directory
        File dir = new File(dirName);
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        } else {
            System.out.println("Directory creation failed or already exists.");
        }

        // List files in current directory
        System.out.println("\nListing files in current directory:");
        File currentDir = new File(".");
        String[] files = currentDir.list();
        if (files != null) {
            for (String f : files) {
                System.out.println(f);
            }
        } else {
            System.out.println("No files found.");
        }

        // Rename file
        File renamedFile = new File("renamed_example.txt");
        if (file.renameTo(renamedFile)) {
            System.out.println("File renamed to: " + renamedFile.getName());
        } else {
            System.out.println("File rename failed.");
        }

        // Delete file
        if (renamedFile.delete()) {
            System.out.println("File deleted");
            
        }
        
    }
}