import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number you want to find the factorial of:\t");
        int a = sc.nextInt();
        
        System.out.println(displayFactorial(a));
        sc.close();
    }

    static long displayFactorial(int num){
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        long fact = 1;
        while (num > 1) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}