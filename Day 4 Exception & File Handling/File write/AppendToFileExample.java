import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        try {
            // FileWriter in append mode (true means append)
            FileWriter fw = new FileWriter("sample.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write to the file
            bw.write("\nAdded new text");
            bw.newLine(); // Optional: adds a new line

            // Close writers
            bw.close();
            fw.close();

            System.out.println("Appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
