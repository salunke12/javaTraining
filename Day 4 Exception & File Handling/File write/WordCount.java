import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String filename = "sample.txt"; // or any file you want to count words from
        int wordCount = 0;

        try {
            // Set up BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line by spaces (\\s+ matches one or more whitespace)
                String[] words = line.trim().split("\\s+");

                // Only count if line isn't empty
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close(); // Always close the reader

            System.out.println("Total word count in file \"" + filename + "\": " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
