import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // File to read
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Reading from sample.txt:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: sample.txt");
            e.printStackTrace();
        }
    }
}
