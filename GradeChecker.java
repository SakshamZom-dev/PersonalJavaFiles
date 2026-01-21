import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks out of 100:\t");
        double a = sc.nextDouble();
        
        System.out.println(checkGrade(a));
        sc.close();
    }

    static String checkGrade(double num){
                
        if (num < 100 && num > 0) {
            if (num >= 91) return ("A+");
            else if (num >= 81) return ("A");
            else if (num >= 71) return ("B+");
            else if (num >= 61) return ("B");
            else if (num >= 51) return ("C");
            else if (num >= 41) return ("D");
            else return ("Fail");
        }
        else return ("Enter a valid value from 0 - 100, Damnit");
    }
}