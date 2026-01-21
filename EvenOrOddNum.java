import java.util.Scanner;

public class EvenOrOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers bro, one by one");
        
        System.out.print("Enter the 1st no.:\t");
        int a = sc.nextInt();

        findEvenNum(a);
        sc.close();
    }

    static void findEvenNum(int n){
        if (n % 2 == 0) {
            System.out.println("The number is even");
        }
        else System.out.println("The number is odd");
    }
}