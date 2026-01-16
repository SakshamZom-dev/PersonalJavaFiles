import java.util.Scanner;

public class firstproject {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char grade = 'A';
        String name = "Zom";

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        boolean isEven = (sum % 2 == 0);

        System.out.println("\n--- Results ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("Is the sum even? " + isEven);
        System.out.println("Your current grade is: " + grade);

        sc.close();
    }
}