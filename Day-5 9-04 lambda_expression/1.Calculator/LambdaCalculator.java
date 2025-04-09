import java.util.*;
interface Calculator{
    int calculate(int a, int b);
}

public class LambdaCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = sc.nextInt(); 
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt(); 
        Calculator addition = (a,b) -> a+b;
        System.out.println("Addition = " + addition.calculate(x, y));
        Calculator subtraction = (a,b) -> a-b;
        System.out.println("Subtraction = " + subtraction.calculate(x, y));
        Calculator multiplication = (a,b) -> a*b;
        System.out.println("Multiplication = " + multiplication.calculate(x,y));
        Calculator division = (a,b) -> {
            if(b==0) throw new ArithmeticException("Cannot divide by 0");
            return a/b;
        };
        System.out.println("Division = " + division.calculate(x, y));
        sc.close();
    }
}