import java.util.Scanner;

public class FindPrimesInBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter both numbers which you would like to identify prime numbers in between:\t");

        System.out.println();
        System.out.print("Enter the first no.: \t");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second no.: \t");
        int b = sc.nextInt();
                
        System.out.println();
        primesInBetween(a, b);
        sc.close();
    }

    static void primesInBetween(int x, int y){
        int start = Math.min(x, y);
        int end = Math.max(x, y);

        for (int i = start ;  i <= end ; i++){
            if (i <= 1) continue;

            boolean isPrime = true;
            int c = 2;
            while (c * c <= i){
                if (i % c == 0){
                    isPrime = false;
                    break;
                }
                c++;
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}