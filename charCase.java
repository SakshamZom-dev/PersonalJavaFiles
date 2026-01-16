import java.util.Scanner;

public class charCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        System.out.println("The character is:\t" + ch);
        System.out.println();

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase it is!");
        } else {
            System.out.println("It's Uppercase here!");
        }

        sc.close();
    }
}
