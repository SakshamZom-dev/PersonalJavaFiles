import java.util.Scanner;

public class SimpleCalculatorEnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nPlease Enter a valid operation among + - * /");
            System.out.print("\tand\tTo exit, input X: \t");

            char op = sc.next().charAt(0);
            
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                
                System.out.println("Write the first no. to use:");
                int a = sc.nextInt();

                System.out.println("Write the second no. to use:");
                int b = sc.nextInt();

                switch (op) {
                    case '+' -> System.out.println("Addition: " + (a + b));
                    case '-' -> System.out.println("Subtraction: " + (a - b));
                    case '*' -> System.out.println("Multiplication: " + (a * b));
                    case '/' -> {
                        if (b != 0) System.out.println("Division: " + ((double)a / b));
                        else System.out.println("Error: Division by zero!");
                    }
                }
                
            } 
            else if (op == 'X' || op == 'x') {
                System.out.println("Thank you for using");
                break;
            } 
            else {
                System.out.println("Invalid Selection");
            }
        }
        
        sc.close();
    }
}