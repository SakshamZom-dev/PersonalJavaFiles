import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers bro, one by one");
        
        System.out.print("Enter the 1st no.:\t");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd no.:\t");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd no.:\t");
        int c = sc.nextInt();
        
        System.out.println("The Max no. = \t"+ maxNum(a,b,c));
        System.out.println("The Min no. = \t"+ minNum(a,b,c));

        sc.close();
    }

    static int maxNum(int x, int y, int z){
        int Largest = x;
        if (x >= y && x >= z) {
            Largest = x;
        }
        else if (y >= x && y >= z) {
            Largest = y;
        }
        else {
            Largest = z;
        }
        return Largest;
    }

    static int minNum(int x, int y, int z){
        int Smallest = x;
        if (x <= y && x <= z) {
            Smallest = x;
        }
        else if (y <= x && y <= z) {
            Smallest = y;
        }
        else {
            Smallest = z;
        }
        return Smallest;
    }
}