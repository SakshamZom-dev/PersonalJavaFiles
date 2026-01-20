public class ArmstrongFor3DigitNumbers {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.print("All the 3 digit no. which are armstrong numbers:\t");
        for (int i = 100; i < 1000; i++) {
            if (CheckArm(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    static boolean CheckArm (int n) {
        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem*rem*rem);
        }
        return (sum == orignal);
    }
}