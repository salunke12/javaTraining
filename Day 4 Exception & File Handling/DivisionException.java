
import java.util.Scanner;

public class DivisionException{
	public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
	    
	    try{
	        System.out.print("Enter numerator: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter denominator: ");
	        int num2 = scanner.nextInt();
	        
	        int result = num1/ num2;
	        System.out.println("Result of division: "+ result);
	        
	        // Array element access
	        int[] numbers = {10, 20, 30, 40, 50};
            System.out.print("Enter index to access from array: ");
            int index = scanner.nextInt();
	        
	    }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
	        System.out.println("Exception occured: "+ e.getMessage());
	    }finally{
	        scanner.close();
	    }
	}
}