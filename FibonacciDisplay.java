import java.util.Scanner;

public class FibonacciDisplay{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 1;

        System.out.println("Enter the limit bro: \t");
        int n = sc.nextInt();

        System.out.println();
        System.out.print(a + ", " + b + ", ");
        int i = 0;
        while (i < n - 2) {
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
            i++;
        }
        System.out.println();
        sc.close();

    }
}