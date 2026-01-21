// Demofile (For Execution check & Testings)

import java.util.Scanner;

public class DemoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number till which you to find the sum:\t");
        int a = sc.nextInt();
        
        System.out.println();
        System.out.print("The Sum of natural numbers till\t" + a + " is: \t" + findSum(a));
        sc.close();
    }

    static int findSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}