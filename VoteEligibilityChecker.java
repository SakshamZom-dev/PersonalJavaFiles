import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:\t");
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            voteEligibility(a);
        } else {
            System.out.println("That's not a valid number, bro.");
        }
        
        sc.close();
    }

    static void voteEligibility(int age) {
        if (age < 0) {
            System.out.println("Invalid age entered!");
        } 
        else if (age >= 18) {
            System.out.println("Eligible to vote!");
        } 
        else {
            System.out.println("Not eligible to vote yet. Wait " + (18 - age) + " more years!");
        }
    }
}