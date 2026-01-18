import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
    }
    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return (sum == orignal);
    }
}
