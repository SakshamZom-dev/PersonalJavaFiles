import java.util.Scanner;

public class CountOccourances {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 34, 53, 46, 34, 54, 56, 12, 34, 12, 12};
        for(int i : arr){
            System.out.print(i + ", ");
        }
        
        System.out.println("\n");
        System.out.println("Enter the value of the no. you want to find the occourances of: \t");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i : arr){
            if(i == n){
                count++;
            }
        }
        System.out.println(n + "\twas found\t" + count + "\ttimes");
        
        sc.close();
    }
}
