import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number you want to know that is palindrome or not:\t");
        String a = sc.next();
        
        System.out.println(isPalindrome(a));
        sc.close();
    }

    static boolean isPalindrome(String a){
        int i = 0;
        int j = a.length() - 1;

        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}