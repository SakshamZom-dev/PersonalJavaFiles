import java.util.Scanner;

public class CountOccourances2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int number = 11233235;
        System.out.println(number);

        System.out.println("Enter the value of the digit you want to find the occourances of?\t");
        int n = sc.nextInt();

        int count = 0;
        while (number > 0){
            int rem = number % 10;
            if(rem == n){
                count++;
            }
            number = number/10;
        }

        System.out.println(n + "\twas found\t" + count + "\ttimes");

        sc.close();
    }
}
