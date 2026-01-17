import java.util.Scanner;

public class SimpleCalculatorSwitchCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.print("\nPlease Enter a valid operation among + - * /");
            System.out.print("\tand\tTo exit, input X: \t");

            char op = sc.next().charAt(0);
            
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                
                System.out.println("Write the first no. to use:");
                int a = sc.nextInt();

                System.out.println("Write the second no. to use:");
                int b = sc.nextInt();

                switch (op){
                    case ('+'):
                        System.out.println("Your answer for the addition is: \n" + (a+b));
                        break;
                    case ('-'):
                        System.out.println("Your answer for the subraction is: \n" + (a-b));
                        break;
                    case ('*'):
                        System.out.println("Your answer for the multiplication is: \n" + (a*b));
                        break;
                    case ('/'):
                        if (b != 0) System.out.println("Your answer for the division is: \n" + ((double)a / b));
                        else System.out.println("Error: Division by zero is not allowed.");
                        break;
                    }
                
            }
            else if (op == 'X' || op == 'x') {
                System.out.println("Thank you for using");
                break;
            }
            else System.out.println("Invalid Selection");
        }
        
        sc.close();
    }
}