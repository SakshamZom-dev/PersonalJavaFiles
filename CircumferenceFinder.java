import java.util.Scanner;

public class CircumferenceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius:\t");
        double a = sc.nextDouble();

        System.out.println("The Circumference of the circle of the given radius is:\t " + findCircumference(a));
        sc.close();
    }

    static double findCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }
}