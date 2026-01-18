// Variable Arguments

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        // You can pass as many integers as you want here
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);

        // Calling the second method with two ints and multiple Strings
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
    }

    // The '...' makes 'v' an array that collects all passed arguments
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // Integrated after fun():
    static void multiple(int a, int b, String ...v) {
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Variable Strings: " + Arrays.toString(v));
    }
}