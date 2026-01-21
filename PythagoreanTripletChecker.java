import java.util.Scanner;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter all the 3 numbers you want to know that are Pythagorean triplet or not:\t");

        System.out.println();
        System.out.print("Enter the first no.: \t");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second no.: \t");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter the third no.: \t");
        int c = sc.nextInt();
        
        System.out.println();
        System.out.print("Is the group Pythagorean triplet?\t" + isPythaTriplet(a, b, c));
        sc.close();
    }

    static boolean isPythaTriplet(int x, int y, int z){
        int m = x*x;
        int n = y*y;
        int o = z*z;
        if ((m + n) == o || (m + o) == n || (n + o) == m) return true;
        return false;
    }
}