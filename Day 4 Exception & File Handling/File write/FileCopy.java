import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Define source and destination file names
        String sourceFile = "sample.txt";
        String destinationFile = "copy_sample.txt";

        try {
            // Set up BufferedReader for reading the source file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));

            // Set up BufferedWriter for writing to the destination file
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;

            // Read each line from source and write to destination
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // to preserve line breaks
            }

            // Close both streams
            reader.close();
            writer.close();

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
