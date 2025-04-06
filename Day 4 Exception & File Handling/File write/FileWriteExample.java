
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("Sample.txt");
            
            writer.write("anything");
            
            writer.close();
            
            System.out.println("File written successfully.");
        }catch( IOException e ){
            System.out.println("an error occured while writing to the file.");
            e.printStackTrace();
        }
    }
}
