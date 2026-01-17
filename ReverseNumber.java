import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.println("Enter the no. you want a reverse of:\t");
        int number = sc.nextInt();
        int rev = 0;

        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number/10;
        }
        System.out.println("\nThe reversed number of your given no. is: \n" + rev);
        
        sc.close();
    }    
}
