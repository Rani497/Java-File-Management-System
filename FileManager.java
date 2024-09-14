import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileManager {

    // Copy file
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Path.of(sourcePath);
        Path destination = Path.of(destinationPath);
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully.");
    }

    // Move file
    public static void moveFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Path.of(sourcePath);
        Path destination = Path.of(destinationPath);
        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved successfully.");
    }

    // Delete file
    public static void deleteFile(String filePath) throws IOException {
        Path file = Path.of(filePath);
        Files.deleteIfExists(file);
        System.out.println("File deleted successfully.");
    }

    // Main method for testing the functionalities
    public static void main(String[] args) {
        try {
            // Example usage
            String sourcePath = "source.txt";
            String destinationPath = "destination.txt";

            copyFile(sourcePath, destinationPath);  // Copy file
            moveFile(sourcePath, "moved.txt");      // Move file
            deleteFile(destinationPath);            // Delete file

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
